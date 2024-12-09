package com.abhirampjayan.demo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private int rollNol;
    private String name;
    private int marks;

    public int getRollNol() {
        return rollNol;
    }

    public void setRollNol(int rollNol) {
        this.rollNol = rollNol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
