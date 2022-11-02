
public class Main {

    public static void main(String[] args){
        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]{new OgretmenKrediManager(), new OgrenciKrediManager(), new TarımKrediManager()};

        for (BaseKrediManager baseKrediManager:baseKrediManagers) {
            System.out.println(baseKrediManager.hesapla(1000));
        }
    }

}
