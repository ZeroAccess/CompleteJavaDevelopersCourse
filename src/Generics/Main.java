package Generics;

public class Main {
    public static void main(String[] args) {

        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer john = new BaseballPlayer("John");
        BaseballPlayer calix = new BaseballPlayer("Calix");
//        FootballPlayer joe = new FootballPlayer("Joe");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");

//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//        adelaideCrows.addPlayer(joe);

        Team<BaseballPlayer> atlantaBraves = new Team<>("Atlanta Braves");
        atlantaBraves.addPlayer(pat);
        atlantaBraves.addPlayer(calix);

        Team<BaseballPlayer> floridaMarlins = new Team<>("Florida Marlins");
        floridaMarlins.addPlayer(pat);
        floridaMarlins.addPlayer(john);

//        Team<SoccerPlayer> englandPenguins = new Team<>("New England Penguins");
//        englandPenguins.addPlayer(beckham);

        atlantaBraves.matchResult(floridaMarlins, 10, 2);

//        System.out.println("Crows have " + adelaideCrows.numPlayers() + " players." + " Rank: " + adelaideCrows.ranking());
//        System.out.println("Penguins have " + englandPenguins.numPlayers() + " players." + " Rank: " + englandPenguins.ranking());

        System.out.println(atlantaBraves.getName() + " have " + atlantaBraves.numPlayers() + " players." + " Rank: " + atlantaBraves.ranking());
        System.out.println(floridaMarlins.getName() + " have " + floridaMarlins.numPlayers() + " players. " + " Rank: " + floridaMarlins.ranking());
        System.out.println(atlantaBraves.compareTo(floridaMarlins));
        System.out.println(floridaMarlins.compareTo(atlantaBraves));

    }
}
