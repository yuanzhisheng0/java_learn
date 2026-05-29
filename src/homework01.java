public class homework01 {
    public static void main(String[] args) {
        // 类A01测试
        A01 a01 = new A01();
        double[] arr = {1.0, 4.7, 4.8};
        System.out.println("arr的最大值为：" + a01.max(arr));

        // 类A02测试
        A02 a02 = new A02();
        String[] strs = {"jack", "tom", "mary", "milan"};
        System.out.println("strs中的对应索引为：" + a02.find(strs, "milan"));

        // Book类测试
        Book book1 = new Book("平凡的世界", 180.5);
        Book book2 = new Book("龙族", 120.5);

        book1.print_info();
        book1.updatePrice();
        book1.print_info();
    }
}
class Person{
    String name;
    int age;
}
class A01{
    double max(double[] arr){
        double ans = 0;
        for (double v : arr) {
            ans = Math.max(ans, v);
        }
        return ans;
    }
}
class A02{
    int find(String[] arrS, String target){
        for(int i = 0; i < arrS.length; i++){
            if(arrS[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
class Book{
    String name;
    double price;
    public Book(String name, double price){
        this.price = price;
        this.name = name;
    }
    void updatePrice(){
        if(this.price > 150){
            this.price = 150;
        }else if(this.price > 100){
            this.price = 100;
        }
    }
    void print_info(){
        System.out.println("书名：" + name + "价格：" + price);
    }
}
class A03{
    int[] copyArr(int[] arr){
        int n = arr.length;
        int[] new_arr = new int[n];
        System.arraycopy(arr, 0, new_arr, 0, n);
        return new_arr;
    }
}
