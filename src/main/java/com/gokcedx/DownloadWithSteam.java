package com.gokcedx;

/**
 * strategy-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 12.07.2020
 */
public class DownloadWithSteam implements DownloadStrategy {
    private String mail;
    private String userName;
    private String password;

    public DownloadWithSteam(String mail, String userName, String password) {
        this.mail = mail;
        this.userName = userName;
        this.password = password;
        login(userName, password);
    }

    @Override
    public void downloadGame(String name, Long size) {
        // download game
            System.out.println("Downloading from Steam -> " + name + " (" + size+" GB)\nAnd it's totally legal.");
    }

    public void login(String userName, String password){
        // login Steam
        try {
            System.out.println("Hi " + userName + ", you are successfully logged in!");
        }catch (Exception e){
            System.out.println("Invalid username or password.");
        }
    }
}
