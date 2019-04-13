package com.apple_lab_1;

public class Main {

    public static void main(String[] args) {
        FTeam a = new FTeam("Динамо");
        FTeam b = new FTeam("Шахтар");
        FTeam c = new FTeam("Арсенал");
        FTeam d = new FTeam("Львів");
        FTeam e = new FTeam("Ворскла");
        FTeam f = new FTeam("Маріуполь");
        FTeam g = new FTeam("Чорноморець");
        FTeam h = new FTeam("Металіст");


        FTeam tour1 = FTeam.fight(a, b);
        FTeam tour2 = FTeam.fight(c, d);
        FTeam tour3 = FTeam.fight(e, f);
        FTeam tour4 = FTeam.fight(g, h);

        FTeam PoluFinal1 = FTeam.fight(tour1, tour2);
        FTeam PoluFinal2 = FTeam.fight(tour3, tour4);

        FTeam Final = FTeam.fight(PoluFinal1, PoluFinal2);

        Final.Print();
    }
}
