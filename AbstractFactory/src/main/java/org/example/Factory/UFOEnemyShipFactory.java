package org.example.Factory;

import org.example.Engine.ESEngine;
import org.example.Engine.ESUFOEngine;
import org.example.Weapon.ESUFOGun;
import org.example.Weapon.ESWeapon;

public class UFOEnemyShipFactory implements EnemyShipFactory{

    // Defines the weapon object to associate with the ship

    public ESWeapon addESGun() {
        return new ESUFOGun(); // Specific to regular UFO
    }

    // Defines the engine object to associate with the ship

    public ESEngine addESEngine() {
        return new ESUFOEngine(); // Specific to regular UFO
    }
}
