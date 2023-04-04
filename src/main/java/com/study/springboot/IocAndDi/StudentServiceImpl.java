package com.study.springboot.IocAndDi;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
    service annotation 도 component annotation을 받는다
    => service annotation 을 달아도 IOC 등록
    => IOC에 등록되는 bean 들은 component annotation 이다.
 */

//@Component
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void printStudentInfo(Student student) {
        System.out.println("학번 : " + student.getStudentId());
        System.out.println("이름 : " + student.getStudentName());
    }
}
