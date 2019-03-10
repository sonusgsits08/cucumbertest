package cucumbertest;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"},tags="@blogspot") 

public class RunTest { }