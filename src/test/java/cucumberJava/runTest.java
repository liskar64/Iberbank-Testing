package cucumberJava;

/**
 * Created by Ibermatica on 05/05/2017.
 */

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber","json:target/cucumber.json"})

public class runTest { }


