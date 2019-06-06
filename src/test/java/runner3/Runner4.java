package runner3;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature3", glue={"stepdef3" },tags = { "@sanity" },
plugin={"json:report3/case.json"})

public class Runner4 {

	
}
