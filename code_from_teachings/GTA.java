public class GTA {
 
   private static Driver driver = new Driver("Kenneth");
   private static Car bmw = new Car(driver);

   public static void main(String[] args){

      System.out.println(bmw.getDriver());
      
      
      
      
      
      
      
      
      /*Driver[] drivers = bmw.getDrivers();
      
      for(int i = 0; i <= 1; i++){
         System.out.println(drivers[i].getDriver());
      }*/
      
      //System.out.println(bmw.getDrivers());
      
     
   
   
   }


}