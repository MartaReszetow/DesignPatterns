package ObserverObservable.Zad1;

import java.util.Observable;

public class NewsStation extends Observable {

    private Wiadomosc wiadomosc;

    public void setWiadomosc(Wiadomosc wiadomosc) {
        this.wiadomosc = wiadomosc;

        setChanged();
        notifyObservers(wiadomosc);
    }
}
