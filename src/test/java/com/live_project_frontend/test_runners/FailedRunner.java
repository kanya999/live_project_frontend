package com.live_project_frontend.test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"src/test/java/com/live_project_frontend/step_definitons"},
        plugin = {"pretty", "html:target/failed-tests/rerun-cucumber-report.html",
                "rerun:target/failed-tests/failed.txt"}
)
public class FailedRunner {
}
