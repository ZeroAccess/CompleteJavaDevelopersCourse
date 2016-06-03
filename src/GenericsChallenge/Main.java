package GenericsChallenge;

public class Main {
    public static void main(String[] args) {
        SmitePlayer captain_inzane = new SmitePlayer("Captain Inzane");
        SmitePlayer golden_n1ght = new SmitePlayer("Golden N1ght");
        SmitePlayer samdadude = new SmitePlayer("Sam Da Dude");
        SmitePlayer frostFangs = new SmitePlayer("Frost Fangs");

        Team<SmitePlayer> winners = new Team<>("Winners");
        winners.addPlayer(captain_inzane);
        winners.addPlayer(golden_n1ght);

        Team<SmitePlayer> losers = new Team<>("Losers");
        losers.addPlayer(samdadude);
        losers.addPlayer(frostFangs);

        Team<GuildWars2> guildWars2Team = new Team<>("Guild Wars 2");

        League<Team> worldCup = new League<>("World Cup");
        worldCup.addTeam(winners);
        worldCup.addTeam(guildWars2Team);

        winners.matchResult(losers, 1, 0);
    }
}
