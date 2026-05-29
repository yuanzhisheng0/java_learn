class PersonB{
    private String name;
    private int age;
    public PersonB(String name, int age){
        this.name = name;
        this.age = age;
    }
    void print_info(){
        System.out.println("my name is "+ name + " i am " + age + "years old");
    }

    public static void main(String[] args) {
        PersonB b  = new PersonB("1",20);
        b.equals("abc");
    }
}
class Student extends PersonB{
    private String name;
    private int age;
    public Student(String name,int age){
        super(name, age);
    }
    void print_info(){
        System.out.println("my name is "+ name + " i am " + age + "years old");
    }
}
