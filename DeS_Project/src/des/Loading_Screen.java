package des;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;

public class Loading_Screen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loading_Screen frame = new Loading_Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*]]]~'	
	 * Create the frame. ''	
	 */
	public Loading_Screen() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("SplitPaneDivider.draggingColor"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textLoading = new JLabel("");
		textLoading.setForeground(new Color(51, 51, 51));
		textLoading.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Crown_Load.gif"));
		textLoading.setIcon(icon);
		textLoading.setBounds(80,-230, 869, 800);
		contentPane.add(textLoading);
		
		JTextPane txtpnLoading = new JTextPane();
		txtpnLoading.setFont(new Font("Palatino Linotype", Font.PLAIN, 40));
		txtpnLoading.setText("Loading...                                     ");
		txtpnLoading.setBackground(Color.DARK_GRAY);
		txtpnLoading.setForeground(Color.WHITE);
		txtpnLoading.setBounds(415, 380, 191, 61);
		contentPane.add(txtpnLoading);
	}
}
