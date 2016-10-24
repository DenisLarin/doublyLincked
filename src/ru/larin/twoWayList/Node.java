package ru.larin.twoWayList;

/**
 * Created by mrden on 24.10.2016.
 */
public class Node {
    private Object data;
    private Node nextElementLink;
    private Node previousElementLink;

    public Node(Object data) {
        this.data = data;
    }

    public void setNextElementLink(Node nextElementLink) {
        this.nextElementLink = nextElementLink;
    }

    public void setPreviousElementLink(Node previousElementLink) {
        this.previousElementLink = previousElementLink;
    }

    public Object getData() {
        return data;
    }

    public Node getNextElementLink() {
        return nextElementLink;
    }

    public Node getPreviousElementLink() {
        return previousElementLink;
    }
}
