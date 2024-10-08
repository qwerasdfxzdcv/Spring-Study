package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// 클래스 위의 @Component 가 생성해서 bean 으로 관리한다.
@Component // 클래스를 가져다 사용할때 적어둬야 함
public class Data {
    public List<Student> list;
    public Data(){
        this.list = new ArrayList<>();
    }
}
