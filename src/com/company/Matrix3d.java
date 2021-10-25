package com.company;

public class Matrix3d {
    private Node[][][] matrix3d;

    public Matrix3d(int row, int col, int height) {
        matrix3d = new Node[height][row][col];
    }

    public Node[][][] getMatrix3d() {
        return matrix3d;
    }
}
