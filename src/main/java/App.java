import accounts.DebetniUcet;
import accounts.SporiciUcet;
import accounts.Ucet;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Ucet> ucty = List.of(
                new Ucet("12312313", "Pepa novak", 20000),
                new SporiciUcet("1231300000", "Karel novotny", 21000, 1.5),
                new DebetniUcet("939393993", "Martin sulir", 30000, 2000)
        );

        ucty.stream().forEach(ucet -> {
            System.out.println(ucet.toString());
            System.out.println(ucet.vlozit(50000));
            System.out.println(ucet.vybrat(40000));
            if (ucet instanceof SporiciUcet)
                System.out.println(((SporiciUcet) ucet).pripsatUrok());
            System.out.println("-------------");
        });
    }
}
