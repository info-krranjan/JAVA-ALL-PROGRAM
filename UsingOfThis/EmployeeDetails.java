class EmployeeDetails{

    int EmpId;
    String Name;
    double Salary;
    String Add;

    EmployeeDetails(int EmpId, String Name, double Salary, String Add){

    this.EmpId = EmpId;
    this.Name = Name;
    this.Salary = Salary;
    this.Add = Add;
    
    }

    void Display(){

    System.out.println("Employee Id = "+EmpId);
    System.out.println("Employee Name = "+Name);
    System.out.println("Employee Salary = "+Salary);
    System.out.println("Employee Address = "+Add);

    }

    public static void main(String[] args){

    System.out.println("Employee Details:  \n");
    EmployeeDetails Emp = new EmployeeDetails(01,"Ranjan",9700.99,"Ranchi");
    Emp.Display();
    }
}