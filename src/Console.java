//Console class for project_7-4_DiceRoller.

import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);
    
	public static void printToConsole(String str) {
		System.out.println(str);
	}

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }   
    
	public static int getGuess(String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(prompt);
			if (i < min) {
				System.out.println("Error! Number must be greater than or equal to " + min + ".");
			} 
			else if (i > max) {
				System.out.println("Error! Number must be less than or equal to" + max + ".");
			} 
			else {
				isValid = true;
			}
		}
		return i;
	}
    
    
    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i < min) {
                System.out.println(
                        "Error! Number must be greater than or equal to " + min + ".");
            } else if (i > max) {
                System.out.println(
                        "Error! Number must be less than or equal to " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

	public static String askToRoll(Scanner sc, String prompt) {
		String choice = "";
		boolean isValid = false;

		while (!isValid) {
			choice = "";
//			System.out.println();
			System.out.print(prompt);
			choice = sc.nextLine();
			if (choice.equals("")) {
				System.out.println("Error! This entry is required. Try againd.");
			} else if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
				System.out.println("Error! Entry must be \"y\" or \"n\". Try again.");
			} else {
				isValid = true;
			}
		}
		return choice;
	}
}
