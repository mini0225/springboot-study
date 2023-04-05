package com.study.springboot.web.controller;

import com.study.springboot.web.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ProductTestController {

    @GetMapping("/product/addition")
    public String loadAddition(){
        return "product/product_Add";
    }

//    @PostMapping("/api/product")
//    public String registerProduct(HttpServletRequest request){
//        System.out.println(request.getParameter("price"));
//        이렇게 받으면 price가 String으로 들오온다 price는 int값이므로 쓰려면 형변환 필요

//        return "product/product_view";
//    }


//    얘는 바로 지정해서 매개변수 설정해버리기때문에 형변환 따로 필요없음.
//    @RequestParam("변수명(name)이 들어온다")
//    변수명이랑 parameter값이 같으면 합칠수 있음.+annotation 생략 가능
//    @PostMapping("/api/product")
//    public String registerProduct(@RequestParam("productName") String pn, /*@RequestParam*/ int price){
//        System.out.println(pn);
//        System.out.println(price);
//
//        return "product/product_view";
//    }

    @PostMapping("/api/product")
    public String registerProduct(Model model, ProductDto productDto){
        model.addAttribute("productDto", productDto);

        System.out.println(productDto);
        System.out.println(productDto.getProductName());
        return "product/product_view";
    }


    @GetMapping("/product/addition2")
    public String loadAddition2(){
        return "product/product_add2";
    }

    @ResponseBody
    //데이터 응답시 필수, view가 필요없음.
    @PostMapping("/api/product/2")
    public String registerProduct(@RequestBody ProductDto productDto){ //데이터 전송이 json 형태일 경우 @RequestBody 필요

        System.out.println(productDto);

        return "productDto.toString";
    }
}
