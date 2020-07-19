package com.gokcedx;

/**
 * strategy-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 12.07.2020
 */
public class App 
{
    public static void main( String[] args )
    {
        // select a game
        Game game = new Game("GTA V", 70L);

        // which strategy do you need?
        // strategy 1 download
        game.download(new DownloadWithSteam("gokce@example.com", "gokcedx", "123"));
        System.out.println("\n<-------------------->\n");

        // strategy 2 download
        game.download(new DownloadWithWebsite("downladgame.com/download"));
        System.out.println("\n<-------------------->\n");

        // strategy 3 download
        game.download(new DownloadWithTorrent("BitTorrent", "7.9", 6336L));
    }
}
