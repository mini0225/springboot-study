package com.study.springboot.web.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestStudyDto {

    private String name;
    private String email;
    private String address;

}
