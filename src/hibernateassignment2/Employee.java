package hibernateassignment2;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Employee")
public class Employee implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "emID")
    private int emID;
    @Column (name = "emName")
    private String emName;
    @Column (name = "emAge")
    private int emAge;
    @Column (name = "emAddress")
    private String emAddress;
    @Column (name = "emSalary")
    private float emSalary;

    public Employee(String name, int age, String address, float salary) {
 
        this.emName = name;
        this.emAge = age;
        this.emAddress = address;
        this.emSalary = salary;
    }
    
    public int getID() {return emID;}
    public String getName() {return emName;}
    public int getAge() {return emAge;}
    public String getAddress() {return emAddress;}
    public float getSalary() {return emSalary;}
    
    public void setName(String emName) {this.emName = emName;}
    public void setAge(int emAge) {this.emAge = emAge;}
    public void setAddress(String emAddress) {this.emAddress = emAddress;}
    public void setSalary(float emSalary) {this.emSalary = emSalary;}
    
    public Employee (int emID, String emName, int emAge, String emAddress, float emSalary) {
        this.emID = emID;
        this.emName = emName;
        this.emAge = emAge;
        this.emAddress = emAddress;
        this.emSalary = emSalary;
        
    }
    
    public Employee() {}
    
    @Override
    public String toString() {
        return this.emID + ";  Name:  " + this.emName + ";  Age:  " + this.emAge + ";  Address:  " + this.emAddress + ";  Salary:  " + this.emSalary;
    }
    
    
}
