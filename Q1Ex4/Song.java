public record Song(String title, String album, String artist) {
    public Song {
        if (title.length() == 0) {
            throw new IllegalArgumentException("Song title must contain at least 1 character");
        }
        if (album.length() == 0) {
            throw new IllegalArgumentException("Song album must contain at least 1 character");
        }
        if (artist.length() == 0) {
            throw new IllegalArgumentException("Song artist must contain at least 1 character");
        }
    }
}
