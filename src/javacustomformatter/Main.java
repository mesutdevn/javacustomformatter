/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacustomformatter;

/**
 *
 * @author mesut
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CustomDateFormatter cdf = new CustomDateFormatter("dd/MM/yyyy", "20/08/2018");
        System.out.println("Result1: " + cdf);
        System.out.println("Result2: " + cdf.getOutShortDate());
        System.out.println("Result3: " + cdf.getOutLongDate());
    }
    
}
