package com.projects;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// This is the array problem. The problem requires to rotate the array
        Main obj1 = new Main();
        Random r = new Random();
        int nums[] = new int[5];
        for(int i=0;i<nums.length;i++){
                nums[i] = r.nextInt(100);
        }
        //obj1.rotateArray(nums);
        obj1.reverse(nums);
//        System.out.println("Elements of arrays are as follows:");
//        for (int i=0; i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
    }
    public void rotateArray(int nums[]){
        System.out.println("Length of the array is:"+nums.length);
        System.out.println("In this function lets rotate the array");
        //to reverse the array
        System.out.println("After rotating the array it looks like");
    }

    public void reverse(int nums[]){
        System.out.println("Array before reversing :");
        for (int k=0; k<nums.length;k++){
            System.out.print(" "+nums[k]);
        }
        System.out.println("");
       // System.out.println("Inside Reverse");
        System.out.println(nums.length);
        int abc[] = new int[nums.length-1];
        int j = nums.length-1;
        System.out.println("length of array :"+j);
        int i =0;
        while(i<=j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }
        System.out.println("Array after reversring is:");
        for (int k=0; k<nums.length;k++){
            System.out.print(" "+nums[k]);
        }
    }





}
