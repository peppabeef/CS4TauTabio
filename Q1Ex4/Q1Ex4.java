public class Q1Ex4 {
    public static void main(String[] args) {
        Song cicyt = new Song("Can I Call You Tonight?", "Fuzzybrain", "Dayglow");
        Song healer = new Song("Healer", "The Book of Us: Negentropy - Chaos swallowed up in love", "DAY6");
        Song nangangamba = new Song("Nangangamba", "Nangangamba", "Zack Tabudlo");

        Singer singer1 = new Singer("Yoru", cicyt);
        Singer singer2 = new Singer("Skye", healer);

        Audience audience1 = new Audience(12, 100);
        Audience audience2 = new Audience(7, 300);
        Audience audience3 = new Audience(25, 80);

        singer1.performForAudience(audience1);
        singer1.changeFavSong(healer);
        singer1.performForAudience(audience2, singer2);
        singer2.changeFavSong(nangangamba);
        singer2.performForAudience(audience3);
    }
}
