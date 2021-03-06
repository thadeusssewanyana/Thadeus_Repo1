package helper

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.{After, Before}
import org.junit.runner.RunWith
import utility.AbstractDriver

/**
  * Created by thadeus on 19/08/16.
  */

@RunWith(classOf[Cucumber])
@CucumberOptions(

  features= Array ("src/test/resources/feature"),
  tags=Array("@Login"),
  glue = Array("pageStepDef","pages","helper","utility"),

   plugin = Array("pretty","html:target/cucumber","json:target/cucumber.json")
)
class BaseRunner extends AbstractDriver{
@Before
 def setUP(): Unit ={
     initialize("firefox")
       }

  @After
 def closeBrowser(): Unit={
    driver.quit()
  }
}
