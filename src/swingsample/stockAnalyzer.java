package swingsample;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import java.awt.event.ActionEvent;

public class stockAnalyzer extends JFrame {

	private JPanel contentPane;
	private ContainerListener[] date;
	private int numDays;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stockAnalyzer frame = new stockAnalyzer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Get the number of days chosen
	 * @return number of days
	 */
	public int getNumDays() { return this.numDays; }
	
	/**
	 * Get the start date
	 * @return the start date as a ContainerListenr[] array
	 */
	public ContainerListener[] getDate() { return this.date; }

	/**
	 * Create the frame.
	 */
	public stockAnalyzer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBackground(Color.ORANGE);
		contentPane.add(dateChooser, BorderLayout.CENTER);
		dateChooser.setLayout(null);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(112, 45, 91, 20);
		dateChooser.add(dateChooser_1);
		
		JLabel lblStartDate = DefaultComponentFactory.getInstance().createLabel("Start Date :");
		lblStartDate.setBounds(10, 51, 92, 14);
		dateChooser.add(lblStartDate);
		// Set date according to the selected start date
		date = dateChooser.getContainerListeners();
		
		JLabel lblSelectNumberOf = new JLabel("Select number of days");
		lblSelectNumberOf.setBounds(24, 103, 153, 14);
		dateChooser.add(lblSelectNumberOf);
		
		//Initialize the radio buttons:
		JRadioButton rdbtnNewRadioButton = new JRadioButton("20");
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("100");
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("50");
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("200");
		
		rdbtnNewRadioButton.setBounds(34, 124, 109, 23);
		dateChooser.add(rdbtnNewRadioButton);
		// Set numDays according to the selected range
		if(rdbtnNewRadioButton.isSelected()) {
			numDays = 20;
			rdbtnNewRadioButton_1.setSelected(false);
			rdbtnNewRadioButton_2.setSelected(false);
			rdbtnNewRadioButton_3.setSelected(false);
			}

		rdbtnNewRadioButton_1.setBounds(34, 176, 109, 23);
		dateChooser.add(rdbtnNewRadioButton_1);
		// Set numDays according to the selected range
		if(rdbtnNewRadioButton_1.isSelected()) {
			numDays = 100;
			rdbtnNewRadioButton.setSelected(false);
			rdbtnNewRadioButton_2.setSelected(false);
			rdbtnNewRadioButton_3.setSelected(false);
			}
		
		rdbtnNewRadioButton_2.setBounds(34, 150, 109, 23);
		dateChooser.add(rdbtnNewRadioButton_2);
		// Set numDays according to the selected range
		if(rdbtnNewRadioButton_2.isSelected()) {
			numDays = 50;
			rdbtnNewRadioButton.setSelected(false);
			rdbtnNewRadioButton_1.setSelected(false);
			rdbtnNewRadioButton_3.setSelected(false);
			}
		
		rdbtnNewRadioButton_3.setBounds(34, 202, 109, 23);
		dateChooser.add(rdbtnNewRadioButton_3);
		// Set numDays according to the selected range
		if(rdbtnNewRadioButton_3.isSelected()) {
			numDays = 200;
			rdbtnNewRadioButton.setSelected(false);
			rdbtnNewRadioButton_1.setSelected(false);
			rdbtnNewRadioButton_2.setSelected(false);
		}
		
		JButton btnNewButton = new JButton("Display Chart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplayChart.main(null);
			}
		});
		btnNewButton.setBounds(192, 202, 115, 23);
		dateChooser.add(btnNewButton);
		
		JLabel lblProfitRus = new JLabel("Profit Rus");
		lblProfitRus.setBounds(149, 11, 91, 14);
		dateChooser.add(lblProfitRus);
	}
}
