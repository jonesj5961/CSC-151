import javax.swing.JOptionPane;


public class Test {


    public static void main(String[] args) {
        //Plain text message
        System.out.println("Testing");
        // Dialog boxes
        JOptionPane.showMessageDialog(null, "This is a message",
            "This is a Dialog Label",
            JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a second message",
            "This is a Second Dialog Label",
            JOptionPane.ERROR_MESSAGE);

        //Now, let's get some input
        String name = JOptionPane.showInputDialog("Type in your name?");
        System.out.println("Name was " + name);
        //Display the result
        JOptionPane.showMessageDialog(null, "Your name is " + name, "Name Dialog",
            JOptionPane.INFORMATION_MESSAGE);
    }
}