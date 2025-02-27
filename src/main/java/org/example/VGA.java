package org.example;

public class VGA extends Colokan{
    public VGA(int harga, int promisedBandwidth, String merk) {
        super(merk, harga, promisedBandwidth);
    }
    public double getRealBandwidth() {
        int harganormal = 30000;
        int harga = super.getHarga();

        double rasio = harga / (double) harganormal > 1 ? 1 : harga / (double) harganormal;
        return super.getPromisedBandwidth() * rasio;

    }

}
