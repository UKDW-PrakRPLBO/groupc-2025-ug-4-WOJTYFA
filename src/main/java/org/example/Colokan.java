package org.example;

public abstract class Colokan {
    private String merk;
    private int harga;
    private double promisedBandwidth;

    public Colokan(String merk, int harga, double promisedBandwidth) {
        this.merk = merk;
        this.harga = harga;
        this.promisedBandwidth = promisedBandwidth;
    }



    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }

    public abstract double getRealBandwidth();
}
