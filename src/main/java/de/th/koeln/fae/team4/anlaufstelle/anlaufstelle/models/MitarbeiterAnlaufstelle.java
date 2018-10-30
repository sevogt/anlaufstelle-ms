package de.th.koeln.fae.team4.anlaufstelle.anlaufstelle.models;

import javax.persistence.Embeddable;

@Embeddable
public class MitarbeiterAnlaufstelle {

    public MitarbeiterAnlaufstelle(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }
    private String vorname;
    private String nachname;

    @Override
    public String toString(){
        return vorname + " " + nachname;
    }
}
