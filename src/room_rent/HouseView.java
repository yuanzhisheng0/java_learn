package room_rent;
import com.Utility;

public class HouseView {
    private boolean loop = true;
    private HouseService houseService = new HouseService(10);

    // 显示主菜单
    public void mainMenu(){
        do{
            System.out.println("=====房屋租赁系统菜单=====");
            System.out.println("1、新 增 房 源 信 息");
            System.out.println("2、查 找 房 源 信 息");
            System.out.println("3、删 除 房 源 信 息");
            System.out.println("4、修 改 房 源 信 息");
            System.out.println("5、房 源 信 息 列 表");
            System.out.println("6、退 出");
            System.out.print("请选择操作：");
            String key = Utility.readString();

            switch (key){
                case "1":
                    addHouse();
                    break;
                case "2":
                    System.out.println("查找");
                    break;
                case "3":
                    delHouse();
                    break;
                case "4":
                    System.out.println("修改");
                    break;
                case "5":
                    listHouse();
                    break;
                case "6":
                    loop = false;
                    System.out.println("已退出！");
                    break;
            }

        }while(loop);

    }

    // 添加房屋
    public void addHouse(){
        System.out.print("姓名：");
        String name = Utility.readString();
        System.out.print("电话：");
        String phone = Utility.readString();
        System.out.print("地址：");
        String address = Utility.readString();
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString();

        House house = new House(houseService.getHouseNums(), name, phone, address, rent, state);
        if(houseService.add(house)){
            System.out.println("添加房屋成功！");
        }else{
            System.out.println("添加房屋失败！");
        }

    }

    // 删除房屋
    public void delHouse(){
        System.out.print("请输入待删除房屋序号：");
        int tmp = Utility.readInt();
        System.out.print("请确认是否删除（y/n）:");
        String tmpChar = Utility.readString();
        if(tmpChar.equals("n")){
            return;
        }
        if(houseService.del(tmp)){
            System.out.println("删除房屋成功！");
        }else{
            System.out.println("删除房屋失败！");
        }
    }

    // 显示房屋列表
    public void listHouse(){
        System.out.println('\n' + "========房屋列表========");
        String header = String.format("%-10s%-10s%-15s%-10s%-10s%-12s",
                "id", "name", "phone", "address", "rent", "state");
        System.out.println(header);
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house != null) {
                System.out.println(house);
            }
        }
        System.out.println("=====房屋列表显示完毕=====" + "\n");
    }
}
