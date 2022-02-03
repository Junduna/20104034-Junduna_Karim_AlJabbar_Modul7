package Modul7.Praktikum.percobaan;

class A{}
class B extends A{}
class C extends B{}
public class Overload {
    void myOverload(A a){
        System.out.println("Overload.myOverload(A a)");
    }
    void myOverload(B b){
        System.out.println("Overload.myOverload(B b)");
    }
    public static void main(String[] args){
        Overload o = new Overload();
        C c = new C();
        o.myOverload(c);
        /*
         * Statement di atas akan menjalankan myOverload(B b)
         * karena method tersebut lebih dekat dengan
         * method yang dicari bila dibandingiin myOverload(A a)
         */
    }
}
