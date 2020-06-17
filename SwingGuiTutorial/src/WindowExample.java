import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;

public class WindowExample {
	public static void main(String[] args) {
		// we can use to create splash file
		JWindow window = new JWindow();// container
		window.setSize(600, 600);
		window.setLocationRelativeTo(null);
		// add a button component to a container
		// JButton b1=new JButton("Hello");//component
		// default position is center
		// window.add(b1);

		// to specify in north position
		// window.add(b1, BorderLayout.NORTH);

		// to specify in south position
		// window.add(b1, BorderLayout.SOUTH);

		// to specify in east position
		// window.add(b1, BorderLayout.EAST);

		// to specify in west position
		// window.add(b1, BorderLayout.WEST);

		// if you want to customize the position manually
		// window.setLayout(null);//there is no layout
		// b1.setBounds(100, 30, 100, 30);
		// window.add(b1);//to add a button component to window container
		ImageIcon ic = new ImageIcon("C:\\Users\\DEEP\\Desktop\\hd.jpg");
		ImageIcon resizeImage = resize(ic, 600, 600);
		JLabel jimage = new JLabel(resizeImage);

		window.add(jimage);
		
		
		JProgressBar pb=new JProgressBar();
		pb.setStringPainted(true);
		window.add(pb, BorderLayout.SOUTH);

		window.setVisible(true);
		
		for(int i=0;i<=100;i++) {
			pb.setValue(i);
		
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
		
		if(pb.getValue()==100) {
			window.dispose();
		}

	}

	private static ImageIcon resize(ImageIcon im, int w, int h) {
		BufferedImage bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
		Graphics2D gd = (Graphics2D) bi.createGraphics();
		gd.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
		gd.drawImage(im.getImage(), 0, 0, w, h, null);
		gd.dispose();
		return new ImageIcon(bi);
	}
}
