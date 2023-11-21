/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattren;

/**
 *
 * @author FA20-BSE-155
 */
public class DietCoke extends ColdDrink {
   public String name() {
        return "Diet Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}