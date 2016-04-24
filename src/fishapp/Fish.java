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
public class Fish extends Animal {

    private String info;
    private String type;

    /**
     *
     * @param g
     * @param i
     */
    public Fish(String g, String i) {

        super(g);
        info = i;

    }

    public String getInfo() {
        return info;
    }

}
