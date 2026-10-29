import java.util.Scanner;

public class baitaptuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- NHAP THONG TIN MOT CUON SACH (TUAN 4) ---");
        
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

        if (donGia <= 0 || soLuong < 0 || namXuatBan < 1000 || namXuatBan > 2026) {
            System.out.println("Loi: Thong tin nhap khong hop le (Gia > 0, So luong >= 0, Nam XB tu 1000 den 2026)!");
        } else {
            System.out.println("--- CHON LOAI SACH ---");
            System.out.println("1. Sach giao khoa");
            System.out.println("2. Sach tham khao");
            System.out.println("3. Sach chuyen nganh");
            System.out.println("4. Sach khac");
            System.out.print("Nhap lua chon (1-4): ");
            int chonLoai = scanner.nextInt();
            
            String loaiSach = "";
            switch (chonLoai) {
                case 1:
                    loaiSach = "Sach giao khoa";
                    break;
                case 2:
                    loaiSach = "Sach tham khao";
                    break;
                case 3:
                    loaiSach = "Sach chuyen nganh";
                    break;
                case 4:
                    loaiSach = "Sach khac";
                    break;
                default:
                    loaiSach = "Khong xac dinh";
                    break;
            }

            double thanhTien = donGia * soLuong;
            double phiVanChuyen = thanhTien * 0.05;
            double tongTienNhap = thanhTien + phiVanChuyen;

            // Bài 2: Phân loại giá
            String phanLoaiGia = "";
            if (donGia < 50000) {
                phanLoaiGia = "Sach gia thap";
            } else if (donGia <= 100000) {
                phanLoaiGia = "Sach gia trung binh";
            } else if (donGia <= 200000) {
                phanLoaiGia = "Sach gia cao";
            } else {
                phanLoaiGia = "Sach gia dac biet";
            }

            String phanLoaiTonKho = "";
            if (soLuong == 0) {
                phanLoaiTonKho = "Het sach";
            } else if (soLuong <= 5) {
                phanLoaiTonKho = "Sap het";
            } else if (soLuong <= 20) {
                phanLoaiTonKho = "Con it";
            } else {
                phanLoaiTonKho = "Con nhieu";
            }

            System.out.println("\n--- THONG TIN VA KET QUA XU LY ---");
            System.out.println("Ma sach         : " + maSach);
            System.out.println("Ten sach        : " + tenSach);
            System.out.println("Tac gia         : " + tacGia);
            System.out.println("Nam xuat ban    : " + namXuatBan);
            System.out.println("Loai sach       : " + loaiSach);
            System.out.printf("Don gia         : %,.0f VND\n", donGia);
            System.out.println("So luong        : " + soLuong);
            System.out.printf("Thanh tien      : %,.0f VND\n", thanhTien);
            System.out.printf("Phi van chuyen  : %,.0f VND\n", phiVanChuyen);
            System.out.printf("Tong tien nhap  : %,.0f VND\n", tongTienNhap);
            System.out.println("Phan loai gia   : " + phanLoaiGia);
            System.out.println("Tinh trang kho  : " + phanLoaiTonKho);
        }

        scanner.close();
    }
}