import java.util.*;

public class testFanxing {
    public static void main(String[] args) {
        HashSet<student> students = new HashSet<student>();
        students.add(new student("tom",18));
        students.add(new student("jack",19));
        students.add(new student("mike",20));

        for (student student : students) {
            System.out.println(student);
        }

        System.out.println("=============================");

        HashMap<String, student> hashmap = new HashMap<String,student>();
        hashmap.put("jack",new student("jack",19));
        hashmap.put("tom",new student("tom",18));
        hashmap.put("mike",new student("mike",20));

        Set<Map.Entry<String,student>> entry = hashmap.entrySet();
        Iterator<Map.Entry<String,student>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, student> next =  iterator.next();
            System.out.println(next.getKey() + "   " + next.getValue());
        }

    }
}
class student{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

