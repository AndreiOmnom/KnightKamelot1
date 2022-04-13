package com.company;

public class Knight extends Hero{



     String horse;

    public Knight(int health, int energy, int power, int money, String horse) {
        super(health, energy, power, money);
        this.horse = horse;

    }

     public void horse(){
         setEnergy(getEnergy()+5);
         setPower((int)getPower()+10);

     }
//
//    public void prositMilost() {
//        int milost = random.nextInt(21);
//        if (hero.getEnergy() >= 2) {
//            hero.setMoney(hero.getMoney()+milost);
//            hero.setEnergy(hero.getEnergy()-2);
//            System.out.println("Вам пожертвовали: " + milost + " монет\n");
//        } else {
//            System.out.println("У вас недостаточно энергии!");
//
//        }




   @Override

   public String toString() {

       return "Кличка боевого коня:"+ horse + super.toString();
   }


}








