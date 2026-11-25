import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    String maSach;
    String tieuDe;
    String tacGia;
    int namXuatBan;
    int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach      : " + maSach);
        System.out.println("Tieu de      : " + tieuDe);
        System.out.println("Tac gia      : " + tacGia);
        System.out.println("Nam xuat ban : " + namXuatBan);
        System.out.println("So luong     : " + soLuong);
    }
}

public class baithuchanhtuan7 {
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