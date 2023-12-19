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
public class Hod extends BaseEmployee implements IEmployee {
    private List<IEmployee> subordinates;
    private String departmentName;

    public Hod(String name, int salary, String departmentName) {
        super(name, salary);
        this.subordinates = new ArrayList<>();
        this.departmentName = departmentName;
    }

    public void addSubordinate(IEmployee subordinate) {
        subordinates.add(subordinate);
    }

    public void removeSubordinate(IEmployee subordinate) {
        subordinates.remove(subordinate);
    }
}