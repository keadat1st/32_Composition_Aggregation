public class Driver {

   private String name;
   private String licenseNumber;
        
   public Driver(String name, String licenseNumber ){
      this.name = name;
      this.licenseNumber = licenseNumber;
   }
   
   public String getDriver(){
         return name + ", " + licenseNumber;
   }
   
   public String toString(){
         return name + ", " + licenseNumber;
   }

}
