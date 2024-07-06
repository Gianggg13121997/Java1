import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class btvn {
    public static void main(String[] args) {
        //NHẬP XUẤT
       /* String bt1 = " Hello World";
        System.out.println(bt1);
        String bt21 = "Hello World";
        System.out.print(bt21);
        String bt2 = "Hi anh em";
        System.out.print(bt2);
        Scanner input = new Scanner(System.in);
        System.out.println("vui lòng nhập : ");
        String name = input.nextLine();
        System.out.println("tên của bạn là : " + name);
        */
        // KIỂU DỮ LIỆU :
        //  int number = 13;
        //System.out.println(number);
        //   Scanner number1 = new Scanner(System.in);
        //  System.out.println("Vui lòng nhập: ");
        // int a = number1.nextInt();
        // System.out.println("Số bạn nhập là : " + a);

     /*
      Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1 = num1.nextInt();
        System.out.println("số thứ nhất là : " + number1);
        int number2 = num2.nextInt();
        System.out.println("số thứ hai là : " + number2);
        int sum = number1 + number2;
        System.out.println("tổng là : " + sum);
        int hieu = number1 - number2;
        System.out.println("Hiệu là :" + hieu);
        int tich = number1*number2;
        System.out.println("Tích là : " + tich);
        int thuong = number1/number2;
        System.out.println("thương là :" + thuong);
        int sodu = number1%number2;
        System.out.println("số dư là :" +sodu);

      */
      /*  Scanner name = new Scanner(System.in);
        System.out.println("nhập tên của bạn :");
        String name1 = name.nextLine();
        Scanner age = new Scanner(System.in);
        System.out.println("NHập tuổi của bạn");
        int age1 = age.nextInt();
        System.out.println("tên bạn là : " + name1+" , " + "tuổi bạn là : " + age1);

             */
        // TOÁN TỬ
        /*  Scanner num1 = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất :");
        int a = num1.nextInt();
        System.out.println("số thứ nhất là : " + a);
        Scanner num2 = new Scanner(System.in);
        System.out.println("Nhập vào số thứ hai :");
        int b = num2.nextInt();
        System.out.println("Số thứ hai là : " + b);

       */
        //  int c = a + b;
        // int d = a - b;
        // int e = a * b;
        // int f =a/b;
        // int g = a%b;
        // System.out.println("tổng là : " + c +"\n" + "Hiệu là :" + d + "\n" + "tích là : " + e +"\n" + "thương là : " + f + "\n" + "chia dư là : " + g );
       /* boolean bangnhau = (a == b);
        System.out.println("bangnhau : " + bangnhau);
        int c = a+=b;
        System.out.println(c);
        int d=a-=b;
        System.out.println(d);
        int e=a*=b;
        System.out.println(e);
        int f = a/=b;
        System.out.println(f);

        */
      /*  int c = ++a;
        System.out.println(c);
        int d = ++b;
        System.out.println(d);
        int e = --a;
        System.out.println(e);
        int f = --b;
        System.out.println(f);

       */
       /* boolean lonhon = (a>b);
        System.out.println("lớn hơn " + lonhon);
        boolean nhohon = (a<b);
        System.out.println("nhỏ hơn " + nhohon);
        boolean lonhonbang = (a>=b);
        System.out.println( "lớn hơn bằng " +lonhonbang);
        boolean nhohonbang = (a<=b);
        System.out.println("nhỏ hơn bằng : " +nhohonbang);
        boolean bang = (a==b);
        System.out.println("bằng nhau " + bang);
        boolean khac = (a!=b);
        System.out.println("khác nhau " + khac);

        */
        //ĐIỀU kiện :
        //Bài 1
        // if (a%b==0){
        //    System.out.println("a có chia hết cho b");
        // }else {
        //   System.out.println("a không chia hết cho b");
        //}
        //Bài 2
       /* Scanner age = new Scanner(System.in);
        System.out.println("NHập tuổi");
        int tuoi = age.nextInt();
        if (tuoi == 17 || tuoi == 16) {
            System.out.println("Đủ điều kiện");
        }else {
            System.out.println("Không đúng điều kiện nhập học!");
        }

        */

        /* Scanner songuyen = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kì :");
        int songuyenn = songuyen.nextInt();
        if(songuyenn>0){
            System.out.println(songuyenn + " lớn hơn 0");
        } else if (songuyenn==0) {
            System.out.println(" là 0");

        }else {
            System.out.println(songuyenn + " Nhỏ hơn 0");
        }

         */
      /* Scanner number1 = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất :");
        int so1 = number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        System.out.println("Nhập số thứ 2");
        int so2 = number2.nextInt();
        Scanner number3 = new Scanner(System.in);
        System.out.println("Nhập số thứ 3");
        int so3 = number3.nextInt();
        if(so1 > so2 && so1 > so3){
            System.out.println("số lớn nhất là " + so1);
        }else if(so2 > so3 && so2 > so1){
            System.out.println("số lớn nhất là " + 2);
        } else {
            System.out.println("số lớn nhất là " + so3);
        }

       */
        //Bài 5
        /* Scanner diemKT = new Scanner(System.in);
        System.out.println("Nhập điểm kiểm tra :");
        int kt = diemKT.nextInt();
        Scanner diemGKT = new Scanner(System.in);
        System.out.println("Nhập điểm giữa kì : ");
        int gkt = diemGKT.nextInt();
        Scanner diemCK = new Scanner(System.in);
        System.out.println("Nhập điểm cuối kì : ");4
        int ckt = diemCK.nextInt();
        if (kt >= 8 && gkt >= 8 && ckt >= 8) {
            System.out.println("xếp loại Giỏi");
        } else if (kt<5&& gkt<5 && ckt<5) {
            System.out.println("xếp loại dốt");
            
        }else if(kt>10 && gkt>10 && ckt>10) {
            System.out.println("Điểm không hợp lệ");
        } else if (kt<0 && gkt > 0 && ckt > 0) {
            System.out.println("điểm không hợp lệ");
            
        }else {
            System.out.println("xếp loại trung bình");
        }

         */ //bài 6
       /* Scanner doanhso = new Scanner(System.in);
        System.out.println("Nhập doanh số :");
        int ds = doanhso.nextInt();
        if(ds >1000){
            System.out.println("Hoa hồng nhận đc là 10%");
        } else {
            System.out.println("bạn bán quá tệ , không có hoa hồng !");
        }

        */
        //Bài 7
       /* Scanner tienDT = new Scanner(System.in);
        System.out.println("Nhập số phút gọi thoại :");
        int dt = tienDT.nextInt();
        Scanner tienTN = new Scanner(System.in);
        System.out.println("Nhập số tin nhắn :");
        int tn = tienTN.nextInt();
        int tiendt = dt * 1000;
        int tientn = tn * 100;
        System.out.println("số tiền phát sinh khi gọi là : " + tiendt + "số tiền nhắn tin là : " + tientn +"\n" + "tổng là : " + (tiendt+tientn));

        */
         /* Scanner chuyendoi = new Scanner(System.in);
        System.out.println("Nhập độ C :");
        int doC = chuyendoi.nextInt();

        int doF = 9/5 * doC +32;
        System.out.println( doC + "độ C =" + doF + "độ F");

          */ //Bài 2
        /* Scanner metter = new Scanner(System.in);
        System.out.println("Nhập số mét : ");
        double m = metter.nextDouble();
        double f = (m *3.2808);
        System.out.println(m + " mét = " + f + "feet");

         */ //Bài 3:
        /*Scanner canhA = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int a =canhA.nextInt();
        int dientich = a*a;
        System.out.println("diện tích hình vuông cạnh " + a + "là : " +dientich);

         */
         //Bài 4 :
      /* Scanner canhA = new Scanner(System.in);
        System.out.println("Nhập cạnh a :");
        int a = canhA.nextInt();
        Scanner canhB = new Scanner(System.in);
        System.out.println("Nhập cạnh b : ");
        int b = canhB.nextInt();
        int dientich = a *b;
        System.out.println("diện tích hình vuông đó là : " + dientich);

       */
        //Bài 5 :
      /*  Scanner canhA = new Scanner(System.in);
        System.out.println("Nhập cạnh kề a :");
        int a= canhA.nextInt();
        Scanner canhB = new Scanner(System.in);
        System.out.println("Nhập cạnh b :");
        int b= canhB.nextInt();
        int dienTich = (a*b)/2;
        System.out.println("diện tích tam giác vuông là : " + dienTich);

       */
        //Bài 6 :
      /*  Scanner soA = new Scanner(System.in);
        System.out.println("Nhập số a : ");
        int a = soA.nextInt();
        Scanner soB = new Scanner(System.in);
        System.out.println("Nhập số b : ");
        int b = soB.nextInt();
        if(a== 0 || b== 0){
            System.out.println("Phương trình vô nghiệm");

        }else {
            System.out.println("ta có phương trình ax +b = 0");
            int x = -b/a;
            System.out.println("x = -b/a " +"\n" + "x = " + x);
        }

       */
        //Bài 7 :
       /* Scanner soA = new Scanner(System.in);
        System.out.println("nhập số a : ");
        int a = soA.nextInt();
        Scanner soB = new Scanner(System.in);
        System.out.println("Nhập số b");
        int b = soB.nextInt()
        Scanner soC = new Scanner(System.in);
        System.out.println("Nhập số C : ");
        int c = soC.nextInt();
        System.out.println("ta có phương trình ax^2 + bx + c = 0");
        int th1 = -b/c;
        if(a==0){
            System.out.println("a = 0 nên phương trình trở thành bậc một : bx + c = 0 +> x =-b/c " + th1);
        }

        */

           //Bài 8 :
       /* Scanner age = new Scanner(System.in);
        System.out.println("Nhập số tuổi : ");
        int tuoi = age.nextInt();
        if(0<tuoi && tuoi <120){
            System.out.println("Tuổi của bạn là : " + tuoi);
        }else {
            System.out.println("tuổi ko hợp lệ !");
        }

        */
      /*  Scanner canhA = new Scanner(System.in);
        System.out.println("Nhập cạnh a : ");
        int a = canhA.nextInt();
        Scanner canhB = new Scanner(System.in);
        System.out.println("Nhập cạnh b : ");
        int b = canhB.nextInt();
        Scanner canhC = new Scanner(System.in);
        System.out.println("Nhập cạnh c : ");
        int c = canhC.nextInt();

            if(a >0 && b > 0 && c > 0){
                System.out.println("các cạnh lớn hơn 0 hợp lệ");

            }else {
                System.out.println("các cạnh nhỏ hơn 0 không hợp lệ");
        } if(a+b>c && b+c>a && a+c>b){
            System.out.println("a b c là 3 cạnh của tam giác");
        } else {
            System.out.println(" a b c không là cạnh của tam giác");
        }

       */
        //Bài 10 :
      /*  Scanner tienDien = new Scanner(System.in);
        System.out.println( " Nhập số điện đã tiêu thụ : ");
        int dien = tienDien.nextInt();
        if(dien<1000){
            int tinhTien = dien*3000;
            System.out.println("tiền điện của bạn là " + tinhTien);
        } else if (dien>=1000) {
            int tinhTien = dien*5000;
            System.out.println("tiền điện của bạn là " + tinhTien);

        }

       */


    }


}