public class Main {
    public static void main(String[] args) {
        //Referance
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 30;
        System.out.println("İnteger'larda");
        System.out.println(sayi1);

        System.out.println("--------------");

        int[] sayilar1 ={1,2,3,4,5};
        int[] sayilar2 ={6,7,8,9};
        sayilar1 = sayilar2;
        sayilar2[0] =99999;
        System.out.println("Array'lerde");
        System.out.println(sayilar1[0]);
    }
}