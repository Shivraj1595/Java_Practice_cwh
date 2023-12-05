
class custom_properties{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        custom_properties c = new custom_properties();

        c.setSalary(50000);
        c.setName("Shivraj");
        System.out.println("Employee name: "+c.getName()+" \nEmployee Salary: "+c.getSalary());
        c.setSalary(158000);
        c.setName("Rakesh");
        System.out.println("Employee name: "+c.getName()+" \nEmployee Salary: "+c.getSalary());



    }
}
