package com.dawan.atelier_implementation.solutions;

import com.dawan.atelier_implementation.interfaces.CalcSimple;

public class CalcSimpleSolution implements CalcSimple {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b;
    }
}