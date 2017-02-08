import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyNotepad extends JFrame implements ActionListener
{
JMenuBar jmb;
JMenu jm1,jm2;
JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5;
JRadioButtonMenuItem jrbmi1,jrbmi2,jrbmi3;
JCheckBoxMenuItem jcbmi1,jcbmi2,jcbmi3;
JTextArea jta;
public MyNotepad()
{
jmb=new JMenuBar();
jmb.setBackground(Color.RED);

jm1=new JMenu("file");
jm2=new JMenu("edit");
 
jmi1=new JMenuItem("new");
jmi2=new JMenuItem("save");
jmi3=new JMenuItem("exit");

jmi1.addActionListener(this);
jmi3.addActionListener(this);

jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.ALT_MASK));

jmi4=new JMenuItem("cut");
jmi5=new JMenuItem("copy");

jrbmi1=new JRadioButtonMenuItem("Lucida Console");
jrbmi2=new JRadioButtonMenuItem("New Times Roman");
jrbmi3=new JRadioButtonMenuItem("Comicsm");

jcbmi1=new JCheckBoxMenuItem("bold");
jcbmi2=new JCheckBoxMenuItem("Italic");
jcbmi3=new JCheckBoxMenuItem("underline");

jta=new JTextArea("");


jm1.add(jmi1);
jm1.add(jmi2);

jm1.addSeparator();

ButtonGroup bg=new ButtonGroup();

bg.add(jrbmi1);
bg.add(jrbmi2);

bg.add(jrbmi3);

jm1.add(jrbmi1);
jm1.add(jrbmi2);
jm1.add(jrbmi3);

jm1.addSeparator();

jm1.add(jmi3);
jm2.add(jmi4);
jm2.add(jmi5);

jm2.addSeparator();

jm2.add(jcbmi1);
jm2.add(jcbmi2);
jm2.add(jcbmi3);

jmb.add(jm1);
jmb.add(jm2);

add(jmb,BorderLayout.NORTH);
add(jta,BorderLayout.CENTER);


setSize(600,600);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==jmi1)
{
jta.setText("");
}
else
{
System.exit(0);
}
}

public static void main(String...s)
{
new MyNotepad();
}
}

