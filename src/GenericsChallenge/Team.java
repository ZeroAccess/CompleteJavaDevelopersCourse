package GenericsChallenge;

import java.util.ArrayList;

class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on the roster.");
            return false;
        } else {
            members.add(player);
            return true;
        }
    }

    void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        String score;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
            score = ourScore + " to " + theirScore;
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
            score = theirScore + " to " + ourScore;
        } else {
            tied++;
            message = " drew with ";
            score = ourScore + " to " + theirScore;
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName() + " " + score + ".");
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return 1;
        } else if (this.ranking() < team.ranking()) {
            return -1;
        } else {
            return 0;
        }
    }
}
