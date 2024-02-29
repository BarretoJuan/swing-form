package proyecto.Renderers;
import javax.swing.JTextField;
import proyecto.Colors;
import proyecto.SetImageLabel;
import proyecto.ShowHint;
import proyecto.Uppercase;

import javax.swing.JPanel;

import javax.swing.InputVerifier;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.*;

public class RenderID {

    public RenderID(String LabelText, String EntryText, JPanel MainPanel, InputVerifier inputVerifier, String url){
        JPanel RowPanel = new JPanel(); // We create a Panel for the first row
        RowPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        RowPanel.setBackground(Colors.bg);
    
        //We create the component label
        JLabel CompLabel = new JLabel(LabelText);
        CompLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        CompLabel.setBackground(Colors.bg);
        CompLabel.setOpaque(true);
        CompLabel.setHorizontalAlignment(JLabel.RIGHT);
        CompLabel.setPreferredSize(new Dimension(260,30));
    
        //We create the component text 
        JTextField CompField = new JTextField();
        ShowHint.setHint(EntryText,CompField);
        CompField.setPreferredSize(new Dimension(210, 30));
        CompField.setFont(new Font("Verdana", Font.PLAIN, 20));
        CompField.setInputVerifier(inputVerifier);
        CompField.setBackground(Colors.formbg);
        CompField.addKeyListener(new Uppercase.UppercaseListener());
        String tiposCedula[] = {"V","E"};
        JComboBox<String> tipoCedula = new JComboBox<>(tiposCedula);
        tipoCedula.setPreferredSize(new Dimension(35,30));
        
        JLabel imageLabel = new JLabel();
        imageLabel.setSize(30,30);
        new SetImageLabel().SetIconLabel(imageLabel, url);

  
    
        // Add the components to the panel
  
        RowPanel.add(CompLabel);
        RowPanel.add(tipoCedula);
        RowPanel.add(CompField);
        RowPanel.add(imageLabel);
    
        // Render it to the main frame (panel being rendered)
        MainPanel.add(RowPanel);
    }
        
}
