/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author Micro Tech
 */
import java.util.Iterator;

public class EmployeeController {
    private Director universityDirector;

    public EmployeeController(Director director) {
        this.universityDirector = director;
    }

    public void generateOrganogram() {
      
    }

    public void activateBonus(String bonusType, double percentageOfBonus) {

    }

   

    public Iterator<IEmployee> createIterator() {
  
        return new CompositeIterator(universityDirector);
    }

 
}