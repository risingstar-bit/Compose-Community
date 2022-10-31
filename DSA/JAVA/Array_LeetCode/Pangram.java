package com.company.Arrays;

public class pangram {
    public static void main(String[] args) {
        boolean p=true;
        String str="abcdefghijklmnop";
        String s="abcdefghijklmnopqrstuvwxyz";
        for (char ch:s.toCharArray()){
            if(str.indexOf(ch)==-1) {
                System.out.println("Not Pangram");
                p=false;
                break;
            }
        }
        if(p==true)
            System.out.println("Pangram");
    }
}
