import org.junit.Test;

import java.util.*;

public class testDAO_T {
    public static void main(String[] args) {

    }

    @Test
    public void testMethord(){
        DAO<User> dao = new DAO<>();
        User user1 = new User(0,18,"ljw");
        User user2 = new User(1,19,"wwj");
        User user3 = new User(2,20,"www");
        User user4 = new User(3,21,"wm");

        dao.save(String.valueOf(user1.getId()),user1);
        dao.save(String.valueOf(user2.getId()),user2);
        dao.save(String.valueOf(user3.getId()),user3);

        System.out.println(dao.get("2"));
        System.out.println("====================");
        dao.update("1",user4);
        System.out.println(dao.get("1"));
        System.out.println("====================");
        dao.delete("1");
        System.out.println(dao.get("1"));
        System.out.println("====================");
        List<User> lst = dao.list();
        for (User user : lst) {
            System.out.println(user);
        }
    }

    class DAO<T> {
        Map<String,T> map = new HashMap<>();
        public void save(String id, T entity){
            map.put(id,entity);
        }
        public T get(String id){
            return map.get(id);
        }
        public void update(String id,T entity){
            map.put(id,entity);
        }

        public List<T> list(){
            List<T> lst = new ArrayList<>();
            Set<String> set = map.keySet();
            for (String s : set) {
                lst.add(get(s));
            }
            return lst;
        }

        public void delete(String id){
            map.remove(id);
        }
    }
    class User{
        private int id;
        private  int age;
        String name;

        public User(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}

