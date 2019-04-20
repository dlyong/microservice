package com.dlyong.provider.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="user",schema = "public")
@JsonIgnoreProperties(value = "hibernateLazyInitializer")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private String id;
    @Column
    private String userName;
    @Column
    private Integer age;
    @Column
    private String mail;
}
