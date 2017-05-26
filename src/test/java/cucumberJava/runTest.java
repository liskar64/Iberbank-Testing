package cucumberJava; /**
 * Created by Ibermatica on 05/05/2017.
 */

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber","json:target/cucumber.json"})

public class runTest { }


