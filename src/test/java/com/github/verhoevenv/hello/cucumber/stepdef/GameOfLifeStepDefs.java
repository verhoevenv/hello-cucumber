package com.github.verhoevenv.hello.cucumber.stepdef;

import com.github.verhoevenv.hello.cucumber.gameoflife.GameOfLife;
import cucumber.api.PendingException;
import cucumber.api.java8.Nl;
import org.assertj.core.api.Assertions;

import static com.github.verhoevenv.hello.cucumber.gameoflife.GameOfLife.CelToestand.DOOD;
import static com.github.verhoevenv.hello.cucumber.gameoflife.GameOfLife.CelToestand.LEVEND;
import static junit.framework.TestCase.assertFalse;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GameOfLifeStepDefs implements Nl {

    private GameOfLife gameOfLife = new GameOfLife();
    private GameOfLife.CelToestand beginToestand;
    private int levendeBuren;
    private GameOfLife.CelToestand eindToestand;

    public GameOfLifeStepDefs() {
        Gegeven("^Een levende cel$", () -> {
            beginToestand = LEVEND;
        });

        Gegeven("^Een dode cel$", () -> {
            beginToestand = DOOD;
        });

        Gegeven("^hij heeft (\\d+) levende (?:buur|buren)$", (Integer buren) -> {
            levendeBuren = buren;
        });

        Als("^de volgende stap wordt berekend$", () -> {
            eindToestand = gameOfLife.volgendeToestand(beginToestand, levendeBuren);
        });

        Dan("^sterft de cel$", () -> {
            assertThat(eindToestand).isEqualTo(DOOD);
        });

        Dan("^overleeft de cel$", () -> {
            assertThat(eindToestand).isEqualTo(LEVEND);
        });

        Dan("^komt de cel tot leven$", () -> {
            assertThat(eindToestand).isEqualTo(LEVEND);
        });

        Dan("^blijft de cel dood$", () -> {
            assertThat(eindToestand).isEqualTo(DOOD);
        });
    }
}
