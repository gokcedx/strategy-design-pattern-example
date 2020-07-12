package com.gokcedx;

/**
 * strategy-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 12.07.2020
 */
public interface DownloadStrategy {
    public void downloadGame(String name, Long size);
}
