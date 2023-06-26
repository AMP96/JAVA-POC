package OOPs.encapsulation;

public class Employee
{

    private int empId;
    private String name;
    private String email;

    // Define constructors

    public Employee() { }

    public Employee(int empId, String name, String email)
    {
        this.empId = empId;
        this.name = name;
        this.email = email;
    }

    public int getEmpId() { return empId; }

    public void setEmpId(int empId) { this.empId = empId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    // Define toString() method.


    @Override
    public String toString() {
        return "Employee: [ " +
                "Employee ID: " + empId +
                ", Name: '" + name + '\'' +
                ", E-mail: '" + email + " ]";
    }
}
