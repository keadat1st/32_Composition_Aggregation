public class GTA {

   public static void main(String[] args){
   
      Car bmw = new Car();
      System.out.println(bmw.getDriver().toString());
      
      Driver[] drivers = bmw.getDrivers();
      
      for(int i = 0; i <= 1; i++){
         System.out.println(drivers[i].getDriver());
      }
      
      //System.out.println(bmw.getDrivers());
      
     
   
   
   }


}