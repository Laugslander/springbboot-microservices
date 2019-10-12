package com.jbag.services;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ColorFactory {

    private String[] colors = new String[]{"white", "orange", "blue", "green", "purple", "black"};

    public String getColor() {
        int i = new Random().nextInt(colors.length - 1);
        return colors[i];
    }
}
