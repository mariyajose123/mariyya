import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Electricity extends Applet implements ActionListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8;
TextField t1,t2,t3,t4,t5,t6,t7,t8;
Button b1;
Panel p1,p2;
public void init()
{
p1=new Panel();
p2=new Panel();
p1.setLayout(new GridLayout(8,2));
l1=new Label("Consumer number:");
l2=new Label("Name:");
l3=new Label("Previous reading:");
l4=new Label("Current reading:");
l5=new Label("Unit consumed:");
l6=new Label("Charge per unit:");
l7=new Label("Meter rent:");
l8=new Label("Total:");
b1=new Button("Generate");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
t4=new TextField(10);
t5=new TextField(10);
t6=new TextField(10);
t7=new TextField(10);
t8=new TextField(10);
b1.addActionListener(this);
p1.add(l1);
p1.add(t1);
p1.add(l2);
p1.add(t2);
p1.add(l3);
p1.add(t3);
p1.add(l4);
p1.add(t4);
p1.add(l5);
p1.add(t5);
p1.add(l6);
p1.add(t6);
p1.add(l7);
p1.add(t7);
p1.add(l8);
p1.add(t8);
p2.add(b1);
setLayout(new GridLayout(2,1));
add(p1);
add(p2);
//t7.setText("20");

}
public void actionPerformed(ActionEvent ae)
{
int pr=Integer.parseInt(t3.getText());
int cr=Integer.parseInt(t4.getText());
int unit=cr-pr;
int charge=Integer.parseInt(t6.getText());
int tot=(unit*charge)/20;
t5.setText(unit+" ");
t8.setText(tot+" ");
}
}
/*<Applet code="Electriicity.class"  height=800 width=800>
</Applet>
*/
