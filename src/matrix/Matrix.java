/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of matrix1:");   
        int x = sc.nextInt();
        System.out.print("Enter number of matrix1:");    
        int y = sc.nextInt();
        testmatrix a = new testmatrix(x);
        testmatrix b = new testmatrix(y);
        a.scanInput();
        b.scanInput();
        testmatrix c = a.add(b);
        testmatrix e = testmatrix.mul(a,b);
        testmatrix n = a.substract(b);
        System.out.println("Sum of matrix of complex number is:");
        c.printMatrix();
        System.out.println("Substract of matrix of complex number is:");
        n.printMatrix();
        System.out.println("Multiple of matrix of complex number is:");
        e.printMatrix();
       
    }
    
}
