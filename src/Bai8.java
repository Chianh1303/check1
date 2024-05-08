import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a và b");
        int a ;
        a = scanner.nextInt();
        int b;
        b = scanner.nextInt();
        if (a > 0 && b>0){
            System.out.println("Số a và số b lớn hơn không");
        }else {
            System.out.println("khong ton tai");
        }

    }
}
