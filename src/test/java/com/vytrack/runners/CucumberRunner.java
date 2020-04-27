package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
//@RunWith => comes from Junit. It allows to have custom test configuration
//cucumber has it's own flow to run test - during runtime turns into executable test
//@CucumberOptions => stands for parameterization for test execution
//glue => trigger of cucumber test. Runner class needs to know where are step definition and feature file
//path to step definition, right click on step_definitions - copy from source root
//features => specifies path to the feature files right click on features - copy from content root

 */

/*
//our framework creates json file, some plugin takes jason file and generates a nice HTML report
//json looks like plain text, has "properties,values" , arrays,Strings,integers,
//json object vs java object
//json object has only properties no method; java object has both properties and methods
//We add json plugin => "json:target/cucumber.json" => to let it generate by our framework
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        glue="com/vytrack/step_definitions", //path to step_definitions
        features = "src/test/resources/features",//path to the folder with feature files
        dryRun = false, //true - to generate unimplemented step definitions before real test execution.
        strict = false, // true - enforce step definition implementation(to mark unimplemented steps as errors)
        tags = "@view_calendar_events",
        plugin = {
                "html:target/default-report",// this line will generate cucumber generated report
                "json:target/cucumber1.json",// we add json plugin to let it generate by our framework
                "rerun:target/rerun.txt" // this plug in will generate list of failed test scenarios.
        }
)

public class CucumberRunner {



}
