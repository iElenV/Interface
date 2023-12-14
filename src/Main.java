import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

      KitchenBoss boss = new KitchenBoss( new Console());
      boss.MakeDinner(new ChickenCook());
      boss.MakeDinner(new PotatoCook());
       // System.out.println("Error");
        // Console console = new Console();






    }
}