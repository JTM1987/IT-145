// Jesse M. , 4/18/22 Project Two
public class Dog extends RescueAnimal {

   // Instance variable
   private String breed;

   // Constructor
   public Dog(String name, String breed, String gender, String age, String weight, String acquisitionDate,
         String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {
      setName(name);
      setBreed(breed);
      setGender(gender);
      setAge(age);
      setWeight(weight);
      setAcquisitionDate(acquisitionDate);
      setAcquisitionLocation(acquisitionCountry);
      setTrainingStatus(trainingStatus);
      setReserved(reserved);
      setInServiceCountry(inServiceCountry);

   }
   
   @Override
   public String toString() { // 
      return "Name " + getName() + " Status: " + getTrainingStatus() + " Country of Origin(Acquisition): " + getAcquisitionLocation() + " Reserved: " + getReserved();  
   }

   // Accessor Method
   public String getBreed() {
      return breed;
   }

   // Mutator Method
   public void setBreed(String dogBreed) {
      breed = dogBreed;
   }

}
