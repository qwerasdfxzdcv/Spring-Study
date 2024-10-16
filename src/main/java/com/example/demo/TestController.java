package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 컨트롤러는 유저가 보는 곳
// request 유저가 요청하는 것
// response 우리가 유저에게 주는 것
// localhost 내 현재 주소
// localhost:8080/
// 내 컴퓨터에 http 통신 접근을 할 수 있게 도와주는 것: web server
// 내 컴퓨터에 http 통신 접근을 할 수 있게 해주고 통신을 도와주는 것: was (web application server) ex) 아파치 톰캣
// spring framework vs spring boot
// main 이 없음          main 이 있음
// spring framework 로 web 을 만들면 java 가 실행되는게 아닌 tomcat 이 실행되는 것
// spring framework 는 설정할게 굉장히 많다 -> xml 파일 많음
// framework -> 툴 , library -> 누군가 만들어둔 기능의 모음집
// 언어 - framework(제약사항 존재) - library(제약사항 없음) ex) js-react-recoil, java-spring-thymeleaf
// @ <- 간단한 annotation  을 사용 해주면서 구현을 숨기고 편히 사용할 수 있게해줌
// spring 의 3대 구성요소 psa id aop
// psa 서비스 추상화 (portable service abstraction)
// id  의존성 주입 (dependency injection), IoC 제어의 역전(Inversion of Control) IoC(spring bean) container
// aop 관점지향 (aspect oriented programing)

// bean <- 스프링 내부에서 관리하는 static
// bean 들을 모아놓은 곳 -> IoC 컨테이너 (spring bean 컨테이너)

// method : GET, POST
// GET <- body(X) url ? 데이터=asdf
// POST <- body(O) json:{데이터:"asdf"}
@Controller
public class TestController {
    // 의존성 주입 <- Bean 에서 꺼내 사용하는 것
    String test2;
    Student 학생;
    Data data;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
//      System.out.println(request.getRemoteAddr());
//      System.out.println(test2 + " " + 학생);
//      System.out.println(data.list);
//      data.list.add(new Student());
        model.addAttribute("student",학생);
        model.addAttribute("list",data.list);
        return "index";
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postStudent(HttpServletRequest request
            , @RequestParam String name, @RequestParam Integer age) {
        Student student = new Student(name, age);
        data.list.add(student);
        return "redirect:/";
    }
    // localhost8080:java
    @RequestMapping(value = "/java", method = RequestMethod.GET)
    public String java() {
        return "java";
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }
    public TestController(String test2, Student 학생, Data data) {
        this.test2 = test2;
        this.학생 = 학생;
        this.data = data;
    }
}
