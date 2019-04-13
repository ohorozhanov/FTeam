package com.apple_lab_1;

public class FTeam {
    long strength;
    String name;
    FTeam(String name){
        this.name = name;
        this.strength = Math.round(Math.random() * 100);
    }

    static FTeam fight(FTeam team1, FTeam team2) {
        return team1.strength > team2.strength ? team1 : team2;
    }

    void Print(){
        System.out.println(this.name);
    }
}
