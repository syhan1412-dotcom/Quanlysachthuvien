import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        int currentYear = LocalDate.now().getYear();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            this.namXuatBan = 0;
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            this.soLuong = 0;
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach      : " + maSach);
        System.out.println("Tieu de      : " + tieuDe);
        System.out.println("Tac gia      : " + tacGia);
        System.out.println("Nam xuat ban : " + namXuatBan);
        System.out.println("So luong     : " + soLuong);
    }
}

public class baithuchanhtuan8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        System.out.print("Nhap so luong sach can them: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhap thong tin sach thu " + (i + 1) + " ---");
            System.out.print("Nhap ma sach: ");
            String maSach = scanner.nextLine();

            System.out.print("Nhap tieu de: ");
            String tieuDe = scanner.nextLine();

            System.out.print("Nhap tac gia: ");
            String tacGia = scanner.nextLine();

            System.out.print("Nhap nam xuat ban: ");
            int namXuatBan = scanner.nextInt();

            System.out.print("Nhap so luong: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();

            Sach s = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
            danhSachSach.add(s);
        }

        System.out.println("\n=== DANH SACH SACH TRONG THU VIEN ===");
        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println("\nSach thu " + (i + 1) + ":");
            danhSachSach.get(i).hienThiThongTin();
        }

        scanner.close();
    }
}