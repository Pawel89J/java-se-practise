package com.exercise;

public class Ex49SearchTree implements Ex49NodeList {

    private Ex49ListItem root = null;

    public Ex49SearchTree(Ex49ListItem root) {
        this.root = root;
    }

    @Override
    public Ex49ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(Ex49ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }
        Ex49ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(Ex49ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        Ex49ListItem currentItem = this.root;
        Ex49ListItem parentItem = currentItem;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private  void performRemoval(Ex49ListItem item, Ex49ListItem parent) {
        if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        }else if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            }else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            Ex49ListItem current = item.next();
            Ex49ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftmostParent == item) {
                item.setNext(current.next());
            } else {
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(Ex49ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}


