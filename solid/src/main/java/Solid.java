interface Bron {
    void atakuj();
}

class Miecz implements Bron {

    public void atakuj() {
        System.out.println("Miecz zadaje obrażenia!");
    }
}

class Gracz {
    private Bron bron;

    public Gracz(Bron bron) {
        this.bron = bron;
    }

    public void atakuj() {
        bron.atakuj();
    }
}

class Przeciwnik {
    private Bron bron;

    public Przeciwnik(Bron bron) {
        this.bron = bron;
    }

    public void atakuj() {
        bron.atakuj();
    }
}

class Rozgrywka {
    public static void main(String[] args) {
        Bron miecz = new Miecz();

        Gracz gracz = new Gracz(miecz);
        Przeciwnik przeciwnik = new Przeciwnik(miecz);

        gracz.atakuj();
        przeciwnik.atakuj();
    }
}
