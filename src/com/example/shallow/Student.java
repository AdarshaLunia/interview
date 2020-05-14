/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.shallow;

public class Student implements Cloneable {
    String name;
    Subject subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student(String name, String subject) {
        this.name = name;
        this.subject = new Subject(subject);
    }

    // Shawllow Copy
/*    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(name, subject.getName());
    }
}
