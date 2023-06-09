package com.study.springboot.web.controller;

import com.study.springboot.web.dto.RequestStudyDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Objects;

@Controller
public class ControllerStudy {

    //page 띄우는 용도
    //절대 경로 에는 '/'가 붙는다
    //return 에서 페이지 띄울때는(html 파일명)에는 붙이지 않는다.
    @GetMapping("/study/page")
    public String 페이지응답(){
        return "page_study";
    }

    //@ResponseBody 는 return 값을 페이지에 띄운다, 데이터만 응답하기 위해서는 필수
    @ResponseBody
    @GetMapping("/study/text/1")
    public String 문자열데이터응답(){
         return "문자열을 응답";
    }

    //이거는 GetMapping이니까 주소창에다가 data1, data2를 써줘야함 안써주면 null값으로 뜬다.
    //ex) localhost:8000/study/text/2?data1=안녕&data2=안녕
    @ResponseBody
    @GetMapping("/study/text/2")
    public String 요청데이터Params(String data1, String data2){
        return "문자열 : " + data1 + ", 숫자 : " + data2;
    }

    //ex)localhost:8000/study/text/3?name=%EB%AF%BC&email=aaa@aaa.com&address=%EA%B8%88%EA%B3%A1%EB%8F%99
    //requestDto 값을 다 입력해주면 웹페이지에 띄울수 있음.
    @ResponseBody
    @GetMapping("/study/text/3")
    public String 요청데이터Obj(RequestStudyDto requestStudyDto){
        return requestStudyDto.toString(); //return 값 설정(반환타입) String이라서 형변환 필요
    }


    @ResponseBody
    @PostMapping("/study/student/1")
    public String getJsonAjax(@RequestBody RequestStudyDto requestStudyDto){
        //@RequestBody 가 달리면 Json으로 데이터를 받는다, 없으면 못받음 null 값
        return requestStudyDto.toString(); //=response
    }

//    //ajax 에 json 으로 응답하기
//    @ResponseBody
//    @GetMapping("/study/student/2")
//    public Object getJsonAjax2 (){
//        //반환타입 Object
//        //@ResponseBody + Object 인경우 자동으로 json으로 응답(response Headers), String 은 그냥 string
//        RequestStudyDto requestStudyDto = new RequestStudyDto();
//        requestStudyDto.setName("bbb");
//        requestStudyDto.setEmail("bbb@bbb.com");
//        requestStudyDto.setAddress("bbb");
//
//        return requestStudyDto;
//    }

    @ResponseBody
    @GetMapping("/study/student/2")
    public ResponseEntity<?> getJsonAjax2 (){

        RequestStudyDto requestStudyDto = new RequestStudyDto();
        requestStudyDto.setName("bbb");
        requestStudyDto.setEmail("bbb@bbb.com");
        requestStudyDto.setAddress("bbb");

        return new ResponseEntity<>(requestStudyDto, HttpStatus.OK);
    }
}
