package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random rnd = new Random();

        int[] arr = new int[10];
        System.out.print("Just array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(2);
            System.out.print(arr[i] + " ");


        }
        System.out.println();
       System.out.print("\n Just array with sort: ");
        sort(arr);


        System.out.println("\n________________________________________");

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int a= rnd.nextInt(2);
            list.add(a);

        }
        System.out.println("ArrayList: "+list);
        System.out.print("Sorted ArrayList: ");
        sort(list);
        System.out.println("__________________________________________________");


        LinkedList<Integer>linkedList=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int ar= rnd.nextInt(2);
            linkedList.add(ar);
        }
        System.out.println("LinkedList: "+linkedList);
        System.out.print("Sorted LinkedList: ");
            sort(linkedList);





    }
    public static void sort(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            Collections.sort(list);
        }
        System.out.println(list);

    }
    public static void sort(ArrayList<Integer> array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            list.add(array.get(i));
            Collections.sort(list);
        }
        System.out.println(list);
    }

    public static void sort(LinkedList<Integer> array) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.size(); i++) {
            list.push(array.get(i));
            Collections.sort(list);
        }
        System.out.println(list);
    }



}
