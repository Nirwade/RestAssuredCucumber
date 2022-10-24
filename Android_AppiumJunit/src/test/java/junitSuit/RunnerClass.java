package junitSuit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
@IncludeTags("Sanity")
@IncludePackages({"packageA","packageB","junit"})
public class RunnerClass {
	
	

}
