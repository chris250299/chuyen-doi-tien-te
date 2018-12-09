import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double rate = 23000;
        double VND, USD;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền mệnh giá USD: ");
        USD = input.nextDouble();
        VND = rate * USD;
        System.out.println("Số tiền sau khi chuyển sang VND là: "+VND);

    }
}
