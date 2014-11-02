package Proyecto;

import javax.swing.JOptionPane;

public class Habi extends javax.swing.JFrame{
	public Habi(){
		initComponents();
	}
	@SuppressWarnings("unchecked")
	   
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setText("Ingrese nombre:");

        lbl2.setText("Ingrese los dias de su reservacion:");

        lbl3.setText("Ingrese el tipo de habitacion:");

        lbl4.setText("Ingrese el precio:");

        Boton1.setText("Revisar Precios");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setText("Revisar Descuentos");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.setText("Agregar ");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton4.setText("Agregar a cola");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl2)
                                    .addComponent(lbl3)
                                    .addComponent(lbl4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(txt2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Boton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton4)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1)
                    .addComponent(Boton2)
                    .addComponent(Boton3)
                    .addComponent(Boton4))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }
	
    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {
       JOptionPane.showMessageDialog(null, "Los precios de las habitaciones son:"
       		+ " 1.) Sencilla ------ US$50.00"
       		+ " 2.) Regular ------ US$100.00 "
       		+ "3.) Exclusiva ----- US$150.00");
    }
    public class txt1{
    	public String input;
    }
    public class txt2{
    	public Integer input;
    }
    public class txt3{
    	public String input;
    }
    public class txt4{
    	public Integer input;
    }
    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "La promoción vigente ahorita es de 1 habitación Regular por 3 días, más una reservacion en el restaurante por solo US$110");
    }

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {
          Lista l = new Lista();
          
    	  String Nombre = txt1.getText();
    	  String dias = txt2.getText();
    	  String entero = dias;
    	  Integer enteros = Integer.parseInt(entero);
          String tipo = txt3.getText();
          String precio = txt4.getText();
          String entero2 = precio;
          Integer precios = Integer.parseInt(entero2);
          l.InsertarInicio(Nombre, enteros, precios, tipo, "ocupado");
          JOptionPane.showMessageDialog(null, "Se han incertado los datos correctamente. Gracias");
    }

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {
        ListaCola lc = new ListaCola();
        	String Nombre = txt1.getText();
        	String dias = txt2.getText();
        	String ent = dias;
        	Integer ents = Integer.parseInt(ent);
        	String tipo = txt3.getText();
        	String precio = txt4.getText();
        	String ent2 = precio;
        	Integer precios = Integer.parseInt(ent2);
        	lc.Insertar(Nombre, ents, precios, tipo, "Espera");
        	JOptionPane.showMessageDialog(null, "Se han agregado los clientes a la lista de espera. Gracias");
    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Control().setVisible(true);
            }
        });
    }

    // NO MODIFICAR
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // NO MODIFICAR
}
