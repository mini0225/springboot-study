package com.study.springboot.IocAndDi;

public class UserServiceImpl implements UserService {

    /*
        싱글톤 특징
        1. 생성자 private
        2. getInstance method  // static
        3. 자기자신의 클래스 자료형을 가지는 변수 instance 필요
     */

    private static UserServiceImpl instance = null;
    private UserServiceImpl(){}
    public static UserServiceImpl getInstance(){
        if(instance==null){
            instance = new UserServiceImpl();
        }
        return instance;
    }

    @Override
    public void createUser() {
        System.out.println("사용자 등록");
    }

    @Override
    public void getUser() {
        System.out.println("사용자 조회");
    }

    @Override
    public void updateUser() {
        System.out.println("사용자 수정");
    }

    @Override
    public void deleteUser() {
        System.out.println("사용자 삭제");
    }
}
