package Q1Ex1;


public class Q1Ex1 {
    public static void main(String[] args) {
        // games i play
        
        // game 1
        String valoName = "Valorant";
        int valoHoursPlayed = 1095;
        String valoType = "fps"; // first person shooter
        
        // game 2
        String lolName = "League of Legends";
        int lolHoursPlayed = 50;
        String lolType = "moba"; // multiplayer online battle arena
        
        // game 3
        String cocName = "Clash of Clans";
        int cocHoursPlayed = 800;
        String cocType = "rts"; // real time strategy
        
        System.out.printf("Are %s and %s the same type of game (operation: comparison): %b\n", valoName, lolName, valoType.equals(lolType));
        System.out.printf("Total hours played (operation: addition): %d\n", (valoHoursPlayed + lolHoursPlayed + cocHoursPlayed));
        System.out.printf("Do I play %s more than %s (operation: comparison): %b\n", valoName, cocName, (valoHoursPlayed > cocHoursPlayed));
    }
}
