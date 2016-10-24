package ru.larin.twoWayList;

/**
 * Created by mrden on 24.10.2016.
 */
public class TwoWayList {
    private Node first;
    private Node last;

    public TwoWayList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public void addBegin(Object object) {
        Node node = new Node(object);
        if (isEmpty()) {
            last = node;
        }
        else {
            first.setPreviousElementLink(node);
        }
        node.setNextElementLink(first);
        first = node;
    }

    public void printLeftToRight() {
        Node node = first;
        while (node != null) {
            System.out.println(node.getData().toString());
            node = node.getNextElementLink();
        }
    }

    public void printRightToLeft() {
        Node node = last;
        while (node != null) {
            System.out.println(node.getData().toString());
            node = node.getPreviousElementLink();
        }
    }

    public void addEnd(Object object) {
        Node node = new Node(object);
        if(isEmpty()){
            first = node;
        }
        else{
            last.setNextElementLink(node);
        }
        node.setPreviousElementLink(last);
        last = node;
    }
    public Node removeFirst(){
        Node removeNode = first;
        if(removeNode.getNextElementLink() == null){
            first = null;
        }
        else {
            removeNode.getNextElementLink().setPreviousElementLink(null);
        }
        first = removeNode.getNextElementLink();
        return removeNode;
    }
    public Node removeLast(){
        Node removeNode = last;
        if(removeNode.getPreviousElementLink() == null){
            last = null;
        }
        else {
            removeNode.getPreviousElementLink().setNextElementLink(null);
        }
        last = removeNode.getPreviousElementLink();
        return removeNode;
    }
    public int size() {
        int returnCount = 0;
        if (!isEmpty()) {
            Node node;
            if (first != null) {
                node = first;
            } else
                node = last;
            while (node != null) {
                returnCount++;
                node = node.getNextElementLink();
            }
        }
        return returnCount;
    }
}
