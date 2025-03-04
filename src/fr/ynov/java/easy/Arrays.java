package fr.ynov.java.easy;

public class Arrays {

    public static void main(String[] args) {
        char[] c = new char[10];

        for (int i = 0; i < c.length; i++) {
            c[i] = (char) ('a' + i);
            System.out.println(c[i]);
        }
    }
}
