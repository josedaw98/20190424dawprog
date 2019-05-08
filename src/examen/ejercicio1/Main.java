package examen.ejercicio1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public  class Main extends JFrame implements ActionListener, WindowListener {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			try {
				new Main().setVisible(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
		
	
	
	public Main() throws IOException {
		super("Ejercicio 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lienzo lienzo = new Lienzo(500, 600);
		getContentPane().add(lienzo ,BorderLayout.NORTH );
		pack();
		setLocationRelativeTo(null);
		SwingUtilities.invokeLater(() -> {setVisible(true);});
		
		JToolBar toolBar = new JToolBar();
		
		JButton a = new JButton("A");
		a.setActionCommand("A");
		a.addActionListener(this);
		toolBar.add(a , BorderLayout.SOUTH);
		
		
		JButton b = new JButton("B");
		b.setActionCommand("B");
		b.addActionListener(this);
		toolBar.add(b , BorderLayout.SOUTH);
		
		
		JButton c = new JButton("C");
		c.setActionCommand("C");
		c.addActionListener(this);
		toolBar.add(c , BorderLayout.SOUTH);
		
		
		JButton d = new JButton("D");
		d.setActionCommand("LOAD");
		d.addActionListener(this);
		toolBar.add(d , BorderLayout.SOUTH);
		
		
		JButton e = new JButton("E");
		e.setActionCommand("E");
		e.addActionListener(this);
		toolBar.add(e , BorderLayout.SOUTH);
		
		
		JButton f = new JButton("F");
		f.setActionCommand("F");
		f.addActionListener(this);
		toolBar.add(f , BorderLayout.SOUTH);
		
		
		JButton g = new JButton("G");
		g.setActionCommand("G");
		g.addActionListener(this);
		toolBar.add(g , BorderLayout.SOUTH);
		
		
		JButton h = new JButton("H");
		h.setActionCommand("H");
		h.addActionListener(this);
		toolBar.add(h , BorderLayout.SOUTH);
		
		
		JButton i = new JButton("I");
		i.setActionCommand("I");
		i.addActionListener(this);
		toolBar.add(i , BorderLayout.SOUTH);
	
		
		JButton j = new JButton("J");
		j.setActionCommand("J");
		j.addActionListener(this);
		toolBar.add(j , BorderLayout.SOUTH);
		
		
		JButton k = new JButton("K");
		k.setActionCommand("K");
		k.addActionListener(this);
		toolBar.add(k , BorderLayout.SOUTH);
	
		
		JButton l = new JButton("L");
		l.setActionCommand("L");
		l.addActionListener(this);
		toolBar.add(l , BorderLayout.SOUTH);
		
		
		JButton m = new JButton("M");
		m.setActionCommand("M");
		m.addActionListener(this);
		toolBar.add(m , BorderLayout.SOUTH);
		
		
		JButton n = new JButton("N");
		n.setActionCommand("N");
		n.addActionListener(this);
		toolBar.add(n , BorderLayout.SOUTH);
		
		
		JButton ñ= new JButton("Ñ");
		ñ.setActionCommand("Ñ");
		ñ.addActionListener(this);
		toolBar.add(ñ , BorderLayout.SOUTH);
		
		
		JButton o = new JButton("O");
		o.setActionCommand("O");
		o.addActionListener(this);
		toolBar.add(o , BorderLayout.SOUTH);
		
		
		JButton p = new JButton("P");
		p.setActionCommand("P");
		p.addActionListener(this);
		toolBar.add(p , BorderLayout.SOUTH);
		
		
		JButton q = new JButton("Q");
		q.setActionCommand("Q");
		q.addActionListener(this);
		toolBar.add(q , BorderLayout.SOUTH);
		
		
		JButton r = new JButton("R");
		r.setActionCommand("R");
		r.addActionListener(this);
		toolBar.add(r , BorderLayout.SOUTH);
		
		
		JButton s = new JButton("S");
		s.setActionCommand("S");
		s.addActionListener(this);
		toolBar.add(s , BorderLayout.SOUTH);
		
		
		JButton t = new JButton("T");
		t.setActionCommand("T");
		t.addActionListener(this);
		toolBar.add(t , BorderLayout.SOUTH);
		
		
		JButton u = new JButton("U");
		u.setActionCommand("U");
		u.addActionListener(this);
		toolBar.add(u , BorderLayout.SOUTH);
		
		
		JButton v = new JButton("V");
		v.setActionCommand("V");
		v.addActionListener(this);
		toolBar.add(v , BorderLayout.SOUTH);
		
		
		JButton w = new JButton("W");
		w.setActionCommand("W");
		w.addActionListener(this);
		toolBar.add(w , BorderLayout.SOUTH);
		
		
		JButton x = new JButton("X");
		x.setActionCommand("X");
		x.addActionListener(this);
		toolBar.add(x , BorderLayout.SOUTH);
		
		
		JButton y = new JButton("Y");
		y.setActionCommand("Y");
		y.addActionListener(this);
		toolBar.add(y , BorderLayout.SOUTH);
		
		
		JButton z = new JButton("Z");
		z.setActionCommand("Z");
		z.addActionListener(this);
		toolBar.add(z , BorderLayout.SOUTH);
		add(toolBar);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		int respuesta = JOptionPane.showConfirmDialog(Main.this, "¿Estás Seguro?", "Cierre de la aplicación", JOptionPane.YES_NO_OPTION);
	if (respuesta == JOptionPane.YES_OPTION)
			System.exit(0);
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
