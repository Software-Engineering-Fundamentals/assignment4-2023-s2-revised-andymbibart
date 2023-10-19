package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Department in an organisation
 */
public class Department {
    
    private String name;
    
    private ArrayList<String> ID1 = new ArrayList<String>();
    
    private ArrayList<String> temp1 = new ArrayList<String>();

    private ArrayList<int> employee = new ArrayList<int>();

    
    private int ID2;

    private String name;

    public String getID() {
        return ID2;
    }

    public void setID(int ID) {
        this.ID2 = ID;
    }

    
    public boolean checkEmployee(int employeeID) { // Changed eID to employeeID
        // Replaced int p with boolean employeeCheck
        boolean employeeCheck = false;

	    for (int i = 0; i < this.employee.size(); i++){
            // Changed check to currentEmployeeID (and made it an int)
            int currentEmployeeID = this.employee.get(i);
            if (currentEmployeeID == employeeID) {
                employeeCheck = true;
                // Added a break to stop for loop if employee was found
                break;
            }
        }

        // boolean employeeCheck lessens required code
        if (employeeCheck) {
            System.out.println("Employee exists");
        }
        else {
            System.out.println("Employee doesn't exists");
	    }
        
        return employeeCheck;
    }

    

    public void assignNew(string temp2, int ID) {
        this.temp1.add(temp2);
	  this.ID1.add(ID);
    }


}
