package org.example.RefactorVersion.Service;

import org.example.RefactorVersion.Data.ComplexNumbers;
import org.example.RefactorVersion.Data.RationalNumbers;

import java.util.List;

public interface ICreateNumbers {
    List<ComplexNumbers> getAllComplexNumbers();

    List<RationalNumbers> getallRationalNumbers();
    void createCoupleComplexNumbers();

    void createCoupleRationalNumbers();
}
