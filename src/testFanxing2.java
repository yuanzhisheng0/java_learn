import java.util.ArrayList;
import java.util.Comparator;

public class testFanxing2 {
    public static void main(String[] args) {
        ArrayList<Employee1> arrayList = new ArrayList<>();
        arrayList.add(new Employee1("wwj",24000, new MyDate(2002,4,18)));
        arrayList.add(new Employee1("ljw",20000, new MyDate(2002,7,18)));
        arrayList.add(new Employee1("wwj",21000, new MyDate(2003,4,18)));
        arrayList.sort(new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 o1, Employee1 o2) {
                if(!o1.getName().equals(o2.getName())){
                    return o1.getName().compareTo(o2.getName());
                }
                else{
                    return o1.getBirthday().getYear() - o2.getBirthday().getYear();
                }
            }
        });
        System.out.println(arrayList);

    }
}
class Employee1{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee1(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}


class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}