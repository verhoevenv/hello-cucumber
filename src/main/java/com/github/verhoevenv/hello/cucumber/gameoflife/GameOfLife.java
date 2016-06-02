package com.github.verhoevenv.hello.cucumber.gameoflife;

import static com.github.verhoevenv.hello.cucumber.gameoflife.GameOfLife.CelToestand.DOOD;
import static com.github.verhoevenv.hello.cucumber.gameoflife.GameOfLife.CelToestand.LEVEND;

public class GameOfLife {
    public enum CelToestand {
        DOOD, LEVEND
    }
    public CelToestand volgendeToestand(CelToestand voor, int aantalBuren) {
        if(voor == LEVEND && aantalBuren < 2) return DOOD;
        if(voor == LEVEND && aantalBuren >= 4) return DOOD;
        if(voor == LEVEND && aantalBuren >= 2 && aantalBuren < 4) return LEVEND;
        if(voor == DOOD && aantalBuren == 3) return LEVEND;

        return DOOD;
    }
}
