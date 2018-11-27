package com.example.portal;

import org.springframework.stereotype.Component;

@Component
public class BulletImpl implements Bullet{
    public void processing(){
        System.out.println("Бух!!!");
    }
}
