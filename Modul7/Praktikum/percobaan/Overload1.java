package Modul7.Praktikum.percobaan;

public class Overload1 {
    void myMethod(short s){
        System.out.println("Short");
    }
    void myMethod(int i){
        System.out.println("int");
    }
    void myMethod(long l){
        System.out.println("long");
    }

    public static void main(String[] args){
        byte b = 1;
        Overload1 o = new Overload1();
        o.myMethod(b);
        /*
         + statement di atas akan menghasilkan "Short"
         * Karena Short lebih dekat dengan byte daripada int / long
         */
    }
}
