package com.company;

public class MatrixService {
    private NodeService nodeService = new NodeService();

    public void fillMatrix(Matrix3d matrix3d, int X) {
        for (int i = 0; i < matrix3d.getMatrix3d().length; i++) {
            for (int j = 0; j < matrix3d.getMatrix3d()[i].length; j++) {
                for (int k = 0; k < matrix3d.getMatrix3d()[i][j].length; k++) {
                    Node node = new Node();
                    matrix3d.getMatrix3d()[i][j][k] = nodeService.buildNode(node, X);
                }
            }
        }
    }

    public void showMatrix(Matrix3d matrix3d) {
        for (int i = 0; i < matrix3d.getMatrix3d().length; i++) {
            for (int j = 0; j < matrix3d.getMatrix3d()[i].length; j++) {
                System.out.print("arr" + i + "[");
                for (int k = 0; k < matrix3d.getMatrix3d()[i][j].length; k++) {
                    System.out.println(matrix3d.getMatrix3d()[i][j][k]);
                }
                System.out.println("]");
            }
        }
    }
}
