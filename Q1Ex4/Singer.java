public class Singer {
    private final String name;
    private Song favoriteSong;
    private int noOfPerformances = 0;
    private double totalEarnings = 0;

    private static int totalPerformances = 0;

    public Singer(String name, Song favoriteSong) {
        this.name = name;
        this.favoriteSong = favoriteSong;
    }

    // for singing alone
    public void performForAudience(Audience audience) {
        noOfPerformances += audience.number();
        totalPerformances += audience.number();
        totalEarnings += (audience.number() * audience.payment());
        double earnings = (audience.number() * audience.payment());
        System.out.printf("%s sang %s by %s for an audience of %d people and earned %.2f\n\nTotal performances of %s: %d\nTotal performances of all singers: %s\nTotal Earnings: %.2f\n\n", name, favoriteSong.title(), favoriteSong.artist(), audience.number(), earnings, name, noOfPerformances, totalPerformances, totalEarnings);
    }

    // for singing with another singer
    public void performForAudience(Audience audience, Singer singer) {
        Singer.totalPerformances += audience.number();
        noOfPerformances += audience.number();
        totalPerformances += audience.number();
        totalEarnings += ((audience.number() * audience.payment()) / 2);
        singer.incrementNoOfPerformances(audience.number());
        singer.totalEarnings += ((audience.number() * audience.payment()) / 2);
        double earnings = ((audience.number() * audience.payment()) / 2);
        System.out.printf("%s and %s sang %s by %s for an audience of %d people and earned %.2f each\n\nTotal performances of %s: %d\nTotal performances of %s: %d\nTotal performances of all singers: %s\nTotal Earnings of %s: %.2f\nTotal Earnings of %s: %.2f\n\n", name, singer.getName(), favoriteSong.title(), favoriteSong.artist(), audience.number(), earnings, name, noOfPerformances, singer.getName(), singer.getNoOfPerformances(), totalPerformances, name, totalEarnings, singer.getName(), singer.getTotalEarnings());
    }

    public String getName() { return name; }

    public int getNoOfPerformances() { return noOfPerformances; }

    public void incrementNoOfPerformances(int increment) { noOfPerformances += increment; }

    public double getTotalEarnings() { return totalEarnings; }

    public void changeFavSong(Song favoriteSong) {
        System.out.printf("%s's favorite song changed from %s to ", name, this.favoriteSong.title());
        this.favoriteSong = favoriteSong;
        System.out.printf("%s\n\n", favoriteSong.title());
    }
}
