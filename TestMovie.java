// Movie.java
public class Movie {
    private String title;
    private String director;
    private int duration; // in minutes

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        setDuration(duration);
    }

    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public int getDuration() { return duration; }

    // Setter with rule: duration must be between 30 and 300 mins
    public void setDuration(int duration) {
        if (duration >= 30 && duration <= 300) {
            this.duration = duration;
        } else {
            System.out.println("Invalid duration! Must be between 30 and 300 minutes.");
        }
    }

    public void display() {
        System.out.println("Movie: " + title + " | Director: " + director + " | Duration: " + duration + " mins");
    }
}

// TestMovie.java
public class TestMovie {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan", 148);
        movie.display();

        // Valid update
        movie.setDuration(180);
        movie.display();

        // Invalid duration prevented
        movie.setDuration(500);
    }
}
