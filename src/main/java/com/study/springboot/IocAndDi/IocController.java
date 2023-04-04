package com.study.springboot.IocAndDi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IocController {

    //멤버변수(userService) 생성
    @Autowired //IOC컨테이너 스캔해서 들고와줌
    //@component 가 2개 이상일경우, @Autowired(required = false) 를 달아준다...하지만 nullpointException오류 발생
    //객체 구현이 안되어 있는 경우 임시로 넘기기 위해 사용, 다른거 부터 확인할때
    @Qualifier("usi3") //component를 IOC에 등록할때 별명(?)을 같이 달아주면 이렇게 끌어오기 가능.
    private UserService userService;

    /*
    원래 이게 있어야 함. autowired가 대신함.
    public IocController(UserServiceImpl2 userService) {
        this.userService = userService;
    }

    */

    @ResponseBody
    @GetMapping("/ioc")
    public String iocTest(){
//원래는 멤버변수 객체가 생성되어야 아래 가능
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();

        return null;
    }
}
