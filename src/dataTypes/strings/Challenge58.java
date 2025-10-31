/*
    String-1 > makeAbba
    Given two strings, a and b, return the result of putting them together in the order abba, 
    e.g. "Hi" and "Bye" returns "HiByeByeHi".

    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"
 */
package dataTypes.strings;

public class Challenge58 {
 
    public String makeAbba(String a, String b){

        return a + b + b + a;
    }

    public static void main(String[] args){

        Challenge58 ch = new Challenge58();

        System.out.println(ch.makeAbba("Hi", "Bye"));
        System.out.println(ch.makeAbba("Yo", "Alice"));
        System.out.println(ch.makeAbba("What", "Up"));
    }
}
