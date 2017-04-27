package NopCommarceBook;

/**
 * Created by Dell on 23/04/2017.
 */

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = ".",format = "html:target/CucumberReport",tags = "@book")
public class RunTest{

}
