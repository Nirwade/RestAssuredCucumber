package JunitSuit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;                          //To use RunWith annotation/runner class
                                                          //we need to add JunitPlatform runner dependency in POM.xml

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
@SelectPackages({"packageA","packageB" ,"Junit"})
@IncludeTags("Sanity")
public class RunnerClass {
	

}
