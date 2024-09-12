package random;
import javax.swing.*;
import java.io.*;
public class swingtest {
 public static void main(String[] args) {
    //making an instance of jFrame
    JFrame frame = new JFrame();

    //making button on j frame 
    JButton button = new JButton("java button");

    //x,y,z witdth and height for the button
    button.setBounds(150, 200, 220, 50);

    //adding button to JFrame
    frame.add(button);

    //setting the width and hight for box
    frame.setSize(500,600);

    //no layout managesrs
    frame.setLayout(null);

    //mkaing the frame visible 
    frame.setVisible(true);
 }   
}
