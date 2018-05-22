package com.java21days;

import java.util.StringTokenizer;

class TokenTester {
    
    public static void main(String[] arguments) {
        StringTokenizer st1, st2;
        
        String quotel = "GOOG 530.80 -9.98";
        st1 = new StringTokenizer(quotel);
        while (st1.hasMoreElements()) {
            System.out.println("Token: " + st1.nextToken());
        }
        
        String quote2 = "RHT@75.00@0.22";
        st2 = new StringTokenizer(quote2, "@");
        System.out.println("");
        while (st2.hasMoreElements()) {
            System.out.println("Token: " + st2.nextToken());
        }
        
    }
}