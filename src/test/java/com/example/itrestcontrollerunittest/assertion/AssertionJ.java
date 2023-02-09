package com.example.itrestcontrollerunittest.assertion;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

public class AssertionJ {

  @Test
  public void somesxas() {
    char[] s = RandomStringUtils.random(10).toCharArray();
    System.out.println(s);
    Integer intNumber = 9;
    int[] array = {10, 89, 90};
    Arrays.stream(array);
    List<Integer> assertionList = List.of(12, 90);
    String someString = "hello g";
    assertThat(intNumber).isOdd();
    assertThat(array).contains(90);
    assertThat(array).containsExactly(10, 89, 90);
    //assertThat(array).containsExactly(89, 90, 10);
    assertThat(array).containsAnyOf(11, 80, 90);
    assertThat(array).containsAnyOf(11, 80, 90);
    assertionList.stream().map(x-> x.toString()).toList();
    assertThat(assertionList).anyMatch(x->x.equals(12));
    assertThat(assertionList).contains(12);
   // assertThat(assertionList).containsExactly(12, 90, 91);
    assertThat(assertionList).isEmpty();
    //assertThat(assertionList).
  }
}
