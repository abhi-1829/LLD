package DesignPatterns.FacadePattern;

public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private Amplifier amp;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, Amplifier amp) {
        this.dvd = dvd;
        this.projector = projector;
        this.amp = amp;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        projector.setInput("DVD");
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        dvd.off();
        amp.off();
        projector.off();
    }
}
