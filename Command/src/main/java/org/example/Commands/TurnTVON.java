package org.example.Commands;

import org.example.Command;
import org.example.ElectronicDevice;

public class TurnTVON implements Command {

    private ElectronicDevice device;

    public TurnTVON(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}
