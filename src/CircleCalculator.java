import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class CircleCalculator extends JFrame {
	public CircleCalculator(){
		JPanel p1 = new JPanel();
		p1.add(new JLabel("Circle:"));
		
		JPanel p2 = new JPanel(new FlowLayout());
		p2.add(new JLabel("Radius:"));
		p2.add(new JTextField());
		p2.add(new JButton("­pºâ"));
		p2.add(new JButton("²M°£"));
		
		JPanel p3 = new JPanel(new GridLayout(2,2,2,2));
		p3.add(new JLabel("The area is:"));
		p3.add(new JTextField());
		p3.add(new JLabel("The perimeter is:"));
		p3.add(new JTextField());
		
	}
	public static void main(String[] args){
		CircleCalculator frame = new CircleCalculator();
		frame.pack();
		frame.setTitle("U10316031_GeoCalculate");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
