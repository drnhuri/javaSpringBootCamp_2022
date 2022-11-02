public class Main {

    public static void main(String[] args){

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(2,3);
        System.out.println("iki sayinin toplami: " + sonuc);
        int sonuc2 = dortIslem.carp(2,3);
        System.out.println("iki sayinin carpimi: " + sonuc2);
    }
}
