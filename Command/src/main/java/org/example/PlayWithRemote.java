package org.example;

import org.example.Commands.TurnTVON;
import org.example.Commands.TurnTVOff;
import org.example.Commands.TurnVolumeDown;
import org.example.Commands.TurnVolumeUp;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTVON onCommand = new TurnTVON(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        // --------------------------------------------------------

        TurnTVOff offCommand = new TurnTVOff(newDevice);

        onPressed = new DeviceButton(offCommand);

        onPressed.press();

        // --------------------------------------------------------

        TurnVolumeUp volUpCommand = new TurnVolumeUp(newDevice);

        onPressed = new DeviceButton(volUpCommand);

        onPressed.press();

        onPressed.press();

        onPressed.press();

        // --------------------------------------------------------

        TurnVolumeDown volDownCommand = new TurnVolumeDown(newDevice);

        onPressed = new DeviceButton(volDownCommand);

        onPressed.press();

        onPressed.press();

    }
}
