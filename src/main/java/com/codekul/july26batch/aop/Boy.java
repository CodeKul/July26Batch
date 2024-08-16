package com.codekul.july26batch.aop;

import org.springframework.stereotype.Component;

@Component
public class Boy {


    public int studyBoy(){
        System.out.println("In boys study");
        return 10;

    }

}
