package com.example.tut.tut;

public class Alien {
    private int aid;
    private String  aname;
    private String tech;
    public void setAid(int aid) {
        this.aid = aid;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    public int getAid() {
        return aid;
    }
    public String getAname() {
        return aname;
    }
    public String getTech() {
        return tech;
    }

    public void show(){
        System.out.println("show");
    }

}
