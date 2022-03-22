import java.util.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class Registration {

    private void register() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name: ");
        String Uname = sc.nextLine();
        System.out.println(Uname);

        System.out.println("Enter Password: ");
        String Pass = sc.nextLine();
        System.out.println(Pass);

        System.out.println("Confirm Password: ");
        String ConPass = sc.nextLine();
        System.out.println(ConPass);
        Uname = Uname.trim();
        Pass = Pass.trim();
        ConPass = ConPass.trim();


        String x = Uname + " " + Pass;
        if (Pass.equals(ConPass)) {

            File f = new File("Registration.txt");
            Scanner content = new Scanner(f);


            int flag = 0;
            while (content.hasNextLine()) {
                String data = content.nextLine();
                if (data.equals(x)) {
                    System.out.println("Already Registered");
                    flag = 1;
                    System.out.println("1. Registration. ");
                    System.out.println("2. Login. ");

                    System.out.println("Enter your Choice");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        this.register();
                    } else if (choice == 2) {
                        this.login();
                    } else {
                        System.out.println("Choose Proper Option");
                    }
                    break;
                }
                //content.close();
            }
            if (flag == 0) {
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter("Registration.txt", true));
                    out.write(Uname + " " + Pass + "\n");
                    out.close();
                } catch (IOException e) {
                    System.out.println("exception occoured" + e);
                }

                System.out.println("Successfully Registered");
                System.out.println("Please login");
                this.login();
            }


        } else {
            System.out.println("Recheck");
            System.out.println("1. Registration. ");
            System.out.println("2. Login. ");

            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            if (choice == 1) {
                this.register();
            } else if (choice == 2) {
                this.login();
            } else {
                System.out.println("Choose Proper Option");
            }
        }
        //sc.close();
    }

    public void login() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name: ");
        String Uname = sc.nextLine();
        System.out.println(Uname);

        System.out.println("Enter Password: ");
        String Pass = sc.nextLine();
        System.out.println(Pass);
        Uname = Uname.trim();
        Pass = Pass.trim();
        String x = Uname + " " + Pass;


        try {

            File f = new File("Registration.txt");
            Scanner content = new Scanner(f);
            int flag = 0;
            while (content.hasNextLine()) {
                String data = content.nextLine();
                if (data.equals(x)) {
                    System.out.println("Login Successful");
                    System.out.println("Welcome to the Application.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Login Failed");
                System.out.println("1. Registration. ");
                System.out.println("2. Login. ");

                System.out.println("Enter your Choice");
                int choice = sc.nextInt();
                if (choice == 1) {
                    this.register();
                } else if (choice == 2) {
                    this.login();
                } else {
                    System.out.println("Choose Proper Option");
                }
            }

            //content.close();
        } catch (FileNotFoundException e) {


            System.out.println("Error.");
            e.printStackTrace();
        }

        //sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        try {

            File obj = new File("Registration.txt");

            if (obj.createNewFile()) {
                System.out.println("File is created");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Registration. ");
        System.out.println("2. Login. ");

        System.out.println("Enter your Choice");
        choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Registration user = new Registration();
            user.register();
        } else if (choice == 2) {
            Registration user = new Registration();
            user.login();
        } else {
            System.out.println("Choose Proper Option");
        }
        //sc.close();

        class Employee {
            private int empid;
            private int age;
            private String empname;
            private String compname;
            private String designation;
            private int salary;
            private String address;
            private long phoneno;

            Employee(int empid,int age, String empname, String compname,String designation, int salary, String address, long phoneno){
                this.empid=empid;
                this.age=age;
                this.empname=empname;
                this.compname=compname;
                this.designation=designation;
                this.salary=salary;
                this.address=address;
                this.phoneno=phoneno;
            }

            public int getEmpid() {
                return empid;
            }

            public int getAge() {
                return age;
            }

            public String getEmpname() {
                return empname;
            }

            public String getCompname() {
                return compname;
            }

            public String getDesignation() {
                return designation;
            }

            public int getSalary() {
                return salary;
            }

            public String getAddress() {
                return address;
            }

            public long getPhoneno() {
                return phoneno;
            }
            public String toString(){
                return empid+" "+age+" "+empname+" "+compname+" "+designation+" "+salary+" "+address+" "+phoneno;
            }
        }
        int ch;
        List<Employee> c=new ArrayList<Employee>();
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("6.EXIT");
            System.out.println("Enter Your Choice :");
            ch=scan1.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Enter Employee ID :");
                    int empid=scan1.nextInt();
                    System.out.println("Enter Employee Age :");
                    int age=scan1.nextInt();
                    while(age<18 || age>90){
                        System.out.println("Invalid Age");
                        System.out.println("Enter Age Again");
                        age = scan1.nextInt();
                    }


                    System.out.println("Enter Employee Name :");
                    String empname=scan2.nextLine();
                    System.out.println("Enter Company Name :");
                    String compname=scan2.nextLine();
                    System.out.println("Enter Designation :");
                    String designation=scan2.nextLine();
                    System.out.println("Enter Employee Salary :");
                    int salary=scan1.nextInt();
                    System.out.println("Enter Employee Address :");
                    String address=scan2.nextLine();
                    System.out.println("Enter Employee Phone No :");
                    long phoneno= scan1.nextLong();

                    c.add(new Employee(empid,age,empname,compname,designation,salary,address,phoneno));
                    System.out.println("Successfully Added!!");
                    break;

                case 2:
                    System.out.println("---------------------------------------");
                    Iterator<Employee> i=c.iterator();
                    while(i.hasNext()){
                        Employee e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("---------------------------------------");
                    break;

                case 3:
                    boolean found=false;
                    System.out.println("Enter Employee Id to Search :");
                    empid=scan1.nextInt();
                    System.out.println("---------------------------------------");
                    i=c.iterator();
                    while(i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpid() == empid) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }
                    System.out.println("---------------------------------------");
                    break;


                case 4:
                    found=false;
                    System.out.println("Enter Employee Id to Delete :");
                    empid=scan1.nextInt();
                    System.out.println("---------------------------------------");
                    i=c.iterator();
                    while(i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpid() == empid) {
                            i.remove();
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }else {
                        System.out.println("Record Deleted Successfully....!");
                    }
                    System.out.println("---------------------------------------");
                    break;


                case 5:
                    found=false;
                    System.out.println("Enter Employee Id to Update :");
                    empid=scan1.nextInt();
                    ListIterator<Employee>li=c.listIterator();
                    while(li.hasNext()) {
                        Employee e = li.next();
                        if (e.getEmpid() == empid) {
                            System.out.print("Enter new Age :");
                            age=scan1.nextInt();
                            System.out.print("Enter new Name :");
                            empname=scan2.nextLine();
                            System.out.print("Enter Company Name :");
                            compname=scan2.nextLine();
                            System.out.print("Enter Designation :");
                            designation=scan2.nextLine();
                            System.out.print("Enter new Salary :");
                            salary=scan1.nextInt();
                            System.out.print("Enter new Address :");
                            address=scan2.nextLine();
                            System.out.print("Enter new Phone no :");
                            phoneno=scan1.nextLong();
                            li.set(new Employee(empid,age,empname,compname,designation,salary,address,phoneno));
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }else {
                        System.out.println("Record Updated Successfully....!");
                    }

                    break;

                default:
                    break;


            }
        }while (ch!=0);




    }
}


