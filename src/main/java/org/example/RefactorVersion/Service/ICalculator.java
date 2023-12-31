package org.example.RefactorVersion.Service;

import org.example.RefactorVersion.Data.ComplexNumbers;
import org.example.RefactorVersion.Data.RationalNumbers;

import java.util.List;

interface ICalculator {

//    public List<ComplexNumbers> getAllComplexNumbers();
//
//    public List<RationalNumbers> getallRationalNumbers();
//
//    public void createCoupleComplexNumbers();
//
//    public void createCoupleRationalNumbers();

    ComplexNumbers addition(ComplexNumbers x, ComplexNumbers y);

    ComplexNumbers subtraction(ComplexNumbers x, ComplexNumbers y);

    ComplexNumbers multiplication(ComplexNumbers x, ComplexNumbers y);

    ComplexNumbers division(ComplexNumbers x, ComplexNumbers y);

    RationalNumbers addition(RationalNumbers x, RationalNumbers y);

    RationalNumbers subtraction(RationalNumbers x, RationalNumbers y);

    RationalNumbers multiplication(RationalNumbers x, RationalNumbers y);

    RationalNumbers division(RationalNumbers x, RationalNumbers y);
}
