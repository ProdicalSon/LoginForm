
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class MainFrame extends JFrame{
    public void initialize(User user){
        //Info Panel
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(0, 2, 5, 5));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        infoPanel.add(new JLabel("Name"));
        infoPanel.add(new JLabel(user.name));
        infoPanel.add(new JLabel("Email"));
        infoPanel.add(new JLabel(user.email));
        infoPanel.add(new JLabel("phone"));
        infoPanel.add(new JLabel(user.phone));
        infoPanel.add(new JLabel("Address"));
        infoPanel.add(new JLabel(user.address));
       
        Component[] labels = infoPanel.getComponents();
        for (int i = 0; i< labels.length; i++){
            labels[i].setFont(new Font("Segoe print", Font.BOLD, 18));
        }

        add(infoPanel, BorderLayout.NORTH);



        setTitle("Dashboard");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
