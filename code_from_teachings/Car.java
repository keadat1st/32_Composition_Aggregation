public class Car {

      private Driver driver;
      
      public Car(){
      
         // Assosiation
         driver = new Driver("Claus");
      }
      
      
      public Driver getDriver(){
         return driver;
      }

}