public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("I wrote my first lines of Java Code!");
        System.out.println(3 + 3);

        // Variables
        long studentId = 12345;
        String studentName = "Mark";
        int age = 22;
        double height = 1.75d;
        boolean isEnrolled = true;
        char averageMark = 'A';
        int weight = 75;

        // BMI calculation = weight / height ** 2
        // Narrow TypeCasting
        int BMI =  weight / (int) (height * height);
        System.out.println(BMI);

        //String methods
        System.out.println(studentName.length());
        System.out.println(studentName.toUpperCase());
        System.out.println(studentName.toLowerCase());
        System.out.println(studentName.indexOf("k"));

        System.out.println("Hi my name is " + studentName);

        //Math Methods
        Math.max()
    }
}
