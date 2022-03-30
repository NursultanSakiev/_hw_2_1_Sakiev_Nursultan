package com.company;

public final class Son extends Father{
    private String colourOfHair;
    public Son(String name, int age, Proffesion proffesion, String hobby, String nameOfWife,String colourOfHair) {
        super(name, age, proffesion, hobby, nameOfWife);
        this.colourOfHair=colourOfHair;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" colourOfHair: "+colourOfHair;
    }
}
