package addnumber;

import My.Addnumber.AddNumberUI;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Emilio
 */
public class AddNumber
{
    public static void main(String[] args)
    {
        AddNumberUI    addNumberUI = new AddNumberUI();
        addNumberUI.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       // supermarketGUIView.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addNumberUI.setLocationRelativeTo(null);
        addNumberUI.setVisible(true);
    }
    
}
