import java.util.ArrayList;
import java.util.Scanner;

public class baithuchanhtuan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> danhSachSach = new ArrayList<>();
        ArrayList<Integer> dsSoLuong = new ArrayList<>();
        ArrayList<Double> dsDonGia = new ArrayList<>();

        int chon;
        do {
            System.out.println("\n=== MENU QUAN LY SACH ===");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhap ten sach: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tacGia = scanner.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = scanner.nextInt();
                    System.out.print("Nhap don gia: ");
                    double gia = scanner.nextDouble();
                    System.out.print("Nhap so luong: ");
                    int sl = scanner.nextInt();
                    scanner.nextLine();

                    String thongTin = ma + " - " + ten + " - " + tacGia + " - " + nam + " - Gia: " + gia + " - SL: " + sl;
                    danhSachSach.add(thongTin);
                    dsDonGia.add(gia);
                    dsSoLuong.add(sl);
                    System.out.println("Da them sach thanh cong!");
                    break;

                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach trong!");
                    } else {
                        System.out.println("\n--- Danh sach sach ---");
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach hoac tu khoa can tim: ");
                    String tuKhoa = scanner.nextLine();
                    boolean timThay = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).toLowerCase().contains(tuKhoa.toLowerCase())) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                            timThay = true;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = scanner.nextLine();
                    boolean daXoa = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).toLowerCase().startsWith(maXoa.toLowerCase() + " -")) {
                            danhSachSach.remove(i);
                            dsDonGia.remove(i);
                            dsSoLuong.remove(i);
                            daXoa = true;
                            System.out.println("Da xoa sach!");
                            break;
                        }
                    }
                    if (!daXoa) {
                        System.out.println("Khong tim thay sach de xoa!");
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = scanner.nextLine();
                    boolean daSua = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).toLowerCase().startsWith(maSua.toLowerCase() + " -")) {
                            System.out.print("Nhap ten sach moi: ");
                            String tenMoi = scanner.nextLine();
                            System.out.print("Nhap tac gia moi: ");
                            String tacGiaMoi = scanner.nextLine();
                            System.out.print("Nhap nam xuat ban moi: ");
                            int namMoi = scanner.nextInt();
                            System.out.print("Nhap don gia moi: ");
                            double giaMoi = scanner.nextDouble();
                            System.out.print("Nhap so luong moi: ");
                            int slMoi = scanner.nextInt();
                            scanner.nextLine();

                            String thongTinMoi = maSua + " - " + tenMoi + " - " + tacGiaMoi + " - " + namMoi + " - Gia: " + giaMoi + " - SL: " + slMoi;
                            danhSachSach.set(i, thongTinMoi);
                            dsDonGia.set(i, giaMoi);
                            dsSoLuong.set(i, slMoi);
                            daSua = true;
                            System.out.println("Da cap nhat sach!");
                            break;
                        }
                    }
                    if (!daSua) {
                        System.out.println("Khong tim thay sach de sua!");
                    }
                    break;

                case 6:
                    int tongSoLuong = 0;
                    for (int i = 0; i < dsSoLuong.size(); i++) {
                        tongSoLuong = tongSoLuong + dsSoLuong.get(i);
                    }
                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    break;

                case 7:
                    double tongGiaTri = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        tongGiaTri = tongGiaTri + (dsDonGia.get(i) * dsSoLuong.get(i));
                    }
                    System.out.printf("Tong gia tri sach: %.2f%n", tongGiaTri);
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (chon != 8);

        scanner.close();
    }
}