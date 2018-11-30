package mainFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField alarmIntervalTextField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setTitle("TIMER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton stopwatchRadioButton = new JRadioButton("STOPWATCH");
		stopwatchRadioButton.setBounds(149, 8, 149, 23);
		contentPane.add(stopwatchRadioButton);
		
		JRadioButton countdownRadioButton = new JRadioButton("COUNTDOWN");
		countdownRadioButton.setBounds(149, 34, 149, 23);
		contentPane.add(countdownRadioButton);
		
		JCheckBox alarmCheckButton = new JCheckBox("ALARM");
		alarmCheckButton.setBounds(302, 8, 129, 23);
		contentPane.add(alarmCheckButton);
		
		alarmIntervalTextField = new JTextField();
		alarmIntervalTextField.setEditable(false);
		alarmIntervalTextField.setHorizontalAlignment(SwingConstants.CENTER);
		alarmIntervalTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		alarmIntervalTextField.setBounds(383, 36, 93, 26);
		contentPane.add(alarmIntervalTextField);
		alarmIntervalTextField.setColumns(10);
		
		JLabel alarmIntervalLabel = new JLabel("INTERVAL");
		alarmIntervalLabel.setBounds(302, 40, 70, 15);
		contentPane.add(alarmIntervalLabel);
		
		JToggleButton thirtySecondsToggleButton = new JToggleButton("30");
		thirtySecondsToggleButton.setForeground(new Color(51, 51, 51));
		thirtySecondsToggleButton.setBounds(12, 72, 93, 25);
		contentPane.add(thirtySecondsToggleButton);
		
		JToggleButton sixtySecondsToggleButton = new JToggleButton("60");
		sixtySecondsToggleButton.setBounds(117, 72, 93, 25);
		contentPane.add(sixtySecondsToggleButton);
		
		JToggleButton twoMinutesToggleButton = new JToggleButton("120");
		twoMinutesToggleButton.setBounds(12, 111, 93, 25);
		contentPane.add(twoMinutesToggleButton);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Dialog", Font.PLAIN, 40));
		textField.setColumns(10);
		textField.setBounds(12, 10, 129, 52);
		contentPane.add(textField);
		
		JToggleButton customTimeToggleButton = new JToggleButton("CUSTOM");
		customTimeToggleButton.setBounds(117, 111, 93, 25);
		contentPane.add(customTimeToggleButton);
		
		JButton resetButton = new JButton("RESET");
		resetButton.setBounds(222, 72, 123, 64);
		contentPane.add(resetButton);
		
		JButton startButton = new JButton("START");
		startButton.setBounds(353, 72, 123, 64);
		contentPane.add(startButton);
	}
}
