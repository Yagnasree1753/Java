package polymorphism.OvveridingDepartment;

class Department{
    public void DepartmentName(){
        System.out.println("This is IT Department");
    }
}
class Employee extends Department{
    @Override
    public void DepartmentName(){
        System.out.println("This is Employee from IT Department");
    }
}
public class Main{
    public static void main(String[] args){
        Department myDepartment = new Department();
        Employee myJob = new Employee();
        myDepartment.DepartmentName();
        myJob.DepartmentName();
    }
}