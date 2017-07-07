import java.util.Comparator;
import java.util.TreeSet;
public class Employee {
 
    public static void main(String a[]){
      
        System.out.println("===========================");
        //By using salary comparator (int comparison)
        TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
        salComp.add(new Empl("Ram","Android Developer",3000));
        salComp.add(new Empl("John","Senior java Developer",3000));
        salComp.add(new Empl("Tapan","Manager Developer",4000));
        salComp.add(new Empl("Siri","Java Developer",2400));
        for(Empl e:salComp){
            System.out.println(e);
        }
        
        System.out.println("===========================");
      
    }
}
 //MyNameComp is created to compare the name property
class MyNameComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
    	if(e1.getName().equals(e2.getName()))
    			{ 
    		
    				return e1.getDesignation().compareTo(e2.getDesignation()); 
    				}  
    		  
    		else  
    			return e1.getName().compareTo(e2.getName());
    }
}  

//this is created to compare the designation of the employee
class MyDesignationComp implements Comparator<Empl>{
	 
    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getDesignation().compareTo(e2.getDesignation());
    }
} 
 
class MySalaryComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else if (e1.getSalary() == e2.getSalary()){
            return e1.getName().compareTo(e2.getName());
        }
        else return -1;
    }
}

class Checker implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Empl a = (Empl)o1;
        Empl b = (Empl)o2;
        if (a.getSalary() == b.getSalary()) {
            return a.getName().compareTo(b.getName());
        } 
        else if(a.getName().equals(b.getName()))
    			{ 
    		
    			return a.getDesignation().compareTo(b.getDesignation()); 
    			}  
	        else{
	        		return b.getSalary() - a.getSalary();
	        }
    }
}
 
class Empl{
     
    private String name,designation;
    private int salary;
     
    public Empl(String n, String d, int s){
        this.name = n;
        this.salary = s;
        this.designation = d;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary+"   Designation :"+this.designation;
    }
}
