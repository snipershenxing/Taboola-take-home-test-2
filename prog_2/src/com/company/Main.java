package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isContainInt("com4you"));
    }

    public static boolean isContainInt(String s) {
        if (s == "" || s.length() == 0) {
            return false;
        }

        char[] a = s.toCharArray();
        int len = a.length;

        for (int i = 0; i < len; i++) {
            if (a[i] >= 48 && a[i] <= 57) {
                return true;
            }
        }
        return false;
    }
}
