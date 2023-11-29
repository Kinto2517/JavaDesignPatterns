package org.example.Commands;

import org.example.Command;
import org.example.ElectronicDevice;

public class TurnVolumeUp implements Command {

    private ElectronicDevice device;

    public TurnVolumeUp(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
}
