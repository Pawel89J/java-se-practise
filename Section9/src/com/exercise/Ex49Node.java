package com.exercise;

public class Ex49Node extends Ex49ListItem {

    public Ex49Node(Object value) {
        super(value);
    }

    @Override
    Ex49ListItem next() {
        return this.rightLink;
    }

    @Override
    Ex49ListItem setNext(Ex49ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    Ex49ListItem previous() {
        return this.leftLink;
    }

    @Override
    Ex49ListItem setPrevious(Ex49ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(Ex49ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
