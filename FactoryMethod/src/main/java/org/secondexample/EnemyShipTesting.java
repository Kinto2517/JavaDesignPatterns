package org.secondexample;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        String enemyShipOption = "U";

        System.out.println("What type of ship? (U / R / B)");

        if (args.length > 0) {
            enemyShipOption = args[0];
        }

        theEnemy = shipFactory.makeEnemyShip(enemyShipOption);

        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Please enter U, R, or B next time");
        }
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
