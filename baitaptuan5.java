import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double donGia;

    public Sach(String maSach, String tenSach, int soLuong, double donGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
}

public class baitaptuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> dsSach = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n--- QUAN LY THU VIEN SACH ---");
            System.out.println("1. Nhap n sach bang vong lap");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach n: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap sach thu " + (i + 1) + ":");
                        System.out.print("Ma sach: ");
                        String ma = scanner.nextLine();
                        System.out.print("Ten sach: ");
                        String ten = scanner.nextLine();
                        System.out.print("So luong: ");
                        int sl = Integer.parseInt(scanner.nextLine());
                        System.out.print("Don gia: ");
                        double dg = Double.parseDouble(scanner.nextLine());
                        dsSach.add(new Sach(ma, ten, sl, dg));
                    }
                    break;

                case 2:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                    } else {
                        int tongSL = 0;
                        double tongGT = 0;
                        for (Sach s : dsSach) {
                            tongSL += s.soLuong;
                            tongGT += s.soLuong * s.donGia;
                        }
                        System.out.println("Tong so luong sach: " + tongSL);
                        System.out.println("Tong gia tri sach: " + tongGT);
                    }
                    break;

                case 3:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                    } else {
                        System.out.print("Nhap ma sach can tim: ");
                        String maTim = scanner.nextLine();
                        boolean thay = false;
                        for (Sach s : dsSach) {
                            if (s.maSach.equalsIgnoreCase(maTim)) {
                                System.out.println("Da tim thay: Ma: " + s.maSach + " | Ten: " + s.tenSach + " | SL: " + s.soLuong + " | Gia: " + s.donGia);
                                thay = true;
                            }
                        }
                        if (!thay) {
                            System.out.println("Khong tim thay sach co ma: " + maTim);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        scanner.close();
    }
}