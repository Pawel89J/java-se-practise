package pl.globallogic.exercism.secrethandshake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> secretHandshake = new ArrayList<>();
        String binary = new StringBuffer(Integer.toBinaryString(number)).reverse().toString();

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1' && i == 0) {
                secretHandshake.add(Signal.WINK);
            }
            if (binary.charAt(i) == '1' && i == 1) {
                secretHandshake.add(Signal.DOUBLE_BLINK);
            }
            if (binary.charAt(i) == '1' && i == 2) {
                secretHandshake.add(Signal.CLOSE_YOUR_EYES);
            }
            if (binary.charAt(i) == '1' && i == 3) {
                secretHandshake.add(Signal.JUMP);
            }
            if (binary.charAt(i) == '1' && i == 4) {
                Collections.reverse(secretHandshake);
            }
        }
        return secretHandshake;
    }
}
