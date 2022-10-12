package taskExample;

import taskExample.Services.User;

import java.io.StreamCorruptedException;

public class UtilsGenericMethods {


    public static void main(String[] args) {

        System.out.println(UtilsGenericMethods.max("A","Z"));
        User u1 = new User();
        User u2 = new User();
        u1.setScore(75);
        u2.setScore(8);
        System.out.println(max(u1,u2));

    }


//    public static int max(int first, int second) {
//        return (first>second)? first: second;
//    }
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second: first;
    }




}
