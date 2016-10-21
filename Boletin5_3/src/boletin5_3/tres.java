/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

/**
 *
 * @author rgonzalezrasero
 */
public class tres {
    private  int n1;
    private  int n2;
    
        public tres(){
        n1=0;
        
    }    
        public void setN1 (int n1){
       if (n1>0){
           System.out.println("+");
       }
       else if(n1<0) {
            System.out.println("-");
        }
           else  {
            System.out.println("0");
        }
        }
}
