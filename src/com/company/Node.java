package com.company;

public class Node {
    private int A;
    private int B;
    private int C;

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    @Override
    public String toString() {
        return "Node{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}
