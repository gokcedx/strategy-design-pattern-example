package com.gokcedx;

/**
 * strategy-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 13.07.2020
 */
public class Game {
    private String name;
    private Long size;

    public Game(String name, Long size) {
        this.name = name;
        this.size = size;
    }

    public void download(DownloadStrategy downloadStrategy){
        downloadStrategy.downloadGame(name, size);
    }
}
