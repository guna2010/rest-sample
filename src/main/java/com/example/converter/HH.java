package com.example.converter;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Configuration
public class HH{
    // merger 2o array
    public static void main(String arg[]){
        System.out.println("MAIIIIIIIII\n\n");
        int arr1[]={1,4,2,3,5}; //1,5,6
        int arr2[]={3,6,4};
        ArrayList<Integer> unique=new ArrayList<>();

        int len2=arr2.length;
        int len1=arr1.length;
        int arr3[]=new int[len1+len2];

        //

        for(int i=0;i<len1;i++){
            int x=arr1[i];
            boolean flag=findElement(arr2,x);
            if(flag==false){
                unique.add(x);
            }

        }

        for(int i=0;i<len2;i++){
            int x=arr2[i];
            boolean flag=findElement(arr1,x);
            if(flag==false){
                unique.add(x);
            }

        }

       for(int i=0;i<unique.size();i++){
           System.out.println("i="+unique.get(i));
       }

    }
   private static boolean findElement(int arr[],int x){
       int len=arr.length;
       boolean flag=false;
       for(int i=0;i<len;i++){
          if(x==arr[i]){
              flag= true;
          }

       }
        return flag;
   }
   public void TT(){
        System.out.println("FFFF");
   }



}
