package AutoBoxingChallenge;

import java.util.ArrayList;

/**
 * Created by robertsg on 12/11/2015.
 */
public class Bank {
    ArrayList<String> branchesArrayList = new ArrayList<>();

    private void createBranch(String name) {
        Branch newBranch = new Branch(name);
    }
}
