package de.th.koeln.fae.team4.anlaufstelle.anlaufstelle.models;

import javax.persistence.Embeddable;

@Embeddable
public class AnlaufstellePosition {
    private double latitude;
    private double longitude;

    public AnlaufstellePosition(){
    }

    public AnlaufstellePosition(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
}
