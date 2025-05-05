package prarthana_panikar;

package prarthana_panikar52;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

import javax.swing.JFrame;

public class LoginPage extends JFrame {
    TextField T1, T2;

    LoginPage() {
        Label L1, L2;
        Button b;

        // Create components
        L1 = new Label("UserName:");
        L2 = new Label("Password:");
        T1 = new TextField();
        T2 = new TextField();
        T2.setEchoChar('*');
        b = new Button("Login");

        // Set bounds
        L1.setBounds(50, 80, 80, 30);
        T1.setBounds(150, 80, 150, 30);
        L2.setBounds(50, 130, 80, 30);
        T2.setBounds(150, 130, 150, 30);
        b.setBounds(130, 180, 80, 30);

        // Add components
        add(L1);
        add(T1);
        add(L2);
        add(T2);
        add(b);

        // Layout and frame setup
        setLayout(null);
        setSize(400, 300);
        setTitle("Login Page");
        setVisible(true);

        // Button click handler with try-catch
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String user = T1.getText();
                    String pass = T2.getText();
                    if (user.equals("admin") && pass.equals("1234")) {
                        System.out.println("Login successful");
                        destroy();
                    } else {
                        throw new Exception("Incorrect username or password");
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        // Close window on click
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                destroy();
            }
        })
    }

    void destroy() {
        dispose();
        System.exit(0);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
