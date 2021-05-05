import java.time.Month;
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng");
       int mounth = sc.nextInt();
       String dayinmounth;
       switch (mounth){
           case 2:
               dayinmounth = "28 or 29 ngày";
               break;
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               dayinmounth = "31 ngày ";
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               dayinmounth = "30 ngày";
               break;
           default:
               dayinmounth = "";


       }
       if(dayinmounth != ""){
           System.out.println("tháng này có "  +dayinmounth);
       }else {
           System.out.println("không có gì cả");
       }
    }
}
