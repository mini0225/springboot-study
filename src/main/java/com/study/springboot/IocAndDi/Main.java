package com.study.springboot.IocAndDi;


public class Main {

    private final UserService userService;

    public Main(UserService userService){
        this.userService = userService;
    }

    public void run(){
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();
    }

    //DI : 객체 지향적 개념, 의존성주입...  / 스프링에서는 자동주입
    public static void main(String[] args) {
        //싱글톤객체 static 메모리에 생성  => static 개념 ->IOC 개념으로 바뀜
        UserService userService = UserServiceImpl.getInstance();

        Main main = new Main(userService);
        main.run();
    }
}
