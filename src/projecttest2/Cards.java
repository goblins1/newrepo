/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttest2;

import static com.sun.webkit.graphics.WCImage.getImage;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Menake
 */
public class Cards {
    
    @FXML
    private ImageView ImageA; 
    
    
    private String faceName;
    private String suit;
    private int faceValue;
    private BufferedImage cardImage;
    
    /**
     * 
     * @param suit "spades" ,"clubs","diamonds","hearts"
     * @param face = 2,3,4,5.....,9,10,jack,Queen,King,Ace
     * @param value = 2,3,4,.....,12,13,14
     * @param card = a BufferedImage that represent the card
     */
    
    public Cards(String suit, String face, int value, BufferedImage card)
    {
        this.suit = suit;
        this.faceName = face;
        faceValue = value;
        cardImage = card;
    }
//    public static void main(String[] args) throws IOException {
//        Cards aceofSpades = new Cards("Spades","Ace",14,ImageIO.read(new File("loading.jpg")));
//    }

    /**
     * This return String representation of Card object
     * @return 
     */
//    public String toString()
//    {
//        return faceName + " of " + suit;
//    }
    
    /**
     * This return the faceValue of Card object as an Integer
     * @return 
     */
    public int getFaceValue()
    {
        return faceValue;
    }
    
    public BufferedImage getCardImage()
    {
        return cardImage;
    }
    
    Cards() throws IOException {
        System.out.println("projecttest2.Cards.<init>()");
        Cards aceofSpades = new Cards("Spades","Ace",14,ImageIO.read(new File("loading.png")));
        System.out.println(aceofSpades.toString());
        System.out.println(aceofSpades.getFaceValue());
        
        
        //card.getImage(new ImageIcon(getCardImage()));
        
//        JLabel card = new JLabel(new ImageIcon(aceofSpades.getCardImage()));
//        card.setSize(300, 400);

    }
    
}
