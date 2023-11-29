package org.example.Commands;

import org.example.Command;
import org.example.ElectronicDevice;

public class TurnTVOff implements Command {

    private ElectronicDevice device;

    public TurnTVOff(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}

