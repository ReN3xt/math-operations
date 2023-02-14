package it.uniroma2.isopi;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main.class.getName());
        double result;

        if(args.length == 2 && Main.isDouble(args[0]) && args[1].equals("log")) {
            result = Main.log(Double.parseDouble(args[0]));
            logger.log(Level.INFO, "{0}", args[0] + " + " + args[1] + " = " + Double.toString(result));
        } else if (args.length == 3 && Main.isDouble(args[0]) && Main.isDouble(args[1])) {
            switch(args[2]) {
                case "add":
                    result = Main.add(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
                    logger.log(Level.INFO, "{0}", args[0] + " + " + args[1] + " = " + Double.toString(result));
                    break;
                case "sub":
                    result = Main.sub(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
                    logger.log(Level.INFO, "{0}", args[0] + " - " + args[1] + " = " + Double.toString(result));
                    break;
                case "div":
                    result = Main.div(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
                    logger.log(Level.INFO, "{0}", args[0] + " / " + args[1] + " = " + Double.toString(result));
                    break;
                case "mul":
                    result = Main.mul(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
                    logger.log(Level.INFO, "{0}", args[0] + " * " + args[1] + " = " + Double.toString(result));
                    break;
                default:
                    logger.log(Level.INFO, "Operazioni consentite: add / sub / div / mul");
            }

        } else {
            logger.log(Level.INFO, "Formati consentiti:\n{op1} {op2} {add/sub/div/mul}\n{op1} {log}\nNota: gli operatori devono essere double");
        }
    }

    public static double add(double op1, double op2){
        return op1 + op2;
    }

    public static double sub(double op1, double op2){
        return op1 - op2;
    }

    public static double div(double op1, double op2){
        return op1 / op2;
    }

    public static double mul(double op1, double op2){
        return op1 * op2;
    }

    public static double log(double op1){
        return Math.log(op1);
    }

    public static boolean isDouble(String arg){
        try {
            Double.parseDouble(arg);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
