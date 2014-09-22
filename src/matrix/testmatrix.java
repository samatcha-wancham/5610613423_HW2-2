/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class testmatrix {
     private int SIZE = 2; //default 
    private int[][] a = new int[SIZE][SIZE];
   
    public static testmatrix mul(testmatrix a,testmatrix b){
        return a.mul(b);
    }
    public testmatrix(int[][] val){
        SIZE = val.length;
        a = new int[SIZE][SIZE];
       for(int i=0;i<val.length;i++){
           for(int j=0;j<val.length;j++){
               a[i][j] = val[i][j];
           }        
        }
    }
    
    public testmatrix(){}
    public testmatrix(int size){
        SIZE = size;
        a = new int[SIZE][SIZE];
    }
    
    public void setE(int i,int j, int val){        
        a[i][j]= val;
    }
    public int getE(int i,int j){
        return a[i][j];
    }
    public void scanInput(){
        System.out.println("Enter Element");  //fist element of the row is real part,second is imagine part
        Scanner s = new Scanner(System.in);
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               a[i][j] = s.nextInt();
           }
       }
   }
   
   public testmatrix add(testmatrix b){
       
       int [][] temp = new int[SIZE][SIZE];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               temp[i][j] = a[i][j]+b.getE(i, j);
           }
       }
       return new testmatrix(temp);
   }
   public testmatrix substract(testmatrix b){
       
       int [][] temp = new int[SIZE][SIZE];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               temp[i][j] = a[i][j]-b.getE(i, j);
           }
       }
       return new testmatrix(temp);
   }
   
   private int vmul(int i,int j,testmatrix b){
       int sum = 0;
       for(int x=0;x<a.length;x++){
           sum=this.getE(i, x)*b.getE(i, x);
       }
       return sum;
   }
   public testmatrix mul(testmatrix b){
       int [][] temp = new int[SIZE][SIZE];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               temp[i][j] = vmul(i,j,b);
           }
       }
       return new testmatrix(temp);
         
   }
   
   public void printMatrix(){
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               
               System.out.print(a[i][j]);
               System.out.print(" ");               
           }
           System.out.println("i");
           
       }
   }

       
         
   }
   
   
   
