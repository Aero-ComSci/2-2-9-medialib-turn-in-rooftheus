public class MediaLib {
    private static int numEntries = 0;
    private static int numBooks = 0;
    private static int numMovies = 0;
    private static int numSongs = 0;
    
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        numBooks++;
        numEntries++;
    }
    
    public void addMovie(String title, double duration) {
        Movie movie = new Movie(title, duration);
        numMovies++;
        numEntries++;
    }
    
    public void addSong(String title) {
        Song song = new Song(title);
        numSongs++;
        numEntries++;
    }
    
    public static int getNumEntries() {
        return numEntries;
    }
    
    public static int getNumBooks() {
        return numBooks;
    }
    
    public static int getNumMovies() {
        return numMovies;
    }
    
    public static int getNumSongs() {
        return numSongs;
    }

}