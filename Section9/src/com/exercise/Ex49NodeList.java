package com.exercise;

public interface Ex49NodeList {

    Ex49ListItem getRoot();
    boolean addItem(Ex49ListItem item);
    boolean removeItem(Ex49ListItem item);
    void traverse(Ex49ListItem root);
}
