package com.gokcedx;

/**
 * strategy-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 12.07.2020
 */
public class DownloadWithWebsite implements DownloadStrategy {
    private String address;

    public DownloadWithWebsite(String address) {
        this.address = address;
        connect(address);
    }

    @Override
    public void downloadGame(String name, Long size) {
        // download game
        System.out.println("Downloading from Website -> " + name + " (" + size+" GB)\nAnd it's mostly illegal!");
    }

    public void connect(String address){
        // connect website
        try {
            System.out.println("Connected: " + address);
        }catch (Exception e){
            System.out.println("Connection lost.");
        }
    }
}
