import java.util.Scanner;

public class Woman extends People {
    public Woman(double w,double h,String s) {
        gender=false;
        height=h;
        Last_Name=s;
        weight=w;
    }
    public People Make_People(People o){
        Man chaild=new Man(o.weight/2,o.height/2,o.Last_Name);
        Scanner scanner = new Scanner(System.in);
        chaild.First_Name=scanner.next();
        return chaild;


    }
}
