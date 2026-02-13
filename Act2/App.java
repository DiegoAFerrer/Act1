public class App{

    public static double method1(int number){
        if ((number % 2) != 0){
            throw new IllegalArgumentException("Number is odd, not pair");
        } else{
            double result = Math.pow(number, 2);
            return result;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.print(method1(3));
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }
    }
}