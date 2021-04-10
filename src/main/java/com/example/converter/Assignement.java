package com.example.converter;

import java.util.*;
import java.util.stream.Collectors;

public class Assignement {
    public static void main(String arg[]) {
        System.out.println("TESTING");
        List<Employee> list = new ArrayList();

        EmpCompartor compareByName=new EmpCompartor();
           list.stream().sorted(compareByName).collect(Collectors.toList());
            list.forEach(System.out::println);

        }

    /***
     *  SEcond assignment
     */
    private static void  ArrayCal(){

          ArrayList<Integer> Input = Arrays.asList(4, 2, 2, 4,8, 9, 4, 5, 7, 10, 8);
          //  Output - [4, 16, 64, 100]
            // convert arry to set
            Set <Integer> unique=new HashSet();

           List squ= unique.stream().map(s->s*s).collect(Collectors.toList());


        }

    class Employee{
        String name;
        String age;
        String gpa;

        public String getName() {
            return name;
        }
        public String getMajor() {
            return major;
        }


        public String getMinor() {
            return minor;
        }

        String major;
        String minor;

        public Employee(String name, String age, String gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }


    }


class EmpCompartor implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
       int cmp= e1.getMajor().compareTo( e2.getMajor());
       if(cmp==0){
           return e1.getMinor().compareTo( e2.getMinor());
       }
        return cmp;
    }
}







}




