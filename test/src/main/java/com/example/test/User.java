package com.example.test;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String email;
    private String password1;
    private String password2;
    public User(){
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword1(){
        return password1;
    }
    public void setPassword1(String password1){
        this.password1=password1;
    }
    public String getPassword2(){
        return password2;
    }
    public void setPassword2(String password2){
        this.password2=password2;
    }
}
