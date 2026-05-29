package class_smallcash;

import java.util.Scanner;

public class view {
    small_cash sc = new small_cash();
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    void start(){
        do{
            sc.dispaly_menu();
            int n = scanner.nextInt();
            switch(n){
                case 1:
                    sc.display_detail();
                    break;
                case 2:
                    sc.in_cash();
                    break;
                case 3:
                    sc.out_cash();
                    break;
                case 4:
                    loop = false;
                    System.out.println("已退出！");
                    break;
            }
        }while(loop);
    }
}
