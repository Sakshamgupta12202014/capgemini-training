import java.util.Scanner;
import java.util.ArrayList;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee[ID=" + this.id + ", Name=" + this.name + ", Department=" + this.department + ", Salary=" + (int)this.salary + "]";
    }

    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.id == e.id;
    }

    public int hashCode() {
        return id;
    }
}

class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static int count;
    static Scanner sc = new Scanner(System.in); 

    static{
        count = 0;
    }

    public static void main(String []args) {

        System.out.println("Welcome to Employee Management System");
        System.out.println("1.Add Employee\n2.Display All Employees\n3.Update Employee\n4.Delete Employee\n5.Search Employee by ID\n6.Count Employees by Department\n7.Exit");


        boolean active = true;
        do {

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: {
                    addEmployee();
                    break;
                }
                case 2: {
                    displayEmployees();
                    break;
                }
                case 3: {
                    updateEmployee();
                    break;
                }
                case 4: {
                    deleteEmployee();
                    break;
                }
                case 5: {
                    searchEmployee();
                    break;
                }
                case 6: {
                    countByDepartment();
                    break;
                }
                case 7: {
                    active = false;
                    break;
                }
            }
        }while(active);
    }

    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        // check if id already exists in employees list
        for(Employee emp : employees) {
            if(emp.getId() == id) {
                System.out.println("Employee with ID " + id + " already exists! Cannot add duplicate.");
                return;
            }
        }
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        // sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.next();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);
        employees.add(emp);
        count++;

        System.out.println("Employee added successfully!");
    }

    private static void displayEmployees() {
        System.out.println("Current Employees:");
        if(count == 0) {
            System.out.println("Employees list is empty.");
            return;
        }
        for(Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    private static void updateEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        boolean isEmpPresent = false;
        if(count > 0) {
            for(Employee emp : employees) {
                if(emp.getId() == id) {
                    System.out.print("Enter updated name: ");
                    String newName = sc.nextLine();
                    // sc.nextLine();
                    System.out.print("Enter updated department: ");
                    String newDepartment = sc.next();
                    System.out.print("Enter updated salary: ");
                    double newSalary = sc.nextDouble();

                    emp.setName(newName);
                    emp.setDepartment(newDepartment);
                    emp.setSalary(newSalary);

                    System.out.println("Updated Employee successfully.");
                    isEmpPresent = true;
                    break;
                }
            }
        }
        if(!isEmpPresent) {
            System.out.println("Employee Id " + id + " not found");
        }
    }

    private static void deleteEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        boolean isEmpPresent = false;
        if(count > 0) {
            for(Employee emp : employees) {
                if(emp.getId() == id) {
                    employees.remove(emp);
                    count--;
                    System.out.println("Employee deleted successfully");
                    break;
                }
            }
        }

        if(!isEmpPresent) {
            System.out.println("Employee not found");
        }
    }

    private static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        boolean employeeExist = false;
        Employee employee = null;
        for(Employee emp : employees) {
            if(emp.getId() == id) {
                employeeExist = true;
                employee = emp;
                break;
            }
        }
        if(employeeExist) {
            System.out.println("Found Employee:");
            System.out.println(employee.toString());
        }else{
            System.out.println("Employee does not Exist");
        }
    }

    private static void countByDepartment() {
        int count = 0;
        System.out.print("Enter department to count: ");
        String dep = sc.next();

        for(Employee emp : employees) {
            if(emp.getDepartment().equals(dep)) {
                count++;
            }
        }

        System.out.println("Number of employees in IT: " + count);
    }
}

1. Add Text
2. Delete Text
3. Search Word
4. Replace Word
5. Undo
6. Redo
7. Display Document
8. Exit