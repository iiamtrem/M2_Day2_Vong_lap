import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n MENU ");
            System.out.println("1. Tìm chữ số lớn nhất");
            System.out.println("2. Tính số đối xứng");
            System.out.println("3. Tính giai thừa");
            System.out.println("4. Kiểm tra số hoàn hảo");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    timChuSoLonNhat(scanner);
                    break;
                case 2:
                    soDoiXung(scanner);
                    break;
                case 3:
                    tinhGiaiThua(scanner);
                    break;
                case 4:
                    kiemTraSoHoanHao(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (luaChon != 0);
    }

    // Chức năng 1: Tìm chữ số lớn nhất
    public static void timChuSoLonNhat(Scanner scanner) {
        int n;
        do {
            System.out.print("Nhập số nguyên dương: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int max = 0, temp = n;
        while (temp > 0) {
            int chuSo = temp % 10;
            if (chuSo > max) {
                max = chuSo;
            }
            temp /= 10;
        }
        System.out.println("Số lớn nhất là: " + max);
    }

    // Chức năng 2: Tính số đối xứng
    public static void soDoiXung(Scanner scanner) {
        int n;
        do {
            System.out.print("Nhập số nguyên dương: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int soDaoNguoc = 0;
        int temp = n;
        while (temp > 0) {
            int chuSo = temp % 10;
            soDaoNguoc = soDaoNguoc * 10 + chuSo;
            temp /= 10;
        }
        if (soDaoNguoc == n) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không phải là số đối xứng.");
        }

    }

    // Chức năng 3: Tính giai thừa
    public static void tinhGiaiThua(Scanner scanner) {
        int n;
        do {
            System.out.print("Nhập số nguyên dương: ");
            n = scanner.nextInt();
        } while (n < 0);

        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println(n + "! = " + giaiThua);
    }

    // Chức năng 4: Kiểm tra số hoàn hảo
    public static void kiemTraSoHoanHao(Scanner scanner) {
        int n;
        do {
            System.out.print("Nhập số nguyên dương: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int tongUoc = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tongUoc += i;
            }
        }

        if (tongUoc == n) {
            System.out.println(n + " là số hoàn hảo.");
        } else {
            System.out.println(n + " không phải là số hoàn hảo.");
        }
    }
}
