package com.company;

public class Father extends GrandFather {
    private String nameOfWife;

    public void makeVoice(String voice){
        System.out.println(voice);
    }





    public Father(String name, int age, String nameOfWife) {
        super(name, age);
        this.nameOfWife = nameOfWife;
    }

    public Father(String name, int age, Proffesion proffesion, String hobby, String nameOfWife) {
        super(name, age, proffesion, hobby);
        this.nameOfWife = nameOfWife;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " nameOfwife" + nameOfWife +" proffesion:"+ getProffesion()+" hobby"+getHobby();
    }
}
