/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    

package boletin3_3;

public class Circulo {
   private double radio;
   private final double Pi=3.14;
   
        public Circulo(double rad){
            double radio= rad;
        }
        public Circulo(){
            
        }
        
        public void getRadio(){
            System.out.println("o radio é: "+radio);
            
        }
        
        public void setRadio(double rad){
            radio=rad;
        }
        
        public void calcularArea(){
            double area=Math.pow(radio,2);
            System.out.println("A area é: "+area);
        }
        
        public void calcularLonxitude(){
            double lonx=2*Pi*radio;
            
        }
}
