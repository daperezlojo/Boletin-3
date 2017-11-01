/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

import java.util.Scanner;

/*is
 *
 * @author Damian
 */
public class Boletin3_3 {

    
    Scanner sc;
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
            System.out.println("Dame o radio");
               
            double radio =sc.nextDouble();
                     
            Circulo c1 = new Circulo();
                        
                c1.setRadio(radio);
                                    
                c1.getRadio();
                        
                c1.calcularArea();
                         
                c1.calcularLonxitude();
        
        
       
    }
    
}
