public class Main {
    public static void main(String[] args){
        String mesaj = "Java Spring Boot Odev 2";
        String yeniMesaj = sehir();
        System.out.println(yeniMesaj);
        int sayi = topla(8,23);
        System.out.println(sayi);
        int sayi2 = topla2(1,2,3,4,5);
        System.out.println(sayi2);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Guncellendi");
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
    //Variable Arguments
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
    public static String sehir(){
        return "Istanbul";
    }
}
