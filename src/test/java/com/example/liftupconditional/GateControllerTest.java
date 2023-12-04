package com.example.liftupconditional;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

class GateControllerTest {

    @Test
    void unlock() {
        CombinationApprovals.verifyAllCombinations(
                GateController::unlockWith,
                Keycard.values()
        );
    }

}
