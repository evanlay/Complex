public class SoccerTeam {
    private int Wins ;
    private int Losses ;
    private int Ties ;
    private static int Games = 0;
    private static int Goals = 0;
    public void played(SoccerTeam other, int myScore, int theirScore) {
        Games++;
        Goals += myScore + theirScore;
        if (myScore > theirScore) {
            Wins++;
            other.Losses++;
        } else if (myScore < theirScore) {
            Losses++;
            other.Wins++;
        } else {
            Ties++;
            other.Ties++;
        }
    }
    public  int getPoints() {
        int c = 3 * Wins + 1 * Ties;
        return c;
    }
    public  void reset() {
        Wins = 0;
        Losses = 0;
        Ties = 0;
    }
    public static int getGames() {
        return Games;
    }
    public static int getGoals() {
        return Goals;
    }
    public static void startTournament() {
        Goals = 0;
        Games = 0;
    }
    public static void main(String[] args) {
        SoccerTeam team1 = new SoccerTeam();
        SoccerTeam team2 = new SoccerTeam();
        SoccerTeam team3 = new SoccerTeam();
        SoccerTeam team4 = new SoccerTeam();
        startTournament();
        team1.played(team2, 2, 5);
        team3.played(team4, 3, 4);
        team1.played(team4, 2, 4);
        team3.played(team2, 3, 5);
        team2.played(team4,  5,4);
        team3.played(team1, 3, 2);
        System.out.println("Team 1 got " + team1.getPoints() + " points ");
        System.out.println("Team 2 got " + team2.getPoints() + " points ");
        System.out.println("Team 3 got " + team3.getPoints() + " points ");
        System.out.println("Team 4 got " + team4.getPoints() + " points ");
        System.out.println(getGames() + " games played and " + getGoals() + " goals scored");
        startTournament();
        team1.played(team2, 10, 5);
        team3.played(team4, 8, 9);
        team1.played(team4, 4, 1);
        team3.played(team2, 14, 4);
        team2.played(team4,  1,3);
        team3.played(team1, 2, 2);
        System.out.println("Team 1 got " + team1.getPoints() + " points ");
        System.out.println("Team 2 got " + team2.getPoints() + " points ");
        System.out.println("Team 3 got " + team3.getPoints() + " points ");
        System.out.println("Team 4 got " + team4.getPoints() + " points ");
        System.out.println(getGames() + " games played and " + getGoals() + " goals scored");
    }
}