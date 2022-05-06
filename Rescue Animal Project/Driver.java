
// Jesse M. , 4/18/22 , IT-145 Project Two
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class Driver {
   private static ArrayList<Dog> dogList = new ArrayList<Dog>();
   private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
   // Instance variables (if needed)

   public static void main(String[] args) {
      boolean newInput = true;
      Scanner input = new Scanner(System.in);
      initializeDogList();
      initializeMonkeyList();

      // Add a loop that displays the menu, accepts the users input
      // and takes the appropriate action.
      // For the project submission you must also include input validation
      // and appropriate feedback to the user.
      // Hint: create a Scanner and pass it to the necessary
      // methods
      // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
      // method.

      // Loop for navigating menu
      do {
         displayMenu();
         String choice = input.nextLine().trim();

         switch (choice) {
         case "1":
            // Choice to input a new dog
            intakeNewDog(input);
            break;
         case "2":
            // Choice to input a new monkey
            intakeNewMonkey(input);
            break;
         case "3":
            // Choice to reserve an animal
            reserveAnimal(input);
            break;
         case "4":
            // Choice to print list of dogs
            printAnimals("dog");
            break;
         case "5":
            // Choice to print a list of monkeys
            printAnimals("monkey");
            break;
         case "6":
            // Choice to print a list of non-reserved animals 
            printAnimals("available");
            break;
         case "q":
            // Quit application
            newInput = false;
            break;
         default:
            System.out.println("You must enter a valid selection");
         }
      } while (newInput);

   }

   // This method prints the menu options
   public static void displayMenu() {
      System.out.println("\n\n");
      System.out.println("\t\t\t\tRescue Animal System Menu");
      System.out.println("[1] Intake a new dog");
      System.out.println("[2] Intake a new monkey");
      System.out.println("[3] Reserve an animal");
      System.out.println("[4] Print a list of all dogs");
      System.out.println("[5] Print a list of all monkeys");
      System.out.println("[6] Print a list of all animals that are not reserved");
      System.out.println("[q] Quit application");
      System.out.println();
      System.out.println("Enter a menu selection");
   }

   // Adds dogs to a list for testing
   public static void initializeDogList() {
      Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false,
            "United States");
      Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false,
            "United States");
      Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
            "Canada");

      dogList.add(dog1);
      dogList.add(dog2);
      dogList.add(dog3);
   }

   // Adds monkeys to a list for testing
   // Optional for testing
   public static void initializeMonkeyList() {
      Monkey monkeyOne = new Monkey("Name", "12.0", "6.0", "12.0", "Capuchin", "Female", "1", "55.5", "4-1-2022", "USA",
            "intake", false, "USA");
      monkeyList.add(monkeyOne);
   }

   // Complete the intakeNewDog method
   // The input validation to check that the dog is not already in the list
   // is done for you
   public static void intakeNewDog(Scanner scanner) {
      System.out.println("What is the dog's name?");
      String name = scanner.nextLine();
      for (Dog dog : dogList) {
         if (dog.getName().equalsIgnoreCase(name)) {
            System.out.println("\n\nThis dog is already in our system\n\n");
            return; // returns to menu
         }
      }
      // Add the code to instantiate a new dog and add it to the appropriate list

      System.out.println("What is " + name + "'s breed?");
      String breed = scanner.nextLine();

      System.out.println("What is " + name + "'s gender?");
      String gender = scanner.nextLine();

      System.out.println("What is " + name + "'s age?");
      String age = scanner.nextLine();

      System.out.println("What is " + name + "'s weight?");
      String weight = scanner.nextLine();

      System.out.println("What is " + name + "'s date of acquisitioin?");
      String acquisitionDate = scanner.nextLine();

      System.out.println("What is " + name + "'s location of origin?");
      String acquisitionCountry = scanner.nextLine();

      System.out.println("What is " + name + "'s training status? (Choices are: \"intake\", \"Phase I,II,III,IV or V\", \"in-service\", or \"farm\".");
      String trainingStatus = scanner.nextLine();

      System.out.println("Is " + name + " reserved?(Enter \"True\" or \"False\".");
      boolean reserved = scanner.nextBoolean();

      System.out.println("What is " + name + "'s service country?");
      String inServiceCountry = scanner.nextLine();

      Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
            reserved, inServiceCountry);

      dogList.add(newDog);
      
      return; //returns to menu
   }

   // Complete intakeNewMonkey
   // Instantiate and add the new monkey to the appropriate list
   // For the project submission you must also validate the input
   // to make sure the monkey doesn't already exist and the species type is allowed
   public static void intakeNewMonkey(Scanner scanner) {
      System.out.println("What is the monkey's name?");
      String name = scanner.nextLine();
      for (Monkey monkey : monkeyList) {
         if (monkey.getName().equalsIgnoreCase(name)) {
            System.out.println("\n\nThis monkey is already in our system\n\n");
            return;
         }
      }

      // Take information about the monkey to store in the Array list
      System.out.println("What is " + name + "'s tail length in inches, to the nearest tenth?");
      String tailLength = scanner.nextLine();

         
      System.out.println("What is " + name + "'s height in inches?");
      String height = scanner.nextLine();


      System.out.println("What is " + name + "'s body length in inches?");
      String bodyLength = scanner.nextLine();

      
      final String[] acceptedSpecies = {"capuchin", "guenon", "macaque", "marmoset", "squirrel Monkey", "tamarin"}; 
      List<String> checkSpecies = Arrays.asList(acceptedSpecies);
      System.out.println("What is " + name + "'s species?");
      String species = scanner.nextLine().toLowerCase();
      boolean invalidSpecies = true;
      do {
         if(checkSpecies.contains(species)) {
            invalidSpecies = false;
         } else {
            System.out.println("You must enter a valid species, valid species are:\n");
            System.out.println(checkSpecies);
            species = scanner.nextLine().toLowerCase();
            continue;
         }
      } while(invalidSpecies);


      System.out.println("What is " + name + "'s gender?(male or female)");
      String gender = scanner.nextLine();


      System.out.println("What is " + name + "'s age?");
      String age = scanner.nextLine();


      System.out.println("What is " + name + "'s weight in pounds?");
      String weight = scanner.nextLine();


      System.out.println("What is " + name + "'s date of acquisition?");
      String acquisitionDate = scanner.nextLine();


      System.out.println("What is " + name + "'s location of origin?");
      String acquisitionCountry = scanner.nextLine();


      System.out.println("What is " + name + "'s training status? (Choices are: \"intake\", \"Phase I,II,III,IV or V\", \"in-service\", or \"farm\".");
      String trainingStatus = scanner.nextLine();


      System.out.println("Is " + name + "reserved?(Enter \"True\" for yes or \"False\" for no.");
      boolean reserved = scanner.nextBoolean();


      System.out.println("What is " + name + " service country?");
      String inServiceCountry = scanner.nextLine();

      
      Monkey newMonkey = new Monkey(name, tailLength, height, bodyLength, species, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

      monkeyList.add(newMonkey);
      return; // returns to menu

   }

   // Complete reserveAnimal
   // You will need to find the animal by animal type and in service country
   public static void reserveAnimal(Scanner scanner) {
      System.out.println("Which type of animal is being reserved? \"Dog\" or \"Monkey\"?");
      String choiceOfAnimal = scanner.nextLine().toLowerCase();
      System.out.println("In what location (Country) will the animal be serving?");
      String serviceCountry = scanner.nextLine().toLowerCase();
      
      if (choiceOfAnimal.contains("dog") || choiceOfAnimal.equalsIgnoreCase("Dog")) {
         for (Dog dog : dogList) { // As per rubric, if animal is available that matches users input criteria, method will access respectable object from Array list, If multiple meet the criteria, method accesses the first in the Array List and updates "reserved" attribute
            if((dog.getInServiceLocation().equalsIgnoreCase(serviceCountry) && (dog.getReserved() == false))) {
               dog.setReserved(true);// Iterating over the dogList array list in this manner will of course select the first that meets the criteria
               dog.setInServiceCountry(serviceCountry);
               System.out.println("The animal " + dog.getName() + " has been reserved."); 
            } else {
               System.out.println("There are no animals available that meet your selected criteria.");
            }
            
         }
      }
      
      if (choiceOfAnimal.contains("monkey") || choiceOfAnimal.equalsIgnoreCase("Monkey")) {
         for (Monkey monkey : monkeyList) {
            if((monkey.getInServiceLocation().equalsIgnoreCase(serviceCountry) && (monkey.getReserved() == false))) {
               monkey.setReserved(true);
               monkey.setInServiceCountry(serviceCountry);
               System.out.println("The monkey " + monkey.getName() + " has been reserved.");
            }
         }
      } else {
         System.out.println("There are no monkeys available which meet your selected criteria");
      }

   }

   // Complete printAnimals
   // Include the animal name, status, acquisition country and if the animal is
   // reserved.
   // Remember that this method connects to three different menu items.
   // The printAnimals() method has three different outputs
   // based on the listType parameter
   // dog - prints the list of dogs
   // monkey - prints the list of monkeys
   // available - prints a combined list of all animals that are
   // fully trained ("in service") but not reserved
   // Remember that you only have to fully implement ONE of these lists.
   // The other lists can have a print statement saying "This option needs to be
   // implemented".
   // To score "exemplary" you must correctly implement the "available" list.
   public static void printAnimals(String Choice) {
      if (Choice.equalsIgnoreCase("dog")) {
         System.out.println("List of all dogs:");
         for (Dog dog : dogList) {
            System.out.printf(dog.toString());
         }
      }
      if (Choice.equalsIgnoreCase("monkey")) {
         System.out.println("List of all monkeys:");
         for (Monkey monkey : monkeyList) {
            System.out.printf(monkey.toString());
         }
      }
      if (Choice.equalsIgnoreCase("available")) {
         //TODO Needs to be implemented
         System.out.println("This option needs to be implemented");
      }

   }
}
