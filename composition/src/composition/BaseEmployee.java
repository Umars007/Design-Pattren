/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author Micro Tech
 */
public abstract class BaseEmployee implements IEmployee {
    protected String name;
    protected int salary;

    public BaseEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Implement the giveBonus method from the IEmployee interface
    @Override
    public void giveBonus(double bonusPercentage) {
        double bonusAmount = salary * (bonusPercentage / 100);
        salary += bonusAmount;
        System.out.println(name + " received a bonus of " + bonusAmount);
    }
}