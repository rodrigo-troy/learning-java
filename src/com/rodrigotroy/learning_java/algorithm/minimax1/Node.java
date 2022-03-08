package com.rodrigotroy.learning_java.algorithm.minimax1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 07-03-22
 * Time: 22:08
 */
public class Node {
    private int noOfBones;
    private boolean isMaxPlayer;
    private int score;
    private List<Node> children;

    public Node(int noOfBones,
                boolean isMaxPlayer) {
        this.noOfBones = noOfBones;
        this.isMaxPlayer = isMaxPlayer;
    }

    public int getNoOfBones() {
        return noOfBones;
    }

    public void setNoOfBones(int noOfBones) {
        this.noOfBones = noOfBones;
    }

    public boolean isMaxPlayer() {
        return isMaxPlayer;
    }

    public void setMaxPlayer(boolean maxPlayer) {
        isMaxPlayer = maxPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Node> getChildren() {
        if (children == null) {
            children = new ArrayList<>();
        }

        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public void addChild(Node newNode) {
        this.getChildren().add(newNode);
    }

    @Override
    public String toString() {
        return "Node{" +
               "noOfBones=" + noOfBones +
               ", isMaxPlayer=" + isMaxPlayer +
               ", score=" + score +
               ", #children=" + this.getChildren().size() +
               '}';
    }
}
