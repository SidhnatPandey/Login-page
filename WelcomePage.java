import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    
    JFrame frame = new JFrame();
    JLabel welcomLabel = new JLabel("Hello!");

    WelcomePage(String userId){


        welcomLabel.setBounds(0,0,200,35);
        welcomLabel.setFont(new Font(null, Font.PLAIN,25));
        welcomLabel.setText("Hello "+userId);

        frame.add(welcomLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
