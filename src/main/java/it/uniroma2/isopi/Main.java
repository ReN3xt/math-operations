package it.uniroma2.isopi;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main.class.getName());

        if(args.length == 2){

        } else if (args.length == 3) {
            
        } else {

        }
    }

    public float add(float op1, float op2){
        return op1 + op2;
    }

    public float sub(float op1, float op2){
        return op1 - op2;
    }

    public float div(float op1, float op2){
        return op1 / op2;
    }

    public float mul(float op1, float op2){
        return op1 * op2;
    }

    public float log(float op1){
        return Math.log(op1)
    }
}
