class Employee{
    private String name;
    private int id;
    void setName(String name) {
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setId(int id){
        this.id = id;
    }
    int getId(){
        return this.id;
    }
    void displayDetails(){
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee id: " + this.id);
    }
}
public class Encapsulation{
    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.setName("Jallu");
        emp.setId(10);
        emp.displayDetails();
    }
}