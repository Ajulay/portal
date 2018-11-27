package com.example.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class ShortGunImpl implements Shortgun {

    @Autowired
    private Bullet bullet;
    
    public void doShot() {
        System.out.println("Выстрел!");
        bullet.processing();
    }

}
