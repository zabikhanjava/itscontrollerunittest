package com.example.itrestcontrollerunittest.learnbeanspringconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class MyCondition implements Condition {
 @Override
 public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
  return true;
 }
}
