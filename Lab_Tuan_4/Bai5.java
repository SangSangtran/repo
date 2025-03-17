class Sach {
    String maSach;
    String tenSach;
    String tacGia;
    long gia;

    public Sach() {
        this.maSach = "";
        this.tenSach = "";
        this.tacGia = "";
        this.gia = 0;
    }

    public Sach(long gia, String maSach, String tacGia, String tenSach) {
        this.gia = gia;
        this.maSach = maSach;
        this.tacGia = tacGia;
        this.tenSach = tenSach;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public long getGiaSauGiam() {
        return gia;
    }

    public void xuat() {
        System.out.println("Ma sach: " + maSach + "Ten sach: " + tenSach + "Tac gia: " + tacGia + "Gia: " + gia;
    }
}



public class Bai5 {
    public static void main(String[] args) {

    }
}