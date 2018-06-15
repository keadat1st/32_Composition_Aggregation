public class Car {

      private Driver driver;
      private Engine engine;
      
      public Car(Driver driver){
      
         // Composition
         engine = new Engine();
      
         // Aggregation
         this.driver = driver;
      
         // Assosiation (and Composition)
         // this.driver = new Driver("Claus");
            
      }
       
      public Driver getDriver(){
         return driver;
      }
}
