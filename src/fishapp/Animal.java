/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishapp;

/**
 *
 * @author vernonr
 */
public abstract class Animal {
    
    private String genus; 
    
    public Animal(String g){
        genus = g;
    }
    
    public String getGenus(){
        return genus;
    }
}
