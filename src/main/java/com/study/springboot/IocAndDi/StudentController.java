package com.study.springboot.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
    controller annotation 도 component annotation을 받는다
    => controller annotation 을 달아도 IOC 등록
    => IOC에 등록되는 bean 들은 component annotation 이다.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private Test1 t1;

    @Autowired
    private Test2 t2;

    @ResponseBody
    @GetMapping("/student")
    public String printStudent(){
        Student student = Student.builder()
                .studentId(2009)
                .studentName("경민")
                .build();

        t1.print();
        t2.print();

        studentService.printStudentInfo(student);

        return null;
    }
}
