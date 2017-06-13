/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttest2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Menake
 */
public class ProjectTest2 extends Application {
    /**
     * 
     * @param stage.show(); eken passe stage.setResizable(false); demmahama window eka display vela thamai resizable false venne
     * setFullScreen(true); eka mulin demme start up ekedi screen eka fullscreen enna one nisa
     * @throws Exception 
     */
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        
        stage.setFullScreen(true);
        //stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
