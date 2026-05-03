// Visibility & Packages Checklist Requirement:
// All classes in this file are part of the "default package". 
// Because they do not have the 'public' or 'private' modifier, they use 
// package-private (default) visibility, meaning they can all easily interact 
// with each other within this same package environment.
class Employee{
    protected String name;
    protected double basesalary;
    protected boolean checkedIN;

    Employee(String name , double basesalary, boolean checkedIN){
        this.name= name;
        this.basesalary=basesalary;
        this.checkedIN=checkedIN;
    }
    Employee(String name, double basesalary){
        this.name=name;
        this.basesalary= basesalary;
        this.checkedIN=false;
    }
    Employee(){
        this.name="uknown";
        this.basesalary=0.0;

    }
    double calculatepay(){
        return basesalary;
    }
    final void clockIN(){
        this.checkedIN=true;
        System.out.println(name + " has clockedin for the day");
    }
    static void companypolicy(){
        System.out.println("Base employee policy : work 9 to 5");
    }
}
class Manager extends Employee{
    double bonus;
    Manager(String name, double basesalary, boolean checkedIN, double bonus){
        super(name, basesalary, checkedIN);
        this.bonus= bonus;
    }
    Manager(String name, double basesalary, double bonus){
        super(name, basesalary, false);
        this.bonus= bonus;
    }
    @Override
    double calculatepay(){
        return super.calculatepay()+bonus;
    }
    static void companypolicy(){
        System.out.println("the manager must stay till the job is done ");
    }
}
class Intern extends Employee{
    Intern(String name){
        this.name=name;
        this.basesalary=2000;
    }
}
class Director extends Manager{
    Director(String name , double basesalary, boolean checkedIN, double bonus){
        super(name, basesalary, checkedIN, bonus);
    }
    void printstatus(){
        System.out.println(super.name+" directs the group for the project");
    }
}
class CEO extends Manager{
    CEO(String name , double basesalary, boolean checkedIN, double bonus){
        super(name, 200000,checkedIN, 50000);
    }
}
// Multiple Inheritance Restriction:
// class Intern extends Employe, Manager { } 
// ERROR: Java does NOT allow a child to have two direct parents (Multiple Inheritance)
//which causes for the code to crash
void main(){
Employee e1 = new Employee("alex",3000);
System.out.println("before clockingin: is alex clockedin? " + e1.checkedIN);
e1.clockIN();
System.out.println("after clockingin : is alex clockedin ? " + e1.checkedIN);
Manager m1 = new Manager("Sarah", 10000, 500);
System.out.println("the total pay of "+m1.name +" is "+  m1.calculatepay());

}