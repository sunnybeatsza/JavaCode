public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I wrote my first lines of Java Code!");
        System.out.println(3 + 3);

        // Variables
        long studentId = 12345;
        String studentName = "Mark";
        int age = 22;
        double height = 1.75d;
        boolean isEnrolled = true;
        char averageMark = 0;

        int weight = 75;

        // BMI calculation = weight / height ** 2
        // Narrow TypeCasting
        int BMI = weight / (int) (height * height);
        System.out.println(BMI);

        //String methods
        System.out.println(studentName.length());
        System.out.println(studentName.toUpperCase());
        System.out.println(studentName.toLowerCase());
        System.out.println(studentName.indexOf("k"));

        System.out.println("Hi my name is " + studentName);

        //Math Methods
        int maxNum = Math.max(5, 10);
        int minNum = Math.min(5, 10);
        int sqrtNum = (int) Math.sqrt(9);
        int randomNum = (int) (Math.random() * 100);
        if (randomNum > 50 && randomNum < 70) {
            averageMark = 'D';
        } else if (randomNum > 70 && randomNum < 80) {
            averageMark = 'B';
        } else if (randomNum > 80 ) {
            averageMark = 'A';
        } else {
            averageMark = 'F';
        }


        System.out.println("Max: " + maxNum);
        System.out.println("Min: " + minNum);
        System.out.println("Sqrt: " + sqrtNum);
        System.out.println(randomNum);

        //Booleans Practice and Logical operators
        if (randomNum == 5) {
            System.out.println("The number is equal to 5!");
        } else if (randomNum == 3) {
            System.out.println("The number is equal to 3!");
        } else {
            System.out.println("Our guess was incorrect!");
        }

        //Switch case
        System.out.println("You average grade is " + averageMark);
        switch (averageMark) {
            case 'A':
                System.out.println("You have a distinction!");
                break;
            case 'B':
                System.out.println("You almost got a distinction!");
                break;
            default:
                System.out.println("Work Harder!");
                isEnrolled = false;
                System.out.println("You have been kicked out!");
        }

        //While loop


    }
}
