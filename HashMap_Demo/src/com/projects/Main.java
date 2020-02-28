package com.projects;

import java.util.*;


public class Main {

    public void pattern(){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){

            }
        }
    }
    public String Rev(String abc){
        String a = "";

        try {
            for (int i = abc.length()-1; i >= 0; i--) {
                a = a + abc.charAt(i);
            }
        }catch (Exception e){
            System.out.println("Some error oocured");
        }
        return a;
    }

    public int single( int nums[]){
        int a = 0;
        //in this function lets find if we have any duplicates in the array
        // lets find the length of the array which will check for how many unique members in the array. Array will be in sorted form.
//        int [] abc = new int[10];
//        abc = [1,2,2,3,3,4,5];
        System.out.println("Lets print the array");

            try{
                for(int i=0; i<nums.length; i++){
                    System.out.println(nums[i]);
                }
            }catch (Exception e){
                System.out.println("Exception occured");
            }






        return a;
    }


    public static void main(String[] args) {
	//This code is used for doing the hashMap
    //https://www.youtube.com/watch?v=70qy6_gw1Hc  - this link is quite useful for hashmap
        /*
        HashMap<String, Integer> abc = new HashMap<String, Integer>();
        abc.put("a",10);
        abc.put("b",11);
        abc.put("c",12);
        System.out.println(abc);

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("chinmay","password");
        fun.put("jay","password");
        fun.put("matoshree","password");
        fun.put("baba","password");
        System.out.println(fun);
        */
        Main obj = new Main();
        //int [] abc = new int[7];
        int ab[] = {1,2,2,3,3,4,5};
        //abc =  {1,2,2,3,3,4,5};

        System.out.println("we are getting the item returned here"+obj.single(ab));
        System.out.println("Reversed string is:"+obj.Rev("Chinmay"));

    }
}
/*

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            Arrays.sort(nums);
         //   Arrays.toString(nums);
            if(i+1<=nums.length-1 && nums[i]==nums[i+1])
            {
                count++;
            }


        }
        if(count>0)
        {
            return true;

        }
        else
        {
            return false;
        }
    }
}


 */