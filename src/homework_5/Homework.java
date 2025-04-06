package homework_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        incereaseEachValuOfMatrix();
        chessboard();
    }

    public static void incereaseEachValuOfMatrix(){
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n=0,m=0,s = 0;
        if(sc.hasNextInt()){
            n = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
        }
        int array [][][]= new int[n][m][s];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<s;k++){
                    array[i][j][k] = rand.nextInt(9);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Enter the number on which to increase each element of the array: ");
        Scanner sc1 = new Scanner(System.in);
        int n1 = sc1.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<s;k++){
                    array[i][j][k] += n1;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void chessboard(){
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n=0,m=0;
        if(sc.hasNextInt()){
            n = sc.nextInt();
            m = sc.nextInt();
        }
        char [][] array = new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    array[i][j] = 'W';
                    if(i%2==0 && j%2!=0){
                        array[i][j] = 'B';
                    } else if(i%2!=0 && j%2==0){
                        array[i][j] = 'B';
                    }
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
