// J.Martin 4-18-22 Project Two
public class Monkey extends RescueAnimal {
   // Instance variables
   private String species; // "Species" for monkey being the same as "breed" for dog, but limited to a certain set of acceptable types
   private String tailLength;
   private String height;
   private String bodyLength;

   // Constructor method (Paramaterized)
   public Monkey(String name, String tailLength, String height, String bodyLength, String species, String gender, String age, String weight, String acquisitionDate,
         String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {
      setName(name);
      setTailLength(tailLength);
      setHeight(height);
      setBodyLength(bodyLength);
      setSpecies(species);
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


   public String getSpecies() {
      return species;
   }

   public void setSpecies(String species) {
      this.species = species;
   }

   public String getTailLength() {
      return tailLength;
   }

   public void setTailLength(String tailLength) {
      this.tailLength = tailLength;
   }

   public String getHeight() {
      return height;
   }

   public void setHeight(String height) {
      this.height = height;
   }

   public String getBodyLength() {
      return bodyLength;
   }

   public void setBodyLength(String bodyLength) {
      this.bodyLength = bodyLength;
   }



}
