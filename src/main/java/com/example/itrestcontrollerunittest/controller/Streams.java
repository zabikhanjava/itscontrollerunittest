package com.example.itrestcontrollerunittest.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;

public class Streams {

  public static void main(String[] args) {

    List<Integer> somegoodList = Arrays.asList(2, 1, 4, 1, 2, 4);
    Streams streams = new Streams();
    streams.filterSomeGoodCountList(somegoodList);

  }

  public void countSomegoodList(List somegoodList) {
    long somegoodListCount = somegoodList.stream().count();
    System.out.println(somegoodListCount);

  }

  public void distinctsomeGoodCountList(List somegoodList) {
    List<Integer> someGoodCountDistinctList = somegoodList.stream().distinct().toList();
    System.out.println(someGoodCountDistinctList);

  }

  public void filterSomeGoodCountList(List<Integer> somegoodList) {
    List filterSomeGoodCountList = somegoodList.stream().filter(listConent -> listConent / 3 == 0).toList();
    System.out.println(filterSomeGoodCountList);

  }

  public void allMatchSomegoodList(List<Integer> somegoodList) {
    boolean allMatchSomegoodList = somegoodList.stream().allMatch(listConent -> listConent / 3 == 0);
    System.out.println(allMatchSomegoodList);

  }

  public void streamsFindFirst() {
    List<Integer> listToFindFirst = Arrays.asList(3, 5, 7, 9, 11);

    Optional<Integer> optionallistToFindFirstFound = listToFindFirst.stream().findFirst();

    if (optionallistToFindFirstFound.isPresent()) {
      System.out.println(optionallistToFindFirstFound.get());
    } else {
      System.out.println("no value");
    }
  }
}