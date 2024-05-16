package com.automation.utils;

import com.automation.steps.BaseStefDef;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseStefDef {

  @Before
  public void beforeScenario() {
    System.out.println("Inside beforeScenario");
    initDriver();
  }

  @After
  public void afterScenario() throws InterruptedException {
    System.out.println("Inside afterScenario");
    Thread.sleep(5000);
    driver.close();
  }
}
