package Polimerfisme2;

public class Dota2 {
    public static void main(String[] args) {
        Hero jakiro = new Jakiro();
        Hero drowrangger = new Drowrangger();
        jakiro.print();
        drowrangger.print();
        jakiro.diSerang(drowrangger);
        jakiro.print();
        drowrangger.diSerang(jakiro.getSerangan());
        drowrangger.print();
        
    }
}


