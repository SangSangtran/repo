package demo.kethua;

public class HinhHoc {
        public String ten;
        public float chuVi;
        public float dienTich;
        public float theTich;
        public float PI = 3.14f;

        public HinhHoc() {
            ten = "hinh";
        }

        public void xuatTen() {
            System.out.println(ten);
        }

        public void inChuVi() {
            System.out.println("Chu vi: " + chuVi);
        }

        public void inDienTich() {
            System.out.println("Dien tich: " + dienTich);
        }

        public void inTheTich() {
            System.out.println("The tich: " + theTich);
        }
}
