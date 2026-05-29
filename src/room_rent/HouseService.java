package room_rent;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 0;

    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(0,"jack","1111","haidian",2000,"未出租");

    }
    // get&set方法
    public int getHouseNums() {
        return houseNums;
    }

    // 返回所有房屋信息
    public House[] list(){
        return houses;
    }

    // 添加房屋信息
    public boolean add(House newHouse){
        if(houseNums == 10){
            System.out.println("房屋信息已满，无法再添加");
            return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int num){
        if(num >= houseNums){
            return false;
        }

        for (int i = num; i <= houseNums; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }
}
