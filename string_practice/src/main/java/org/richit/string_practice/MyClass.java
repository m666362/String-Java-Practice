package org.richit.string_practice;

public class MyClass {

    static String dot = "----------------";
    static String start = "Programme started";
    static String end = "Programme ended";

    public static void main(String[] args) {
        System.out.println(dot+start+dot);
        System.out.println("");

        System.out.println("Programme started");
        String string = "abc".substring( 1, 2 );
        System.out.println(string);

        System.out.println("");
        System.out.println(dot+end+dot);
    }

}
