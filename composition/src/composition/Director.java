/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Micro Tech
 */
public class Director extends BaseEmployee {
    private List<IEmployee> subordinates;

    public Director(String name, int salary) {
        super(name, salary);
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(IEmployee subordinate) {
        subordinates.add(subordinate);
    }

    public void removeSubordinate(IEmployee subordinate) {
        subordinates.remove(subordinate);
    }
}