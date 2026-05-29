package class_smallcash;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class small_cash {
    private String detail = "======零钱通明细======";
    private double sum = 0;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Scanner scanner = new Scanner(System.in);

    void in_cash(){
        double in_money;
        System.out.print("请输入入账金额：");
        in_money = scanner.nextDouble();
        sum += in_money;
        Date date = new Date();
        detail += "\n收益入账\t+" + in_money + "\t" + sdf.format(date) + "\t余额：" + sum;
    }
    void out_cash(){
        System.out.print("请输入支出目的：");
        String reason = scanner.next();
        System.out.print("请输入支出金额：");
        double out_money = scanner.nextDouble();
        sum -= out_money;
        Date date = new Date();
        detail += "\n" + reason + "\t-" + out_money + "\t" + sdf.format(date) + "\t余额：" + sum;
    }
    void dispaly_menu() {
        System.out.println("======零钱通菜单======");
        System.out.println("\t1 零钱通明细");
        System.out.println("\t2 收益入账");
        System.out.println("\t3 消费");
        System.out.println("\t4 退出");
        System.out.print("请选择功能(1-4)：");
    }
    void display_detail(){
        System.out.println(detail);
    }

}
