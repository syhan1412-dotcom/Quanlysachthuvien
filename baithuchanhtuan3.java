import java.util.Scanner;

public class baithuchanhtuan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== NHAP THONG TIN SACH ===");
        System.out.print("Nhap ma sach: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = scanner.nextInt();

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n=== THONG TIN PHIEU NHAP SACH ===");
        System.out.println("Ma sach        : " + maSach);
        System.out.println("Ten sach       : " + tenSach);
        System.out.println("Tac gia        : " + tacGia);
        System.out.println("Nam xuat ban   : " + namXuatBan);
        System.out.printf("Don gia        : %.2f%n", donGia);
        System.out.println("So luong       : " + soLuong);
        System.out.printf("Thanh tien     : %.2f%n", thanhTien);
        System.out.printf("Phi van chuyen : %.2f%n", phiVanChuyen);
        System.out.printf("Tong tien nhap : %.2f%n", tongTienNhap);

        scanner.close();
    }
}