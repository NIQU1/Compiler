package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class HelpFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea txtjavac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpFrame frame = new HelpFrame();
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
	public HelpFrame() {
		setResizable(false);
		setTitle("\u5E2E\u52A9");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5B66\u53F7\uFF1A631707060316");
		label.setFont(new Font("¿¬Ìå", Font.PLAIN, 18));
		label.setBounds(32, 24, 177, 33);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A\u5B81\u5411\u9633");
		label_1.setFont(new Font("¿¬Ìå", Font.PLAIN, 18));
		label_1.setBounds(32, 54, 177, 33);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u7B80\u4ECB\uFF1A");
		label_2.setFont(new Font("¿¬Ìå", Font.PLAIN, 18));
		label_2.setBounds(32, 83, 177, 33);
		contentPane.add(label_2);
		
		txtjavac = new JTextArea();
		txtjavac.setText("      \u8FD9\u662F\u4E00\u4E2A\u7B80\u6613\u7684\u57FA\u4E8EJava\u7684C\u8BED\u8A00\u7F16\u8BD1\u5668\u3002\u5B9E\u73B0\u4E86\u8BCD\u6CD5\u5206\u6790\r\n\u5668\u3001\u8BED\u6CD5\u5206\u6790\u5668\u3001\u8BED\u4E49\u5206\u6790\u3001\u4E2D\u95F4\u4EE3\u7801\u751F\u6210\u4EE5\u53CA\u76EE\u6807\u4EE3\u7801\u8F6C\u6362\u7684\r\n\u57FA\u672C\u529F\u80FD\u3002\r\n      \u6E90\u4EE3\u7801\u53EF\u4EE5\u4ECE\u6587\u4EF6\u4E2D\u9009\u62E9\uFF0C\u4E5F\u53EF\u4EE5\u76F4\u63A5\u8F93\u5165\u5728\u6E90\u6587\u4EF6\u6846\u5185\uFF0C\r\n\u4F9D\u6B21\u70B9\u51FB\u8BCD\u6CD5\u5206\u6790\u3001\u8BED\u6CD5\u5206\u6790\u3001\u4E2D\u95F4\u4EE3\u7801\u751F\u6210\u3001\u76EE\u6807\u4EE3\u7801\u751F\u6210\u5373\r\n\u53EF\u5B8C\u6210\u6E90\u4EE3\u7801\u5230\u76EE\u6807\u4EE3\u7801\u7684\u7F16\u8BD1\u8F6C\u6362\u3002\r\n                                                    \u2014\u2014 \u5B81\u5411\u9633     06/29");
		txtjavac.setToolTipText("");
		txtjavac.setEditable(false);
		txtjavac.setBounds(32, 113, 402, 148);
		contentPane.add(txtjavac);
		txtjavac.setColumns(15);
	}
}
