package com.kingaspx.FirebaseProjects;

import com.formdev.flatlaf.FlatLightLaf;
import com.kingaspx.FirebaseProjects.util.FirebaseConfig;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World");
        FlatLightLaf.install();
        new FirebaseConfig().initFirebase();
        
        new Menu().setVisible(true);
    }

}
