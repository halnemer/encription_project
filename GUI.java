package securitycisproject;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;

public class GUI  extends JFrame {
    
    //Panels
    JPanel mainFrame;
    JPanel southFrame;
    JPanel inputFrame;
    JPanel outputFrame;
    JPanel keyFrame;
    JPanel caeserPanel;
    JPanel vigenerePanel;
    JPanel transpositionPanel;
    JPanel playFiarPanel;
    JPanel titlePanel;
    
    //Buttons
    JButton encryptButton;
    JButton decryptButton;
    JButton clearButton;
    
    //Label
    JLabel title;
    
    JLabel ceasarKey;
    JLabel vigenereKey;
    JLabel transpositionKey;
    JLabel playfairKey;
    
    JLabel caesarCipher;
    JLabel vigenereCipher;
    JLabel transpositionCipher;
    JLabel playFairCipher;
    
    
    //TextField
    JTextArea inputTextArea;
    JTextArea outputTextArea;
    JTextArea caesarTextArea;
    JTextArea vigenereTextArea;
    JTextArea transpositionTextArea;
    JTextArea playFairTextArea;
    
    JTextField caesarKeyField;
    JTextField vigenereKeyField;
    JTextField transpotionKeyField;
    JTextField playFairKeyField;
    
    GUI(){ 
        
        mainFrame = new JPanel(new GridLayout(7,1));
        
        //Title Panel
        titlePanel = new JPanel(new FlowLayout());
        title = new JLabel("Ciphering Program");
        title.setFont(new Font("Serif", Font.PLAIN, 40));
        title.setForeground(Color.white);
        titlePanel.add(title);
        
        //InputFrame
        inputFrame = new JPanel(new BorderLayout());
        inputTextArea = new JTextArea();
        inputTextArea.setBorder(new TitledBorder("Input Text"));
        inputFrame.add(inputTextArea);
        mainFrame.add(inputFrame);
        
        //KeyFrame
        keyFrame = new JPanel (new FlowLayout());
        ceasarKey = new JLabel("Ceasar Key:");
        vigenereKey = new JLabel("  Vigenere Key:");
        transpositionKey = new JLabel("  Transposition Key:");
        playfairKey = new JLabel("    PlayFair Key:");
        //ceasarKey.setFont(new Font("Serif",Font.BOLD,16));
        caesarKeyField = new JTextField("",3);
        vigenereKeyField = new JTextField("",7);
        transpotionKeyField = new JTextField("",5);
        playFairKeyField = new JTextField("",10);
        keyFrame.add(ceasarKey);
        keyFrame.add(caesarKeyField);
        keyFrame.add(vigenereKey);
        keyFrame.add(vigenereKeyField);
        keyFrame.add(transpositionKey);
        keyFrame.add(transpotionKeyField);
        keyFrame.add(playfairKey);
        keyFrame.add(playFairKeyField);
        mainFrame.add(keyFrame);
        
        //Ceasar Cipher
        caeserPanel = new JPanel(new FlowLayout());
        caesarCipher = new JLabel("Caesar Cipher:            ");
        caesarTextArea = new JTextArea(3,52);
        caesarTextArea.setBorder(new TitledBorder(""));
        caesarCipher.setFont(new Font("Serif", Font.BOLD, 18));
        caeserPanel.add(caesarCipher);
        caeserPanel.add(caesarTextArea);
        mainFrame.add(caeserPanel);
        
        //Vigenere Cipher
        vigenerePanel = new JPanel(new FlowLayout());
        vigenereCipher = new JLabel("Vigenere Cipher:         ");
        vigenereTextArea = new JTextArea(3,52);
        vigenereTextArea.setBorder(new TitledBorder(""));
        vigenereCipher.setFont(new Font("Serif", Font.BOLD, 18));
        vigenerePanel.add(vigenereCipher);
        vigenerePanel.add(vigenereTextArea);
        mainFrame.add(vigenerePanel);
        
        //Transposition Cipher
        transpositionPanel = new JPanel(new FlowLayout());
        transpositionCipher = new JLabel("Transposition Cipher: ");
        transpositionTextArea = new JTextArea(3,52);
        transpositionTextArea.setBorder(new TitledBorder(""));
        transpositionCipher.setFont(new Font("Serif", Font.BOLD, 18));
        transpositionPanel.add(transpositionCipher);
        transpositionPanel.add(transpositionTextArea);
        mainFrame.add(transpositionPanel);
        
        //PlayFair Cipher
        playFiarPanel = new JPanel(new FlowLayout());
        playFairCipher = new JLabel("PlayFair Cipher:         ");
        playFairTextArea = new JTextArea(3,52);
        playFairTextArea.setBorder(new TitledBorder(""));
        playFairCipher.setFont(new Font("Serif", Font.BOLD, 18));
        playFiarPanel.add(playFairCipher);
        playFiarPanel.add(playFairTextArea);
        mainFrame.add(playFiarPanel);
        
        //output
        outputFrame = new JPanel(new BorderLayout());
        outputTextArea = new JTextArea();
        outputTextArea.setBorder(new TitledBorder("Output Text"));
        outputFrame.add(outputTextArea);
        mainFrame.add(outputFrame);
        
        //South   
        encryptButton = new JButton("Encrypt");
        decryptButton = new JButton("Decrypt");
        clearButton = new JButton("Clear");
        southFrame = new JPanel(new FlowLayout());
        southFrame.add(encryptButton);
        southFrame.add(decryptButton);
        southFrame.add(clearButton);
        add(titlePanel,BorderLayout.NORTH);
        add(southFrame,BorderLayout.SOUTH);
        
        //buttons listener
        theHandler handler = new theHandler();
        encryptButton.addActionListener(handler);
        decryptButton.addActionListener(handler);
        clearButton.addActionListener(handler);
        
        
        //Coloring
        ceasarKey.setForeground(Color.white);
        vigenereKey.setForeground(Color.white);
        transpositionKey.setForeground(Color.white);
        playfairKey.setForeground(Color.white);
        caesarCipher.setForeground(Color.WHITE);
        vigenereCipher.setForeground(Color.WHITE);
        transpositionCipher.setForeground(Color.WHITE);
        playFairCipher.setForeground(Color.WHITE);
        
        titlePanel.setBackground(Color.BLACK);
        southFrame.setBackground(Color.BLACK);
        keyFrame.setBackground(Color.black);
        caeserPanel.setBackground(Color.black);
        playFiarPanel.setBackground(Color.black);
        vigenerePanel.setBackground(Color.black);
        transpositionPanel.setBackground(Color.black);
        outputFrame.setBackground(Color.black);
        inputFrame.setBackground(Color.black);
        add(mainFrame,BorderLayout.CENTER);
        
        setSize(850,650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Security Project");
        
    }
    
    private class theHandler implements ActionListener{
        

        public void actionPerformed(ActionEvent event){
            String caesartext;
            String vigeneretext;
            String transpositiontext;
            String playfairtext;
            String s;
            String playfairKey;
            String vigenereKey;
            int caesarKey;
            String transpositionKey;
            
            CaesarCipher c = new CaesarCipher();
            VigenereCipher v = new VigenereCipher();
            TranspositionCipher t = new TranspositionCipher();
            PlayfairCipherDecryption p = new PlayfairCipherDecryption();
             
            if(event.getSource() == encryptButton){
                caesarCipher.setText("Caesar Cipher:            ");
                vigenereCipher.setText("Vigenere Cipher:         ");
                transpositionCipher.setText("Transposition Cipher: ");
                playFairCipher.setText("PlayFair Cipher:         ");
                
                s = inputTextArea.getText();
                
                caesarKey = Integer.parseInt(caesarKeyField.getText());
                caesartext = c.encrypt(s,caesarKey);
                caesarTextArea.setText(caesartext);        
                
                vigenereKey = vigenereKeyField.getText();
                vigeneretext = v.encrypt(caesartext,vigenereKey);
                vigenereTextArea.setText(vigeneretext);
                
                transpositionKey = transpotionKeyField.getText();
                transpositiontext = t.encrypter(vigeneretext,transpositionKey);
                transpositionTextArea.setText(transpositiontext);
                        
                playfairKey = playFairKeyField.getText();
                p.setKey(playfairKey);
                p.KeyGen();
                playfairtext = p.encryptMessage(transpositiontext);
                playFairTextArea.setText(playfairtext);
                
                outputTextArea.setText(playfairtext);
            }
            
            else if(event.getSource() == decryptButton){
                caesarTextArea.setText("");
                vigenereTextArea.setText("");
                transpositionTextArea.setText("");
                playFairTextArea.setText("");
                outputTextArea.setText("");
                
                s = inputTextArea.getText();
                caesarCipher.setText("PlayFair Cipher:         ");
                vigenereCipher.setText("Transposition Cipher: ");
                transpositionCipher.setText("Vigenere Cipher:         ");
                playFairCipher.setText("Caesar Cipher:            ");
                
                caesarTextArea.setText(s);
                
                playfairKey = playFairKeyField.getText();
                p.setKey(playfairKey);
                p.KeyGen();
                playfairtext = p.decryptMessage(s);
                vigenereTextArea.setText(playfairtext);
               
                transpositionKey = transpotionKeyField.getText();
                transpositiontext = t.decrypter();
                transpositionTextArea.setText(transpositiontext);                
                
                vigenereKey = vigenereKeyField.getText();
                vigeneretext = v.decrypt(transpositiontext,vigenereKey);
                playFairTextArea.setText(vigeneretext);
                
                caesarKey = Integer.parseInt(caesarKeyField.getText());
                caesartext = c.decrypt(vigeneretext,caesarKey);
                outputTextArea.setText(caesartext);
                  
            }
            
            else if(event.getSource() == clearButton){
                caesarTextArea.setText("");
                vigenereTextArea.setText("");
                transpositionTextArea.setText("");
                playFairTextArea.setText("");
                inputTextArea.setText("");
                outputTextArea.setText("");
                
                caesarKeyField.setText("");
                vigenereKeyField.setText("");
                transpotionKeyField.setText("");
                playFairKeyField.setText("");
            }
        }
    }

}
