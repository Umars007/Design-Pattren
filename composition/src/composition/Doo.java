/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author Micro Tech
 */
public class Doo extends BaseEmployee {
    private String rank;

    public Doo(String name, int salary, String rank) {
        super(name, salary);
        this.rank = rank;
    }
}