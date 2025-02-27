package org.example;

public class TV {
    private Colokan colokan;
    private  int maxResolusi;


    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

    public int getResolution() {
       int maxresolusi = 0;

        double realBandwidth = colokan.getRealBandwidth();
        if (realBandwidth >= 10 && realBandwidth <= 35) {
            maxresolusi = 480;
        } else if (realBandwidth > 35 && realBandwidth <= 100) {
            maxresolusi = 720;
        } else {
            maxresolusi = 1080;
        }
        return Math.min(maxresolusi, this.maxResolusi);
    }

}
