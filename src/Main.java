import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IntList myList = new IntList();
        boolean flag = false;
        boolean innerFlag = false;
        int choice;

        Scanner scanner = new Scanner(System.in);

        while (flag == false) {


            System.out.println("\n1. ADD ELEMENT");
            System.out.println("2. GET ELEMENT");
            System.out.println("3. REMOVE ELEMENT AT POSITION");
            System.out.println("4. REMOVE ELEMENTS WITH VALUE");
            System.out.println("5. PRINT");
            System.out.println("6. PRINT REVERSE");
            System.out.println("7. QUIT\n \n ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("To add element enter any positive number: ");
                        System.out.println("To exit press -1.");
                        int number = scanner.nextInt();
                        if (number == -1) {
                            break;
                        }
                        myList.addElement(number);

                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("Enter number of element to get that element: ");
                        System.out.println("To exit press -1.");
                        int number = scanner.nextInt();
                        if (number == -1) {
                            break;
                        }
                        myList.getElement(number);
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("Enter position of element to remove it: ");
                        System.out.println("To exit press -1.");
                        int number = scanner.nextInt();
                        if (number == -1) {
                            break;
                        }
                        myList.removeElementAtPosition(number);
                    }
                    break;
                case 4:
                    while (true) {
                        System.out.println("Enter value of element to remove it: ");
                        System.out.println("To exit press -1.");
                        int number = scanner.nextInt();
                        if (number == -1) {
                            break;
                        }
                        myList.removeElementsWithValue(number);

                    }
                    break;
                case 5:
                    myList.print(myList);
                    break;
                case 6:
                    myList.printReverse(myList);
                    break;
                case 7:
                    flag = true;
                    break;
                default:
                    System.out.println("Wrong choice, enter your choice again: ");

                    System.out.println("\n1. ADD ELEMENT");
                    System.out.println("2. GET ELEMENT");
                    System.out.println("3. REMOVE ELEMENT AT POSITION");
                    System.out.println("4. REMOVE ELEMENTS WITH VALUE");
                    System.out.println("5. PRINT");
                    System.out.println("6. PRINT REVERSE");
                    System.out.println("7. QUIT\n \n ");

            }

        }
    }
}