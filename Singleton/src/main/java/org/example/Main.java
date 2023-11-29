package org.example;

import org.example.Player.Player;
import org.example.Settings.GameManager;
import org.example.Settings.GameSettingsDisplay;

public class Main {
    public static void main(String[] args) {

        GameManager gameManager = GameManager.getInstance();

        Player player = new Player("John Doe");
        System.out.println("Player Name: " + player.getPlayerName());


        GameSettingsDisplay settingsDisplay = new GameSettingsDisplay(gameManager);
        settingsDisplay.displaySettings();

        gameManager.setDifficultyLevel(2);
        gameManager.setSoundEnabled(false);

        settingsDisplay.displaySettings();

        GameManager anotherGameManager = GameManager.getInstance();
        System.out.println("Are both instances the same? " + (gameManager == anotherGameManager));

        player.setPlayerName("Jane Doe");
        System.out.println("Updated Player Name: " + player.getPlayerName());
    }
}

