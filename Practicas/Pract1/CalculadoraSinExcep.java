package Practicas.Pract1;

public class CalculadoraSinExcep {

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        if(args.length != 3){
            System.out.println(
                "Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        if(!(isNumeric(args[0]))){
            System.out.println("Incorrect Input: " + args[0]); 
            System.exit(0);

        } else if(!(isNumeric(args[2]))){
            System.out.println("Incorrect Input: " + args[2]); 
            System.exit(0);
        }

        int result = 0;

        switch(args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                break;
            
            case '-':
                result = Integer.parseInt(args[0]) -
                         Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) *
                         Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) /
                         Integer.parseInt(args[2]);
                break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }   
}
