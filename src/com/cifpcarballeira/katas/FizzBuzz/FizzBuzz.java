/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author dam104
 */
public class FizzBuzz {

    public String getFizzBuzz(int num) {
        String n="Fizz";
        if (num==1) n= "1" ;
        if(num==2) n= "2";
        if (num%3==0) n="Fizz";
            return n; 
    }
    
}
