package org.example.Serialization;

import org.example.Settings.GameManager;

import java.io.*;

public class GameManagerSerialization {
    public static void main(String[] args) {

        GameManager gameManager = GameManager.getInstance();
        gameManager.setDifficultyLevel(3);
        gameManager.setSoundEnabled(true);

        serializeGameManager(gameManager, "serializedGameManager.dat");


        GameManager deserializedGameManager = deserializeGameManager("serializedGameManager.dat");

        if (deserializedGameManager != null) {
            System.out.println("Deserialized Difficulty Level: " + deserializedGameManager.getDifficultyLevel());
            System.out.println("Deserialized Sound Enabled: " + deserializedGameManager.isSoundEnabled());
            System.out.println("Are instances equal? " + (gameManager == deserializedGameManager));
        }
    }

    private static void serializeGameManager(GameManager gameManager, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(gameManager);
            System.out.println("GameManager serialized and saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static GameManager deserializeGameManager(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Object object = ois.readObject();
            if (object instanceof GameManager) {
                System.out.println("GameManager deserialized from " + fileName);
                return (GameManager) object;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
