import java.time.Year;
import java.util.ArrayList;

class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

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
        int currentYear = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong duoc am!");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("-------------------------");
    }
}

public class BAITAPTUAN8 {
    public static void main(String[] args) {
        Sach s1 = new Sach("S01", "Lap trinh Java co ban", "Nguyen Van An", 2023, 10);
        Sach s2 = new Sach("S02", "Cau truc du lieu va Giai thuat", "Tran Thi Bui", 2022, 5);
        Sach s3 = new Sach("S03", "Thiet ke huong doi tuong", "Le Van Chien", 2024, 8);

        ArrayList<Sach> danhSachSach = new ArrayList<>();
        danhSachSach.add(s1);
        danhSachSach.add(s2);
        danhSachSach.add(s3);

        System.out.println("=== KIEM TRA SETTER HOP LE VA KHONG HOP LE ===");
        s1.setSoLuong(20);
        s1.setSoLuong(-5);
        s1.setNamXuatBan(2099);

        System.out.println("=== DANH SACH SACH TRONG THU VIEN ===");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}