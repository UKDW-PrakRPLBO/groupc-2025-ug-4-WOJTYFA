package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, int promisedBandwidth, String merk){
        super(merk, harga, promisedBandwidth);
    }
    public double getRealBandwidth(){
        int harganormal = 50000;
        double ratio = (double) getHarga() / (double) harganormal;
        if (ratio < 1){
            return ratio * getPromisedBandwidth();
        } else {
            return getPromisedBandwidth();
        }
    }
}
