package com.dlyong.consumer.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String id;
    private String userName;
    private Integer age;
    private String mail;
}
