package Polimerfisme2;

public class Hero {
    
    private int darah= 100;
    
    public String getName(){
        return null;
    }
    
    public int getSerangan (){
        return 0;
    }
    public void diSerang (Hero hero){
        diSerang(hero.getSerangan());
    }
    public void diSerang (int serangan){
        darah -=serangan;
        System.out.println(getName()+"Terkena Serangan"+serangan);
    }
    public void print (){
        System.out.println("Nama Hero : "+getName());
        System.out.println("Damage Hero :"+ getSerangan());
        System.out.println("Darah Hero: "+darah);
        
    }
}
