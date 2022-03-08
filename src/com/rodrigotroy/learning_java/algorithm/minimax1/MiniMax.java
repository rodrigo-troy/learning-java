package com.rodrigotroy.learning_java.algorithm.minimax1;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 07-03-22
 * Time: 22:09
 */
public class MiniMax {
    private Tree tree;

    public void constructTree(int noOfBones) {
        tree = new Tree();
        Node root = new Node(noOfBones,
                             true);
        tree.setRoot(root);

        System.out.println("INIT constructTree");
        constructTree(root);
        System.out.println("END constructTree");
    }

    private void constructTree(Node parentNode) {
        List<Integer> listOfPossibleHeaps = GameOfBones.getPossibleStates(parentNode.getNoOfBones());
        boolean isChildMaxPlayer = !parentNode.isMaxPlayer();

        listOfPossibleHeaps.forEach(n -> {
            Node newNode = new Node(n,
                                    isChildMaxPlayer);
            parentNode.addChild(newNode);

            if (newNode.getNoOfBones() > 0) {
                constructTree(newNode);
            }
        });
    }

    private void checkWin(Node node) {
        List<Node> children = node.getChildren();
        boolean isMaxPlayer = node.isMaxPlayer();

        children.forEach(child -> {
            if (child.getNoOfBones() == 0) {
                child.setScore(isMaxPlayer ? 1 : -1);
            } else {
                checkWin(child);
            }
        });

        Node bestChild = findBestChild(isMaxPlayer,
                                       children);
        node.setScore(bestChild.getScore());
    }

    public boolean checkWin() {
        Node root = tree.getRoot();
        checkWin(root);
        return root.getScore() == 1;
    }

    private Node findBestChild(boolean isMaxPlayer,
                               List<Node> children) {
        System.out.println("INIT findBestChild");
        System.out.println("\tisMaxPlayer: " + isMaxPlayer);
        System.out.println("\tchildren: " + children);
        Comparator<Node> byScoreComparator = Comparator.comparing(Node::getScore);

        Node node = children.stream()
                            .max(isMaxPlayer ? byScoreComparator : byScoreComparator.reversed())
                            .orElseThrow(NoSuchElementException::new);

        System.out.println("\tBest child: " + node);
        System.out.println("END findBestChild\n");

        return node;
    }

}
