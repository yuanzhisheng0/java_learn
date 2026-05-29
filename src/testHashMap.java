import java.util.*;

public class testHashMap {
    public static void main(String[] args) {
        Map m = new HashMap();
        employee1 ep1 = new employee1(0,"wwj",20000);
        employee1 ep2 = new employee1(1,"ljw",30000);
        employee1 ep3 = new employee1(2,"www",40000);
        m.put(ep1.getId(),ep1);
        m.put(ep2.getId(),ep2);
        m.put(ep3.getId(),ep3);

        // 遍历
        // 1、使用keySet
        // 1.1 增强for
        Set mySet = m.keySet();
        for (Object o : mySet) {
            System.out.println(m.get(o));
        }
        // 1.2 迭代器
        Iterator iterator = mySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(m.get(next));
        }
        // 2、使用Values
        Collection collection = m.values();
        for (Object o : collection) {
            System.out.println(o);
        }
        Iterator iterator1 = collection.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }
        // 3、使用entrySet
        Set entryset = m.entrySet();
        for (Object o : entryset) {
            Map.Entry me = (Map.Entry)o;
            System.out.println(me.getValue());
        }
        Iterator iterator3 = entryset.iterator();
        while (iterator3.hasNext()) {
            Object next =  iterator3.next();
            Map.Entry me1 = (Map.Entry)next;
            System.out.println(me1.getValue());
        }
    }
}
class employee1{
    private int id;
    private String name;
    private double salary;

    public employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
