package room_rent;

public class House {
    // 属性
    private int id;
    private String name;
    private String phone;
    private String address;
    private double rent;
    private String state;

    public House(int id, String name, String phone, String address, double rent, String state) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    // 重写toString以方便输出房屋信息
    @Override
    public String toString() {
        return String.format("%-10s%-10s%-15s%-10s%-10s%-12s",
                id, name, phone, address, rent, state);
    }

    // get和set方法
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
