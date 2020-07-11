package ObserverObservable.Zad1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Watcher implements Observer {

    private String imie;
    private int poziomPaniki;


    @Override
    public void update(Observable o, Object wiadomosc) {
        if (wiadomosc instanceof Wiadomosc ) {
            // TU JAKOŚ TRZEBA ZROBIĆ UZALEZNIENIE WISOMOSCI OD WATROSCI
            System.out.println(getImie() + "  PANIKAAAAAA!!!");
        }
        else {
            System.out.println("ja " + getImie()+" zostałem powiadomiony");
        }
    }
}
