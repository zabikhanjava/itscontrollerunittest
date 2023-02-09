package com.example.itrestcontrollerunittest.assertion;

//import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

public class HamcrestAssertions {
  @Test
  public void somesxas() {

    assertEquals(true, true);
   // assertThat(true).isEqualTo(true);
    assertThat("ACTUAL", equalTo("EXPECTED"));  }
}
