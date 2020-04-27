package com.vytrack.classNote;

public class ClassNote_April11 {

    /*
    Today is April 11, 2020
April 12 - Holiday, no class.
Tuesday - review excel + writing data into excel file.
Wednesday
	Agenda:
			BDD, TDD and DDT
			Cucumber BDD
############
Java - to write a code
Intellij IDE - where we write a code
Maven - project builder tool
Selenium WebDriver - tool for automating web-based applications.
TestNG - unit, system and e2e testing framework.
Behavior Driven Development (BDD)
Test Driven Development (TDD)
Behavior Driven Testing (BDT)
They are both about development and automated testing.
In both cases, tests will be written before development process/code implementation.
In case of TDD, we are dealing with raw code.
In case of BDD/BDT = it’s about testing the functionality from end-user perspective. So we are not dealing with raw code.
BDD it’s about UI point of view.
BDD != TDD
Java unit testing tools/frameworks: TestNG and JUnit.
To implement BDD in our test automation framework we gonna use Cucumber BDD.
Official website: https://cucumber.io/
Right click on src/test/java:
	create a package: com.vytrack
Right click on vytrack --> new -> package:
	 pages
	 utilities
	 runners
	 step_definitions
Right click on src/test --> new --> directory --> resources
right click on resources folder --> mark as --> test resources root folder
Right click on src/test/resources --> new --> directory --> features
package com.vytrack.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = “com/vytrack/step_definitions”,
        features = “src/test/resources/features”
)
public class CucumberRunner {
}
#####These 2 parameters are mandatory!#######
glue - path to the package with step definition methods.
features - path to the folder/directory with feature files.
mac		- preferences
windows - settings
REMEMBER!!! DON’T ADD SUBSTEPS PLUGIN! IF YOU HAVE IT - DELETE IT!
You need 2 plugins only:
Cucumber for Java -- by JetBrains
Gherkin 		  -- by JetBrains
After installation, restart an Intellij.
then ,all your feature files will have a green icon
if feature file icon is blue - delete substeps plugin
If feature file icon is gray, even after installing plugins:
Check Settings->Editor->File Types. Verify that Cucumber Scenario is set to a Registered Pattern of *.feature.
command + option + esc - force quit some program
control + alt + delete - right on program --> end task
How do we create feature files??
Right click on the features directory --> new --> file --> *.feature
#### User Gherkin by JetBrains
There is a chance that you intellij version is too old, and plugin cannot be installed. So you need to update intellij first.
     */
}
