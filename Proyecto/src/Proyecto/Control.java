package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Control extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Control frame = new Control();
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
	public Control() {
		setTitle("Administraci\u00F3n General");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblElijaUnaDe = new JLabel("Elija una de las opciones que des\u00E9a hacer");
		lblElijaUnaDe.setFont(new Font("Kristen ITC", Font.PLAIN, 18));
		contentPane.add(lblElijaUnaDe, BorderLayout.NORTH);
		
		JButton btnReservarHabitacin = new JButton("Reservar Habitaci\u00F3n");
		btnReservarHabitacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Habi h = new Habi();
				h.setVisible(true);
				
			}
		});
		contentPane.add(btnReservarHabitacin, BorderLayout.WEST);
		
		JButton btnReservarUnServicio = new JButton("Reservar un Servicio");
		contentPane.add(btnReservarUnServicio, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Imprimir");
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
