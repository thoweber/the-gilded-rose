package com.example.liftupconditional;

import java.util.Set;
import java.util.TreeSet;

import static com.example.liftupconditional.Gate.*;
import static com.example.liftupconditional.Keycard.*;

class GateController {

    public static Set<Gate> unlockWith(Keycard keycard) {
        var gatesOpened = new TreeSet<Gate>();

        if (GREEN_KEYCARD == keycard || BLUE_KEYCARD == keycard) {
            gatesOpened.add(LAVA_GATE);
        }
        if (RED_KEYCARD == keycard) {
            gatesOpened.add(WOODEN_GATE);
        }
        if (YELLOW_KEYCARD != keycard) {
            gatesOpened.add(IVORY_GATE);
        }
        if (RED_KEYCARD == keycard || YELLOW_KEYCARD == keycard) {
            gatesOpened.add(DARK_GATE);
        }
        if (RED_KEYCARD != keycard) {
            gatesOpened.add(STEEL_GATE);
        }
        if (BLUE_KEYCARD == keycard) {
            gatesOpened.add(COPPER_GATE);
        }

        return gatesOpened;
    }
}
