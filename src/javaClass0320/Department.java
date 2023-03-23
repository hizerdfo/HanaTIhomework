package javaClass0320;
import java.io.Serializable;

public class Department implements Serializable{
    String name;
    employee leader;
    public Department(String name, employee leader){
        this.name = name;
        this.leader = leader;
    }
}