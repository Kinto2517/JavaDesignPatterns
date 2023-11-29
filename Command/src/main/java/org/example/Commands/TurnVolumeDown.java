package org.example.Commands;

import org.example.Command;
import org.example.ElectronicDevice;

public class TurnVolumeDown implements Command {

    private ElectronicDevice device;

    public TurnVolumeDown(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }
}
