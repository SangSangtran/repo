package demo1_kethua_dahinh;

public abstract class HinhHoc {
    public float PI = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;

    public HinhHoc() {
        this.ten = "Hinh";
    }

    public void xuatTen() {
        System.out.println(ten);
    }
    public abstract void inChuVi();
    public abstract void inDienTich();
    public abstract void inTheTich();
}
