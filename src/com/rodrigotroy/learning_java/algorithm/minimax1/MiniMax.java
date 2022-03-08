package com.rodrigotroy.learning_java.algorithm.minimax1;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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
        constructTree(root);
    }

    private void constructTree(Node parentNode) {
        List<Integer> listOfPossibleHeaps = GameOfBones.getPossibleStates(parentNode.getNoOfBones());
        boolean isChildMaxPlayer = !parentNode.isMaxPlayer();

        for (Integer n : listOfPossibleHeaps) {
            Node newNode = new Node(n,
                                    isChildMaxPlayer);
            parentNode.addChild(newNode);

            if (newNode.getNoOfBones() > 0) {
                constructTree(newNode);
            }
        }
    }

    private void checkWin(Node node) {
        List<Node> children = node.getChildren();
        boolean isMaxPlayer = node.isMaxPlayer();

        for (Node child : children) {
            if (child.getNoOfBones() == 0) {
                child.setScore(isMaxPlayer ? 1 : -1);
            } else {
                checkWin(child);
            }
        }

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
        Comparator<Node> byScoreComparator = Comparator.comparing(Node::getScore);
        boolean seen = false;
        Node best = null;
        Comparator<Node> comparator = isMaxPlayer ? byScoreComparator : byScoreComparator.reversed();

        for (Node child : children) {
            if (!seen || comparator.compare(child,
                                            best) > 0) {
                seen = true;
                best = child;
            }
        }

        return (seen ? Optional.of(best) : Optional.<Node>empty()).orElseThrow(NoSuchElementException::new);
    }

}
