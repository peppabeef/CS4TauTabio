public class Q1Ex3 {
    public static void main(String[] args) {
        Song cicyt = new Song("Can I Call You Tonight?", "Fuzzybrain", "Dayglow");
        Song healer = new Song("Healer", "The Book of Us: Negentropy - Chaos swallowed up in love", "DAY6");
        Song nangangamba = new Song("Nangangamba", "Nangangamba", "Zack Tabudlo");

        Singer singer = new Singer("Yoru", cicyt);

        Audience audience1 = new Audience(12, 100);
        Audience audience2 = new Audience(7, 300);
        Audience audience3 = new Audience(25, 80);

        singer.performForAudience(audience1);
        singer.changeFavSong(healer);
        singer.performForAudience(audience2);
        singer.changeFavSong(nangangamba);
        singer.performForAudience(audience3);
    }
}
