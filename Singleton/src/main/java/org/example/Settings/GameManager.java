package org.example.Settings;

import java.io.Serial;
import java.io.Serializable;

public class GameManager implements Serializable {
    private static GameManager instance;

    /*
        Thread Safety -- Double Checked Locking
        The volatile keyword ensures that changes to the instance variable are visible to all threads.

        private static volatile GameManager instance;
     */

    private int difficultyLevel;
    private boolean soundEnabled;

    private GameManager() {
        difficultyLevel = 1;
        soundEnabled = true;
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    /*
    With this method, we can ensure that the same instance is returned after deserialization.
     */
    /*
    @Serial is a new annotation in Java 16. It is used to declare a serializable class.
     */
    @Serial
    protected Object readResolve() {
        return getInstance();
    }
    /*
     Thread Safety -- Synchronized Method

     public static synchronized GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }
     */


    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}

