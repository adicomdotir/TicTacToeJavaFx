/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;

/**
 *
 * @author adicom
 */
public class FXMLDocumentController implements Initializable {

    private byte[][] cells = {{0,0,0},{0,0,0},{0,0,0}};
    private byte player = 1;
    private ImageView[] iv = new ImageView[9];
    private Image imageO, imageX;
     
    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if(btn == btn0 && cells[0][0] == 0) {
            check(btn, iv[0]);
            cells[0][0] = player;
            checkWin();
            if(player == 1) player = 2;
                else player = 1;
        } else if(btn == btn1 && cells[0][1] == 0) {
            check(btn, iv[1]);
            cells[0][1] = player;
            checkWin();
            if(player == 1) player = 2;
                else player = 1;
        } else if(btn == btn2 && cells[0][2] == 0) {
            check(btn, iv[2]);
            cells[0][2] = player;
            checkWin();
            if(player == 1) player = 2;
                else player = 1;
        } else if(btn == btn3 && cells[1][0] == 0) {
            check(btn, iv[3]);
            cells[1][0] = player;
            checkWin();
            if(player == 1) player = 2;
                else player = 1;
        } else if(btn == btn4 && cells[1][1] == 0) {
            check(btn, iv[4]);
            cells[1][1] = player;
            checkWin();
            if(player == 1) player = 2;
                else player = 1;
        } else if(btn == btn5 && cells[1][2] == 0) {
            check(btn, iv[5]);
            cells[1][2] = player;
            checkWin();
            if(player == 1) player = 2;
                else player = 1;
        } else if(btn == btn6 && cells[2][0] == 0) {
            check(btn, iv[6]);
            cells[2][0] = player;
            checkWin();
            if(player == 1) player = 2;
                else player = 1;
        } else if(btn == btn7 && cells[2][1] == 0) {
            check(btn, iv[7]);
            cells[2][1] = player;
            checkWin();
            if(player == 1) player = 2;
                else player = 1;
        } else if(btn == btn8 && cells[2][2] == 0) {
            check(btn, iv[8]);
            cells[2][2] = player;
            checkWin();
            if(player == 1) player = 2;
                else player = 1;
        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(" " + cells[i][j]);
//            }
//            System.out.println();
//        }
    }
    
    private void check(Button btn, ImageView iv) {
        if(player == 1) {
            iv.setImage(imageX);
            btn.setGraphic(iv);
        } else {
            iv.setImage(imageO);
            btn.setGraphic(iv);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        InputStream input = getClass().getResourceAsStream("/javafxapplication6/x.png");
        imageX = new Image(input);
        input = getClass().getResourceAsStream("/javafxapplication6/o.png");
        imageO = new Image(input);
        iv[0] = new ImageView();
        iv[1] = new ImageView();
        iv[2] = new ImageView();
        iv[3] = new ImageView();
        iv[4] = new ImageView();
        iv[5] = new ImageView();
        iv[6] = new ImageView();
        iv[7] = new ImageView();
        iv[8] = new ImageView();
    }
    
    public void reset() {
        
    }
    
    
    public void checkWin() {
        if(cells[0][0]==player && cells[0][1]==player && cells[0][2]==player)
            messageBox();
        else if(cells[1][0]==player && cells[1][1]==player && cells[1][2]==player)
            messageBox();
        else if(cells[2][0]==player && cells[2][1]==player && cells[2][2]==player)
            messageBox();
        else if(cells[0][0]==player && cells[1][0]==player && cells[2][0]==player)
            messageBox();
        else if(cells[0][1]==player && cells[1][1]==player && cells[2][1]==player)
            messageBox();
        else if(cells[0][2]==player && cells[1][2]==player && cells[2][2]==player)
            messageBox();
        else if(cells[0][0]==player && cells[1][1]==player && cells[2][2]==player)
            messageBox();
        else if(cells[0][2]==player && cells[1][1]==player && cells[2][0]==player)
            messageBox();
        
    }
    
    public void messageBox() {
        JOptionPane.showMessageDialog(null, "Winner");
    }

}
