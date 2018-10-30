package de.th.koeln.fae.team4.anlaufstelle.anlaufstelle.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "anlaufstelle")
public class Anlaufstelle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private AnlaufstellePosition position;

    @Embedded
    private List<MitarbeiterAnlaufstelle> mitarbeiter;

    private String name;


    public Long getId() {
        return id;
    }

    public AnlaufstellePosition getPosition() {
        return position;
    }

    public void setPosition(AnlaufstellePosition position) {
        this.position = position;
    }

    public List<MitarbeiterAnlaufstelle> getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(List<MitarbeiterAnlaufstelle> mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Anlaufstelle: " + name + ", Position: " + position.getLatitude() + ", " + position.getLongitude();
    }

}
