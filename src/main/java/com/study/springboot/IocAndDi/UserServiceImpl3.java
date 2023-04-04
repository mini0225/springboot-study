/*
    autowired 는 객체를 하나만 받는다 userServiceImpl2, 3이 각각 @component을
    달고 있어서 IOC 컨테이너에 2개가 있어서 뭘 들고 올지 몰라서 오류 발생
 */

package com.study.springboot.IocAndDi;


import org.springframework.stereotype.Component;

@Component("usi3")
/*
    @SpringBootApplication 안에 component를 읽는 annotation존재
    @component 달린애들을 IOC 컨테이너에 담아둔다

*/
public class UserServiceImpl3 implements UserService {

    @Override
    public void createUser() {
        System.out.println("사용자 등록3");
    }

    @Override
    public void getUser() {
        System.out.println("사용자 조회3");
    }

    @Override
    public void updateUser() {
        System.out.println("사용자 수정3");
    }

    @Override
    public void deleteUser() {
        System.out.println("사용자 삭제3");
    }
}
