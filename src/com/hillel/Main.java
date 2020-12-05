package com.hillel;

public class Main {

    public static void main(String[] args) {
	    String string = "";
	    String string1 = "Some text";
	    String string2 = new String("Test");
        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);

        string1 = string1 + " new text";

        System.out.println(string1);

        StringBuffer buffer = new StringBuffer(" test");
        buffer.append(" continue");
        buffer.append(" ttt");
        buffer.reverse();
        System.out.println("StringBuffer append: " + buffer.toString());


    }
}
