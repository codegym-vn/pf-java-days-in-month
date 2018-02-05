import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ban muon tinh so ngay cua thang may? ");
        int month = scanner.nextInt();

        String counting;
        switch (month) {
            case 2:
                counting = "28 hoac 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                counting = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                counting = "30";
                break;
            default:
                counting = "";
        }

        if (counting != "") System.out.printf("Thang %d co %s ngay!", month, counting);
        else System.out.print("Thang nhap vao khong dung!");

    }
}
