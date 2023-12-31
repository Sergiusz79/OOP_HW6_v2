package org.example.RefactorVersion.Service;

import org.example.RefactorVersion.Data.ComplexNumbers;
import org.example.RefactorVersion.Data.RationalNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class CreateNumbers implements ICreateNumbers{
    Logger logger = Logger.getLogger(CreateNumbers.class.getName());

    private List<ComplexNumbers> complexNumbers;
    private List<RationalNumbers> rationalNumbers;

    public CreateNumbers() {
        this.complexNumbers = new ArrayList<>();
        this.rationalNumbers = new ArrayList<>();
    }

    @Override
    public List<ComplexNumbers> getAllComplexNumbers() {
        return complexNumbers;
    }

    @Override
    public List<RationalNumbers> getallRationalNumbers() {
        return rationalNumbers;
    }

    @Override
    public void createCoupleComplexNumbers() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Введите действительную часть первого числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа");
        y = scanner.nextDouble();
        ComplexNumbers complexNumber1 = new ComplexNumbers(x, y);
        complexNumbers.add(complexNumber1);
        System.out.println("Введите действительную часть второго числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа");
        y = scanner.nextDouble();
        ComplexNumbers complexNumber2 = new ComplexNumbers(x, y);
        complexNumbers.add(complexNumber2);
        logger.info(" User inserted - Комплкесные числа ");
    }

    @Override
    public void createCoupleRationalNumbers() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        List<RationalNumbers> list = new ArrayList<>();
        System.out.println("Введите числитель первого числа");
        x = scanner.nextInt();
        System.out.println("Введите знаменатель первого числа");
        y = scanner.nextInt();
        RationalNumbers rationalNumber1 = new RationalNumbers(x, y);
        rationalNumbers.add(rationalNumber1);
        System.out.println("Введите числитель второго числа");
        x = scanner.nextInt();
        System.out.println("Введите знаменатель второго числа");
        y = scanner.nextInt();
        RationalNumbers rationalNumber2 = new RationalNumbers(x, y);
        rationalNumbers.add(rationalNumber2);
        logger.info(" User inserted - рациональные числа ");
    }
}
