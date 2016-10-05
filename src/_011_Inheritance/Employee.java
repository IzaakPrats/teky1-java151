package _011_Inheritance;

/**
 * Created by kpascascio on 10/4/16.
 */
public class Employee {
    protected int salary;
    protected String name;
    protected String position;

    public Employee(String n, int s, String p) {
        name = n;
        salary = s;
        position = p;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public String getPosition(){
        return position;
    }

    public String displayEmployeeInfo(){
        return "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Position: " + position + "\n";
    }

    public String hasRec(char i){
        if(i =='y'){
            return displayEmployeeInfo();
        } else
            return "not valid";

    }

    protected String aprovalRating(int i){
        if(i > 5)
            return "We are glad you kind of like your job";
        else
            return "What can we do to make things better?";
    }

}
//    Create a method that allows the employee to rate their happiness on a scale
//    1 - 10 , anything 5 and above print "We are glad you're kinda Happy"
//    anything 4 and below "What can we do better to  help you?" allow cashier to give
//    response