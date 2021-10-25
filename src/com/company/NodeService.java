package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class NodeService {
    public Node buildNode(Node node, int X) {
        generateA(X, node);
        generateB(X, node);
        generateC(X, node);

        return node;
    }

    private void generateA(int X, Node node) {
        node.setA((int) Math.pow(ThreadLocalRandom.current().nextInt(1, X), 3));
    }

    private void generateB(int X, Node node) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, X);
        node.setB(((int) Math.pow(randomNumber, 2)) - randomNumber);
    }

    private void generateC(int X, Node node) {
        node.setC(ThreadLocalRandom.current().nextInt(1, X) * 10);
    }
}
