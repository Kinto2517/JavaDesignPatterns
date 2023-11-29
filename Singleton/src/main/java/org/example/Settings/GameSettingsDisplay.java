package org.example.Settings;

public class GameSettingsDisplay {
    private GameManager gameManager;

    public GameSettingsDisplay(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    public void displaySettings() {
        System.out.println("Current Game Settings:");
        System.out.println("Difficulty Level: " + gameManager.getDifficultyLevel());
        System.out.println("Is Sound Enabled: " + gameManager.isSoundEnabled());
    }
}