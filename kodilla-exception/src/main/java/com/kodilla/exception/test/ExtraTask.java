package com.kodilla.exception.test;

public class ExtraTask {
    public double power(int base, int exp) throws ArithmeticException {
        if (exp < 0) {
            throw new ArithmeticException();
        } else if (exp == 0) {
            return 1;
        } else if(base == 0 ){
            return 0;
        } else if(exp == 1){
            return base;
        } else {
            double temp = power(base, exp/2);
            if(exp % 2 == 0){
                return temp * temp;
            } else {
                return temp * temp * base;
            }
        }
    }

    public static void main(String[] args) {
        ExtraTask extraTask = new ExtraTask();

        try {
            System.out.println(extraTask.power(10, -1));
        } catch (ArithmeticException e) {
            System.out.println("Error" + e);
        } finally {
            System.out.println("Finally");
        }
    }
}


