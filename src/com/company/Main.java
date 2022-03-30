package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Father father = new Father("Japar",50, Proffesion.ENERGETIK,":reading ",":Gulnara ");
        father.makeVoice("i am dad");
        System.out.println(father.getInfo());
        System.out.println("_________________________________________");

Son son=new Son("Nursultan",22,Proffesion.STUDENT,":play footbal","Madina","black");
        son.makeVoice(" i am first sun");
        System.out.println(son.getInfo());
        System.out.println("_________________________________________");

        Son son1=new Son("Arslan",18,Proffesion.STUDENT," :singing","do not have","dark black");
        son1.makeVoice("i am second con");
        System.out.println(son1.getInfo());
    }
}