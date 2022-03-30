package com.company;

public class GrandFather {
    private String name;
    private int age;
    private Proffesion proffesion;
    private  String hobby;

    public String getHobby() {
        return hobby;
    }

    public GrandFather(String hobby) {
        this.hobby = hobby;
    }

    public Proffesion getProffesion() {
        return proffesion;
    }




    public GrandFather(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public GrandFather(String name, int age, Proffesion proffesion, String hobby) {
        this.name = name;
        this.age = age;
        this.proffesion = proffesion;
        this.hobby = hobby;
    }

    public String getInfo(){
        return " name:"+name+" age:"+age;
    }

}
