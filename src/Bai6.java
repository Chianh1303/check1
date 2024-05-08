import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int num ;
        num = sc.nextInt();
        if (num > 0){
            System.out.println("Số lớn hơn không: " + num);
        }else {
            System.out.println("Số bé hơn không: " + num);
        }
    }
}
