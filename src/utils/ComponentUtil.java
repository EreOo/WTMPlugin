package utils;

import javax.swing.*;

public final class ComponentUtil {
    private ComponentUtil(){}

    public static void disableComponent(JComponent component){
        component.setEnabled(false);
    }

    public static void enableComponent(JComponent component){
        component.setEnabled(true);
    }

    public static void makeVisible(JComponent component){
        component.setVisible(true);
    }

    public static void makeInvisible(JComponent component){
        component.setVisible(false);
    }
}
