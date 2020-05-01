package com.codecademy.project;

public class CarLoan {
    int carLoan;
    int loanLength;
    int interestRate;
    int downPayment;

    public CarLoan (int loan, int length, int rate, int payment) {
        carLoan = loan;
        loanLength = length;
        interestRate = rate;
        downPayment = payment;

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }

    public static void main(String[] args) {
        CarLoan carloan = new CarLoan(1000, 3, 5, 2000);
    }
}
