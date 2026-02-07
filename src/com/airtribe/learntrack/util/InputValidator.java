package com.airtribe.learntrack.util;

public class InputValidator {
  public static boolean isValidName(String name)
  {
    return name!=null&&!name.trim().isEmpty();
  }
  public static boolean isPositive(int n)
  {
    return n>0;
  }
}
