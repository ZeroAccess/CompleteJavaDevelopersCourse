package AbstractionChallengeSolution;

/**
 * Created by robertsg on 5/31/2016.
 */
public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                //newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //There is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrev(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //newItem is less, insert before
                if (currentItem.prev() != null) {
                    currentItem.prev().setNext(newItem).setPrev(currentItem.prev());
                    newItem.setNext(currentItem).setPrev(newItem);
                } else {
                    //the node with a previous is the root
                    newItem.setNext(this.root).setPrev(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //equal
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //found item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.prev().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrev(currentItem.prev());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { //comparision > 0
                //We are at an item greater than the one to be deleted
                //so the item isn't in the list
                return false;
            }
        }
        //We have reached the end of the list without finding the item
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
