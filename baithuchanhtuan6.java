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

public class baithuchanhtuan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> dsSach = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n--- MENU QUAN LY THU VIEN SACH ---");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Sua thong tin sach theo ma");
            System.out.println("6. Tinh tong so luong sach");
            System.out.println("7. Tinh tong gia tri sach");
            System.out.println("8. Thoat");
            System.out.print("Chon chuc nang (1-8): ");
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String ma = scanner.nextLine();
                    System.out.print("Ten sach: ");
                    String ten = scanner.nextLine();
                    System.out.print("So luong: ");
                    int sl = Integer.parseInt(scanner.nextLine());
                    System.out.print("Don gia: ");
                    double dg = Double.parseDouble(scanner.nextLine());
                    dsSach.add(new Sach(ma, ten, sl, dg));
                    System.out.println("Da them sach thanh cong!");
                    break;

                case 2:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                    } else {
                        System.out.println("\n--- DANH SACH THU VIEN ---");
                        for (int i = 0; i < dsSach.size(); i++) {
                            Sach s = dsSach.get(i);
                            System.out.println((i + 1) + ". Ma: " + s.maSach + " | Ten: " + s.tenSach + " | SL: " + s.soLuong + " | Don gia: " + s.donGia);
                        }
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
                                System.out.println("Tim thay -> Ma: " + s.maSach + " | Ten: " + s.tenSach + " | SL: " + s.soLuong + " | Don gia: " + s.donGia);
                                thay = true;
                            }
                        }
                        if (!thay) {
                            System.out.println("Khong tim thay sach co ma: " + maTim);
                        }
                    }
                    break;

                case 4:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                    } else {
                        System.out.print("Nhap ma sach can xoa: ");
                        String maXoa = scanner.nextLine();
                        boolean xoa = false;
                        for (int i = 0; i < dsSach.size(); i++) {
                            if (dsSach.get(i).maSach.equalsIgnoreCase(maXoa)) {
                                dsSach.remove(i);
                                xoa = true;
                                System.out.println("Da xoa thanh cong sach co ma: " + maXoa);
                                break;
                            }
                        }
                        if (!xoa) {
                            System.out.println("Khong tim thay ma sach de xoa!");
                        }
                    }
                    break;

                case 5:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                    } else {
                        System.out.print("Nhap ma sach can sua: ");
                        String maSua = scanner.nextLine();
                        boolean sua = false;
                        for (Sach s : dsSach) {
                            if (s.maSach.equalsIgnoreCase(maSua)) {
                                System.out.print("Nhap ten moi: ");
                                s.tenSach = scanner.nextLine();
                                System.out.print("Nhap so luong moi: ");
                                s.soLuong = Integer.parseInt(scanner.nextLine());
                                System.out.print("Nhap don gia moi: ");
                                s.donGia = Double.parseDouble(scanner.nextLine());
                                sua = true;
                                System.out.println("Cap nhat thong tin thanh cong!");
                                break;
                            }
                        }
                        if (!sua) {
                            System.out.println("Khong tim thay ma sach de sua!");
                        }
                    }
                    break;

                case 6:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                    } else {
                        int tongSL = 0;
                        for (Sach s : dsSach) {
                            tongSL += s.soLuong;
                        }
                        System.out.println("Tong so luong sach trong thu vien: " + tongSL);
                    }
                    break;

                case 7:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                    } else {
                        double tongGT = 0;
                        for (Sach s : dsSach) {
                            tongGT += s.soLuong * s.donGia;
                        }
                        System.out.println("Tong gia tri sach trong thu vien: " + tongGT);
                    }
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon tu 1 den 8.");
            }
        } while (chon != 8);

        scanner.close();
    }
}