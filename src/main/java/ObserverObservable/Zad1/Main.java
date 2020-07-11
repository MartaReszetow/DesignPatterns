package ObserverObservable.Zad1;

public class Main {
    public static void main(String[] args) {

        Watcher watcher1 = new Watcher("Jan",5);
        Watcher watcher2 = new Watcher("Alan",8);
        Watcher watcher3 = new Watcher("Staś",10);
        Watcher watcher4 = new Watcher("Grzes",3);

        NewsStation TVN = new NewsStation();
        TVN.addObserver(watcher1);
        TVN.addObserver(watcher2);
        TVN.addObserver(watcher3);
        TVN.addObserver(watcher4);

        TVN.setWiadomosc("Wybuchla bomba",10);
    }
}
