package com.projects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // lets do the matrix multiplication in this project
        Scanner scan = new Scanner(System.in);
        int[][] Arr = new int[4][4];

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter the matrix for position Matrix["+i+"]["+j+"]");
                Arr[i][j] = scan.nextInt();
            }
        }
        //lets print the Matrix now
        System.out.println("lets print the Matrix now");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }

    }
}
