import java.util.Scanner;

public class LabControlFlowExtension {
    public static void main(String[] args) {
        // Create a program that makes suggestions on what to wear based on information it gathers about the weather.
        // The purpose of this exercise is to give you some practise with logical and conditional operators
        // Allow your program to collect some descriptive user input about the weather ("rainy", "sunny", "cloudy", "snow", etc)
        // and the average temperature for the day (8, 18, 28, etc).
        // Let your program output clothing suggestions depending on a combination of weather conditions and temperature.
        //e.g. if it is both "rainy" and less than 12 degrees, output "wear a waterproof winter coat"
        // Get user input information about weather and avg.temperature
        System.out.println("What is the weather like today and the avg temperature?");
        System.out.println("");
        // Collect user input -
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the weather here( is it windy, rainy, sunny or cloudy):");
//        String input = reader.nextLine();
        String weatherInput = reader.nextLine().toLowerCase();


        System.out.println("Enter the temperature below:");
        int temperatureInput = Integer.parseInt(reader.nextLine()); // changing temp to integer
//        String weatherInput = reader.nextLine().toLowerCase();
        String clothingItem = "null";
        if (weatherInput.equals ("windy")){
            clothingItem = "windbreaker";
        } else if (weatherInput.equals ("rainy")){
            clothingItem = "raincoat";
        } else if (weatherInput.equals("sunny")){
            clothingItem = "t-shirt";
        } else if (weatherInput.equals("cloudy")){
            clothingItem = "sweater";
        }

        String itemThickness = "null";
        if (temperatureInput <10){
            itemThickness = "thick";
        } else if (temperatureInput >= 10 && temperatureInput <= 20) {
            itemThickness = "medium";
        } else if (temperatureInput >20) {
            itemThickness = "thin";

        }

        String finalAnswer = "You should wear a " + itemThickness + " " + clothingItem + ".";
        System.out.println(finalAnswer);

    }









        // now introduce all the if variables
//        if (weatherInput.equals("windy") && temperatureInput == 7) {
//            System.out.println("a windbreaker would be the best option here.");
//        } else if (weatherInput.equals("windy") && temperatureInput == 6) {
//            System.out.println("a windbreaker would be the best option here.");
//        }
//        if (weatherInput.equals("rainy") && temperatureInput == 10) {
//            System.out.println("wear light waterproof jacket");
//            else
//        }

    }




