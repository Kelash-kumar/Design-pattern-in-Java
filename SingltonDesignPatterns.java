/* THIS IS WORKING FINE IN MY PC CODE EDITOR BUT I DON'T KNOW WHY IT NOT RUN BY CLICKING ON RUN BUTTON GIVEN ABOVE IF YOU KNOW HOW TO CHANGE FILE YOU CAN DO YOURSELF BUT IT IS RUNNING ON REPLIT CMD MODE FINE;  */
class SingltonDesignPatterns
 {

   // create an object of SingltonDesignPatterns
   
   private static SingltonDesignPatterns
    singleDesign_Instance = new SingltonDesignPatterns();

   // make the constructor private so that this class cannot be
   // instantiated
   SingltonDesignPatterns() {
   }

   // created a method which will return the instance of this calss
   public static SingltonDesignPatterns
    getInstance() {
      return singleDesign_Instance;
   }

   public void showMessage() {
      System.out.println("this is singlton design pattern object key generated : ");
   }

   public static void main(String[] args) {
      SingltonDesignPatterns singltenDesignPattern_1 = new SingltonDesignPatterns();
      System.out.println(getInstance());
      singltenDesignPattern_1.showMessage();

   }

}