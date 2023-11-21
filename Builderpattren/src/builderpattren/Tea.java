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
public class Tea extends ColdDrink {
    private int sweetnessLevel;
    private boolean withCream;
    private int spoonsCount;

    public Tea(int sweetnessLevel, boolean withCream, int spoonsCount) {
        this.sweetnessLevel = sweetnessLevel;
        this.withCream = withCream;
        this.spoonsCount = spoonsCount;
    }

    @Override
    public String name() {
        return "Tea";
    }

    @Override
    public float price() {
        float teaPrice = 20.0f; // base price for Tea

        // Add additional charges for decorations
        if (sweetnessLevel > 0) {
            teaPrice += 5.0f; // example charge for sweetness
        }

        if (withCream) {
            teaPrice += 10.0f; // example charge for cream
        }

        if (spoonsCount > 0) {
            teaPrice += spoonsCount * 2.0f; // example charge for spoons
        }

        return teaPrice;
    }
}
