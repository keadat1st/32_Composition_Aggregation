public class GTA {
 
   
   public static void main(String[] args){

      Driver driver = new Driver("Kenneth");
      Car bmw = new Car(driver);

      System.out.println(bmw.getDriver());
   }
}
