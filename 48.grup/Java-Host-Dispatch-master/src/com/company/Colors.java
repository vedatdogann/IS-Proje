
package com.company;

import java.util.ArrayList;

public class Colors {
    public ArrayList<String> getAllColors() {
        ArrayList<String> colors = new ArrayList<>();
        for (int red = 0; red <= 255; red += 51) {
            for (int green = 0; green <= 255; green += 51) {
                for (int blue = 0; blue <= 255; blue += 51) {
                    colors.add("RGB(" + red + ", " + green + ", " + blue + ")");
                }
            }
        }
        return colors;
    }
}
