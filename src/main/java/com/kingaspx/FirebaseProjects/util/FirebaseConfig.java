package com.kingaspx.FirebaseProjects.util;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FirebaseConfig {

    public void initFirebase() {
        FileInputStream serviceAccount = null;
        try {
            serviceAccount = new FileInputStream("credentials.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://meuprojeto-63644.firebaseio.com")
                    .build();
            
            FirebaseApp.initializeApp(options);
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FirebaseConfig.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FirebaseConfig.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                serviceAccount.close();
            } catch (IOException ex) {
                Logger.getLogger(FirebaseConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
