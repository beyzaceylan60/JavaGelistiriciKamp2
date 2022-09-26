public class Main {
    public static void selamla(){

        System.out.println("Selaamm!!");
        System.out.println("Ben Beyza");
        System.out.println("Haydi Tüm Rakamları Sayalım.");
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

    }
    public static void topla(int sayi1,int sayi2){
        System.out.println(sayi1+" + "+sayi2+" = "+ (sayi1+sayi2));
    }
    public static void sayilariTopla(int... sayilar){
        int toplam = 0;
        for(int sayi: sayilar){
            toplam += sayi;
        }
        System.out.println("Girilen Tüm Sayıların Toplamı : "+ toplam);
    }
    public static void main(String[] args) {
        selamla();
        topla(3,6);
        sayilariTopla(2,5,3,7,9,4,2,1,4);
    }

}