public class Calculator {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, result = 0;
calculator:
        do {
            String operator = Utils.getInput("Enter an Operator: ");
            switch (operator) {

                case "no" :
                    break calculator;

                case "+": case "-": case "*": case "/": case "^":
                    num1 = Utils.getDouble("First number: ");
                    num2 = Utils.getDouble("Second number: ");
                    break;

                case    "sq" :
                    num1 = Utils.getDouble("Number: ");
                    break;
            }
            switch (operator) {
                case    "+"     : result = num1 + num2; break;
                case    "-"     : result = num1 - num2; break;
                case    "*"     : result = num1 * num2; break;
                case    "/"     : result = num1 / num2; break;
                case    "^"     : result = Math.pow(num1, num2); break;
                case    "sq"    : result = Math.sqrt(num1); break;
            }
            if (operator.equals("sq")){         //instead of if/else, you could also create an int for how many numbers each criteria uses, then add a switch for that int and add your print outs for each
                System.out.println("The square root of " +num1 +" is: " + result);
            }
            else {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            }
        } while(true);
    }
}
