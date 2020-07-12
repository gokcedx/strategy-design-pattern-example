package com.gokcedx;

/**
 * strategy-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 12.07.2020
 */
public class DownloadWithTorrent implements DownloadStrategy {
    private String appName;
    private String appVersion;
    private Long port;

    public DownloadWithTorrent(String appName, String appVersion, Long port) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.port = port;
        checkStatus(appName, port);
    }

    @Override
    public void downloadGame(String name, Long size) {
        // download game
        System.out.println("Downloading from Torrent -> " + name + " (" + size+" GB)\nAnd it's totally illegal!");
    }

    public void checkStatus(String appName, Long port){
        // checking torrent
        try {
            System.out.println(appName + "&" + port + " - Connected to peers. ");
        }catch (Exception e){
            System.out.println("Torrent failed.");
        }
    }
}
