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
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
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

public class baitaptuan7 {
    public static void main(String[] args) {
        Sach s1 = new Sach("S01", "Lap trinh Java co ban", "Nguyen Van An", 2023, 10);
        Sach s2 = new Sach("S02", "Cau truc du lieu va Giai thuat", "Tran Thi Bui", 2022, 5);
        Sach s3 = new Sach("S03", "Thiet ke huong doi tuong", "Le Van Chien", 2024, 8);

        System.out.println("=== THONG TIN 1 CUON SACH ===");
        s1.hienThiThongTin();

        ArrayList<Sach> danhSachSach = new ArrayList<>();
        danhSachSach.add(s1);
        danhSachSach.add(s2);
        danhSachSach.add(s3);

        System.out.println("=== DANH SACH SACH TRONG THU VIEN ===");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }

        danhSachSach.removeIf(s -> s.getMaSach().equals("S02"));
        System.out.println("So luong dau sach con lai sau khi xoa S02: " + danhSachSach.size());
    }
}