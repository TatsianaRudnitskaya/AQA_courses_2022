public class Main {
    public static void main(String[] args) {
        printHello("Tania");
        printHello("Lera");
        printHello("Sveta");



//    public static void main(String[] args) {
//        String[] tvChannels = {"", "Мир животных", "Музыка", "ТВ-Кино", "Детсткий"};
//        System.out.print("Выберите номер канала: ");
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//        while (true) {
//            if (x >= 1 && x <= 4) {
//                System.out.println(tvChannels[x]);
//                System.out.print("Выберите номер канала: ");
//                x = scanner.nextInt();
//            } else {
//                System.out.println("Такого канала не существует!");
//                System.out.print("Выберите номер канала: ");
//                x = scanner.nextInt();
//            }
//            if (x == 0) {
//                break;
//            }
//        }
//        System.out.println("Вы вышли из программы!");



//        Scanner scanner = new Scanner(System.in);
//        int score;
//
//        System.out.print("Please enter your score: ");
//        score = scanner.nextInt();
//        while (score > 100) {
//            System.out.println("Invalid value. You must enter a value from 0 to 100");
//            System.out.print("Please enter your score: ");
//            score = scanner.nextInt();
//        }
//        if (score >= 70 && score <= 100) {
//            System.out.println("Congrats! You've passed the test!");
//        } else {
//            System.out.println("Sorry, you've failed the test.");
//        }
//        System.out.println("Thanks for your reply!");


//        Scanner consoleScanner = new Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int x = consoleScanner.nextInt();
//        int negsum = 0;
//
//        for (int i = 0; i >= x; i = i+1) {
//            negsum = negsum+i;
//        }
//        System.out.printf("The sum of all numbers from %d to 0 is %d", x, negsum);


//        Scanner consoleScanner = new Scanner(System.in);
//        String userInput = "";
//
//        while (true) {
//            System.out.println("Please type some text");
//            System.out.print("userInput: ");
//            userInput = consoleScanner.nextLine();
//            userInput = userInput.trim();
//            if (userInput.contains("Exit")) {
//                break;
//            }
//        }
//        System.out.println("The end!");


//        Scanner consoleScanner = new Scanner(System.in);
//        String userInput = "";
//
//        while (!userInput.contains("Exit")) {
//            System.out.println("Please fill all fields");
//            System.out.print("userInput: ");
//            userInput = consoleScanner.nextLine();
//            userInput = userInput.trim();
//        }
//        System.out.println("The end!");

//        Scanner consoleScanner = new Scanner(System.in);
//        String userInput = "";
//        String exit = "";
//
//
//        while (exit.isEmpty()) {
//            System.out.println("Please fill all fields");
//            System.out.print("userInput: ");
//            userInput = consoleScanner.nextLine();
//            userInput = userInput.trim();
//            System.out.print("exit: ");
//            exit = consoleScanner.nextLine();
//            exit = exit.replace(" ", "");
//        }


//        String userInput = consoleScanner.nextLine();

//
//        System.out.println(userInput.length());
//        System.out.println(userInput.isEmpty());
//        System.out.println(userInput.charAt(8));
//
//        System.out.println("Your string contains: " + userInput.length() + " characters");
    }
    public static void printHello(String name) {
        System.out.println("Hello, " + name);
    }
}