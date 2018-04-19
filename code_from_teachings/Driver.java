public class Driver {

   private String name;
   private String licenseNumber;
        
   public Driver(String name){
      this.name = name;
   }
   
   public String getDriver(){
         return name;
   }
   
   public String toString(){
         return name + ", " + licenseNumber;
   }

}