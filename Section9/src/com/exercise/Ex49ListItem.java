package com.exercise;

public abstract class Ex49ListItem {

    protected Ex49ListItem rightLink = null;
    protected Ex49ListItem leftLink = null;

    protected Object value;

    public Ex49ListItem(Object value) {
        this.value = value;
    }

    abstract Ex49ListItem next();
    abstract Ex49ListItem setNext(Ex49ListItem item);
    abstract Ex49ListItem previous();
    abstract Ex49ListItem setPrevious(Ex49ListItem item);

    abstract int compareTo(Ex49ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
