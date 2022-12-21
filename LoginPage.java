import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class LoginPage implements ActionListener{


    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordJLabel = new JLabel("password:");
    JLabel messagLabel = new JLabel();    
    HashMap<String, String> logininfo = new HashMap<>();          
    LoginPage(HashMap<String, String> logininfoOriginal){
        logininfo = logininfoOriginal;

        userIDLabel.setBounds(50,100,75,25);
        userPasswordJLabel.setBounds(50,150,75,25);

        messagLabel.setBounds(125,250,250,35);
        messagLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(225,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(125,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordJLabel);
        frame.add(messagLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){


        if(e.getSource()==resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource()==loginButton){
            String userId = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(logininfo.containsKey(userId)){
                if(logininfo.get(userId).equals(password)){
                    messagLabel.setForeground(Color.green);
                    messagLabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userId);
                }else{
                    messagLabel.setForeground(Color.red);
                    messagLabel.setText("Wrong password!..");
                }
            }else{
                messagLabel.setForeground(Color.red);
                messagLabel.setText("username not found");
            }
        }
    }
}
