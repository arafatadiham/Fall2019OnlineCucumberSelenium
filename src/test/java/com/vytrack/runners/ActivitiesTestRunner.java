package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            glue="com/vytrack/step_definitions", //path to step_definitions
            features = "src/test/resources/features/activities",//path to the folder with feature files
            dryRun = false, //true - to generate unimplemented step definitions before real test execution.
            strict = false, // true - enforce step definition implementation
            tags = "@activities",
            plugin = {
                    "html:target/default-report",// this line will generate cucumber generated report
                    "json:target/cucumber2.json"// we add json plugin to let it generate by our framework
            }
    )

    public class ActivitiesTestRunner {



    }




