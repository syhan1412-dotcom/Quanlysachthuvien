import java.util.Scanner;

public class baithuchanhtuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        String[] maSach = new String[100];
        String[] tenSach = new String[100];
        String[] tacGia = new String[100];
        int[] namXuatBan = new int[100];
        double[] donGia = new double[100];
        int[] soLuong = new int[100];
        boolean daNhap = false;

        int chon;
        do {
            System.out.println("\n=== MENU QUAN LY SACH ===");
            System.out.println("1. Nhap n sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong dau sach n: ");
                    n = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhap sach thu " + (i + 1) + " ---");
                        System.out.print("Nhap ma sach: ");
                        maSach[i] = scanner.nextLine();

                        System.out.print("Nhap ten sach: ");
                        tenSach[i] = scanner.nextLine();

                        System.out.print("Nhap tac gia: ");
                        tacGia[i] = scanner.nextLine();

                        System.out.print("Nhap nam xuat ban: ");
                        namXuatBan[i] = scanner.nextInt();

                        System.out.print("Nhap don gia: ");
                        donGia[i] = scanner.nextDouble();

                        System.out.print("Nhap so luong: ");
                        soLuong[i] = scanner.nextInt();
                        scanner.nextLine();
                    }
                    daNhap = true;
                    break;

                case 2:
                    if (!daNhap) {
                        System.out.println("Chua co du lieu sach!");
                    } else {
                        int tongSoLuong = 0;
                        double tongGiaTri = 0;

                        for (int i = 0; i < n; i++) {
                            tongSoLuong = tongSoLuong + soLuong[i];
                            tongGiaTri = tongGiaTri + (donGia[i] * soLuong[i]);
                        }

                        System.out.println("Tong so luong sach: " + tongSoLuong);
                        System.out.printf("Tong gia tri sach : %.2f%n", tongGiaTri);
                    }
                    break;

                case 3:
                    if (!daNhap) {
                        System.out.println("Chua co du lieu sach!");
                    } else {
                        System.out.print("Nhap ma sach can tim: ");
                        String maCanTim = scanner.nextLine();
                        boolean timThay = false;

                        for (int i = 0; i < n; i++) {
                            if (maSach[i].equalsIgnoreCase(maCanTim)) {
                                System.out.println("\n--- Thong tin sach tim thay ---");
                                System.out.println("Ma sach      : " + maSach[i]);
                                System.out.println("Ten sach     : " + tenSach[i]);
                                System.out.println("Tac gia      : " + tacGia[i]);
                                System.out.println("Nam xuat ban : " + namXuatBan[i]);
                                System.out.printf("Don gia      : %.2f%n", donGia[i]);
                                System.out.println("So luong     : " + soLuong[i]);
                                timThay = true;
                                break;
                            }
                        }

                        if (!timThay) {
                            System.out.println("Khong tim thay sach co ma: " + maCanTim);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (chon != 0);

        scanner.close();
    }
}