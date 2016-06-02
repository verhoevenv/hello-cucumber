package com.github.verhoevenv.hello.cucumber.gameoflife;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue="com.github.verhoevenv.hello.cucumber.stepdef",
        plugin = "pretty"
)
public class GameOfLifeTest {
}
