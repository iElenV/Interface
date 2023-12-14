import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        KitchenBoss boss = new KitchenBoss(new Console());
        boss.MakeDinner(new ChickenCook());
        boss.MakeDinner(new PotatoCook());

        String[] strs = new String[]{"flow", "fe", "floght"};
        LongestPrefix (strs);




    }

     public static String LongestPrefix (String [] strs)
     {
         String result = "";
         int min_L = strs[0].length();
         for (int i = 0; i < strs.length; i++)
         {
             if (strs[i].length() <= min_L)
             {
                 min_L = strs[i].length();

             }
         }


         for (int i = 0; i < min_L; i++)
         {
             int k = 0;
             for (int j = 0; j < strs.length; j++)
             {
                 char symbol = strs[0].charAt(i);
                 if (strs[j].charAt(i) == symbol)
                 {
                     k++;

                 }

             }

             if (k == strs.length) {
                 result = result + strs[0].charAt(i);
             }
         }
         System.out.println("Результат " + result);
    return result; }
}