/* Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */

public class makeAbba{
  public static String makeAbba(String a, String b) {
  return a + b + b + a;
}
  public static String main(String [] args){
    return makeAbba("Hi", "Bye"); /* → "HiByeByeHi" */
    return makeAbba("Yo", "Alice"); /* → "YoAliceAliceYo" */
    return makeAbba("What", "Up"); /* → "WhatUpUpWhat" */
    }
}
