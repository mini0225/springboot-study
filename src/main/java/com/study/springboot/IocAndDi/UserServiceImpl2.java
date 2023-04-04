package com.study.springboot.IocAndDi;


import org.springframework.stereotype.Component;

@Component("usi2")
/*
    @SpringBootApplication 안에 component를 읽는 annotation존재
    @component 달린애들을 IOC 컨테이너에 담아둔다

*/
public class UserServiceImpl2 implements UserService {

    @Override
    public void createUser() {
        System.out.println("사용자 등록2");
    }

    @Override
    public void getUser() {
        System.out.println("사용자 조회2");
    }

    @Override
    public void updateUser() {
        System.out.println("사용자 수정2");
    }

    @Override
    public void deleteUser() {
        System.out.println("사용자 삭제2");
    }
}
