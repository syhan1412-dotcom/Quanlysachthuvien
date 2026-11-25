import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach() {
    }

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void hienThi() {
        System.out.println("Ma sach      : " + maSach);
        System.out.println("Ngay nhap    : " + ngayNhap);
        System.out.printf("Don gia      : %.2f%n", donGia);
        System.out.println("So luong     : " + soLuong);
        System.out.println("Nha xuat ban : " + nhaXuatBan);
    }
}

class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Tinh trang   : " + tinhTrang);
        System.out.printf("Thanh tien   : %.2f%n", tinhThanhTien());
    }
}

class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public double tinhThanhTien() {
        return soLuong * donGia + thue;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Thue         : %.2f%n", thue);
        System.out.printf("Thanh tien   : %.2f%n", tinhThanhTien());
    }
}

public class baithuchanhtuan9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SachGiaoKhoa> dsSGK = new ArrayList<>();
        ArrayList<SachThamKhao> dsSTK = new ArrayList<>();

        System.out.print("Nhap so luong sach giao khoa: ");
        int nSGK = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nSGK; i++) {
            System.out.println("\n--- Nhap sach giao khoa thu " + (i + 1) + " ---");
            System.out.print("Nhap ma sach: ");
            String ma = scanner.nextLine();
            System.out.print("Nhap ngay nhap (ngay/thang/nam): ");
            String ngay = scanner.nextLine();
            System.out.print("Nhap don gia: ");
            double gia = scanner.nextDouble();
            System.out.print("Nhap so luong: ");
            int sl = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhap nha xuat ban: ");
            String nxb = scanner.nextLine();
            System.out.print("Nhap tinh trang (moi/cu): ");
            String tt = scanner.nextLine();

            dsSGK.add(new SachGiaoKhoa(ma, ngay, gia, sl, nxb, tt));
        }

        System.out.print("\nNhap so luong sach tham khao: ");
        int nSTK = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nSTK; i++) {
            System.out.println("\n--- Nhap sach tham khao thu " + (i + 1) + " ---");
            System.out.print("Nhap ma sach: ");
            String ma = scanner.nextLine();
            System.out.print("Nhap ngay nhap (ngay/thang/nam): ");
            String ngay = scanner.nextLine();
            System.out.print("Nhap don gia: ");
            double gia = scanner.nextDouble();
            System.out.print("Nhap so luong: ");
            int sl = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhap nha xuat ban: ");
            String nxb = scanner.nextLine();
            System.out.print("Nhap thue: ");
            double thue = scanner.nextDouble();
            scanner.nextLine();

            dsSTK.add(new SachThamKhao(ma, ngay, gia, sl, nxb, thue));
        }

        System.out.println("\n=== DANH SACH SACH GIAO KHOA ===");
        double tongTienSGK = 0;
        for (int i = 0; i < dsSGK.size(); i++) {
            System.out.println("\nSGK thu " + (i + 1) + ":");
            dsSGK.get(i).hienThi();
            tongTienSGK += dsSGK.get(i).tinhThanhTien();
        }

        System.out.println("\n=== DANH SACH SACH THAM KHAO ===");
        double tongTienSTK = 0;
        double tongDonGiaSTK = 0;
        for (int i = 0; i < dsSTK.size(); i++) {
            System.out.println("\nSTK thu " + (i + 1) + ":");
            dsSTK.get(i).hienThi();
            tongTienSTK += dsSTK.get(i).tinhThanhTien();
            tongDonGiaSTK += dsSTK.get(i).getDonGia();
        }

        System.out.println("\n=== THONG KE ===");
        System.out.printf("Tong thanh tien sach giao khoa : %.2f%n", tongTienSGK);
        System.out.printf("Tong thanh tien sach tham khao  : %.2f%n", tongTienSTK);

        if (dsSTK.size() > 0) {
            double trungBinhDonGiaSTK = tongDonGiaSTK / dsSTK.size();
            System.out.printf("Trung binh don gia sach tham khao: %.2f%n", trungBinhDonGiaSTK);
        } else {
            System.out.println("Khong co sach tham khao de tinh trung binh don gia.");
        }

        System.out.print("\nNhap ten nha xuat ban X can tim sach giao khoa: ");
        String nxbX = scanner.nextLine();
        System.out.println("--- Sach giao khoa cua nha xuat ban " + nxbX + " ---");
        boolean coSach = false;
        for (int i = 0; i < dsSGK.size(); i++) {
            if (dsSGK.get(i).getNhaXuatBan().equalsIgnoreCase(nxbX)) {
                dsSGK.get(i).hienThi();
                System.out.println("--------------------");
                coSach = true;
            }
        }
        if (!coSach) {
            System.out.println("Khong co sach giao khoa nao thuoc nha xuat ban nay.");
        }

        scanner.close();
    }
}