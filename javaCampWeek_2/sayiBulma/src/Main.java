public class Main {

    public static void main(String[] args){
        int[] sayilar = new int[]{1,2,3,4,5};
        int aranacakSayi = 6;
        boolean varMi = false;

        for (int sayi: sayilar) {
            if(sayi == aranacakSayi){
                varMi = true;
            }
        }

        if(varMi){
            System.out.println("Sayi mevcuttur.");
        }
        else{
            System.out.println("Sayi mevcut degildir.");
        }
    }
}
