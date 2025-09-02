package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "WorldA";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
  
  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "WorldB";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "WorldC";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
