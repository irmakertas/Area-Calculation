package polymorphism.area;

public class AreaCalculator {
    void alanHesapla(){
        System.out.println("Alan hesaplanamiyor..Gecersiz sekil");
    }

    void alanHesapla(double kenar){
        System.out.println("Karenin alani:" + kenar * kenar);
    }
    void alanHesapla(double uzunuk, double genislik){
        System.out.println("Dikdortgenin alani:" + uzunuk * genislik);
    }

}
