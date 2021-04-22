package com.cs.runners;

import com.cs.BaseRunner;
import cucumber.api.CucumberOptions;

@CucumberOptions
        (features = "src/test/resources/features/test_task_for_CS/")

public class CSTestSuite extends BaseRunner {
}
