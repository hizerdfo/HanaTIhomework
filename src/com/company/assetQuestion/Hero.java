package com.company.assetQuestion;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Hero {
    String name;
    int hp = 100;
    static int money;
    //Sword sword;

    public Hero(String name, int hp) {
        this.hp = 100;
        this.name = "noname";
    }

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    public Hero(int hp) {
        this.name = "noname";
        this.hp = hp;
    }

    public Hero() {
        this.name = "noname";
        this.hp = 100;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
/*
    public void attack(Kinoko enemy) {
        System.out.println(this.name + "의 공격!");
        this.hp -= 5;
        System.out.println("5포인트의 데미지를 주었다!");
    }*/

    public void run() {
        System.out.println(this.name + " 는 도망쳤다!");
    }

    static void setRandomMoney() {
        money = (int)(Math.random() * 1000.0D);
    }

    public void sit(int sec) {
    }

    public void slip() {
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }
}
