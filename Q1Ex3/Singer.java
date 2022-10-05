public class Singer {
    public String name;
    public Song favoriteSong;
    private int noOfPerformances = 0;
    private double totalEarnings = 0;

    public Singer(String name, Song favoriteSong) {
        this.name = name;
        this.favoriteSong = favoriteSong;
    }

    public void performForAudience(Audience audience) {
        noOfPerformances++;
        totalEarnings += (audience.number() * audience.payment());
        double earnings = (audience.number() * audience.payment());
        System.out.printf("%s sang %s by %s for an audience of %d people and earned %.2f\n\nTotal number of Performances: %d\nTotal Earnings: %.2f\n\n", name, favoriteSong.title(), favoriteSong.artist(), audience.number(), earnings, noOfPerformances, totalEarnings);
    }

    public void changeFavSong(Song favoriteSong) {
        System.out.printf("%s's favorite song changed from %s to ", name, this.favoriteSong.title());
        this.favoriteSong = favoriteSong;
        System.out.printf("%s\n\n", favoriteSong.title());
    }
}
