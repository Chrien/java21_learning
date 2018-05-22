package com.java21days;

class EqualsTester {
    public static void main (String[] arguements) {
        String str1, str2;
        str1 = "Boy, that escalated quickly.";
        str2 = str1;
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + str1 == str2);
        
        str2 = new String(str1);
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + str1 == str2);
        System.out.println("Same value? " + str1.equals(str2));
    }
}