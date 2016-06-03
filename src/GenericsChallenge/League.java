package GenericsChallenge;

import java.util.ArrayList;

class League<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    League(String name) {
        this.name = name;
    }

    boolean addTeam(T team) {
        if (teams.contains(team.getName())) {
            System.out.println("Team is already in the League. Good Luck!");
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }
}
