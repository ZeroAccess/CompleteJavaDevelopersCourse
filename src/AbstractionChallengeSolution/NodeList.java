package AbstractionChallengeSolution;

/**
 * Created by robertsg on 5/31/2016.
 */
public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);
}
