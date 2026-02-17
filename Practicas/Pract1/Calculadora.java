package Practicas.Pract1;

public class Calculadora {

    public static void main(String[] args){
        if(args.length != 3){
            System.out.println(
                "Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        try {
            Integer.parseInt(args[0]);

        } catch (NumberFormatException e1) {
            System.out.println("Incorrect Input: " + args[0]); 
            System.exit(0);
        } 
        
        try {
        Integer.parseInt(args[2]);

        } catch (NumberFormatException e2) {
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
