package org.example;

import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;

public class Main {
    public static void main(String[] args) {

        String botToken = "7606656953:AAGb3at7y3c2QEpt9davZbjQ-EoTixQLHXw";
        try (TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication()) {
            botsApplication.registerBot(botToken, new TgBotTasks(botToken));
            System.out.println("Bot is successfully started!");
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Bot successfully started");
    }
}