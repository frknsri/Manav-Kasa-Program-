import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        System.out.println("********************************************************");
        double Elma  = 3.67  , Armut =  2.14  , Domates =  1.11  , Muz =  0.95  , Patlican =  5.00
         , total1, total2 , total3 ,total4 ,total5 ;
        System.out.println("----------DOMATES BİBER PATLICAN------------------------");
        Scanner inp = new Scanner(System.in);
        System.out.println("********************************************************");
        System.out.print ("Armut Kaç Kilo  ? : " );
        total1= inp.nextDouble();
        System.out.print("Elma Kaç Kilo  ? : " );
        total2 = inp.nextDouble();
        System.out.print("Domates Kaç Kilo  ? : " );
        total3 = inp.nextDouble();
        System.out.print("Muz Kaç Kilo  ? : " );
        total4 = inp.nextDouble();
        System.out.print("Patlican Kaç Kilo  ? : "  );
        total5 = inp.nextDouble();
        System.out.println("*******************************************************");
        double toplam = (Armut * total1) + (total2 * Elma) + (total3 * Domates) + (total4 * Muz) + (total5 * Patlican) ;
        System.out.println("--------------YERLİ MALI YURDUN MALI...----------------");
        boolean yeni = toplam <= 50 ;
        String yeni1 = yeni ? "TEBRİKLER ALIŞVERİİNİZ 50 TL ALTINDA TUTTU " : "MALESEF ALIŞVERİŞİNİZ 50 TL ÜSTÜNDE TUTTU " ;
        System.out.println("*******************************************************");
        System.out.println("Toplam Tutar  : " + toplam +  "TL" );
        System.out.println(yeni1);
    }
}
