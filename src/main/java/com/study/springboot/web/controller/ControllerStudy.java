package com.study.springboot.web.controller;

import com.study.springboot.web.dto.RequestStudyDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Objects;

@Controller
public class ControllerStudy {

    @GetMapping("/study/page")
    public String 페이지응답(){
        return "page_study";
    }

    //@ResponseBody 는 return 값을 페이지에 띄운다
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

    @ResponseBody
    @GetMapping("/study/text/3")
    public String 요청데이터Obj(RequestStudyDto requestStudyDto){
        return requestStudyDto.toString(); //return 값 설정 String이라서 형변환 필요
    }


    @ResponseBody
    @PostMapping("/study/student/1")
    public String getJsonAjax(@RequestBody RequestStudyDto requestStudyDto){
        //@RequestBody 가 달리면 Json으로 데이터를 받는다
        return requestStudyDto.toString();
    }

    //ajax 에 json 으로 응답하기
    @ResponseBody
    @GetMapping("/study/student/2")
    public Object getJsonAjax2 (){
        //반환타입 Object

        RequestStudyDto requestStudyDto = new RequestStudyDto();
        requestStudyDto.setName("bbb");
        requestStudyDto.setEmail("bbb@bbb.com");
        requestStudyDto.setAddress("bbb");

        return requestStudyDto;
    }
}
