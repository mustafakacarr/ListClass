import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("liste.getList() Durumu : " + (liste.getList().isEmpty() ? "Boş" : "Dolu"));
        liste.getList().add(10);
        liste.getList().add(20);
        liste.getList().add(30);
        liste.getList().add(40);
        liste.getList().add(20);
        liste.getList().add(50);
        liste.getList().add(60);
        liste.getList().add(70);

        System.out.println("liste.getList() Durumu : " + (liste.getList().isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.getList().indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.getList().indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste.getList().lastIndexOf(20));

        // liste.getList()yi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.getList().toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu

        java.util.List<Integer> altListem = liste.getList().subList(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.getList().contains(20));
        System.out.println("Listemde 120 değeri : " + liste.getList().contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.getList().clear();
        System.out.println(liste.getList().toString());

    }
}
