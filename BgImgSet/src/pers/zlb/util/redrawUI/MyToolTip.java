/**
 * 
 */
package pers.zlb.util.redrawUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;

import javax.swing.JButton;
import javax.swing.JToolTip;

/**
 * @wsee.
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet   
 * �� ��  �ƣ�MyToolTip      
 * �� ��  �ˣ�������   
 * ����ʱ�䣺2018��2��1�� ����12:00:18   <br/>
 * �� ��  ����   <br/>
 *   
 *  ��д ToolTip   ����
 *
 */
@Deprecated
public class MyToolTip extends JToolTip{
	private static final long serialVersionUID = -7703556871871169184L;
	private JButton btu;
	@Deprecated
	public MyToolTip() {
		super();
	}
	@Deprecated
	 public Dimension getPreferredSize() {  
         return new Dimension(120,130);  
    } 
	 
	@Deprecated
	@Override
	protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //������ɫģ��
        Paint paint = g2d.getPaint(); 
        g2d.setPaint(Color.WHITE);
        g2d.fillRect(0, 0, (int)getPreferredSize().getWidth(), (int)getPreferredSize().getHeight());
        g2d.setPaint(paint);
		if(this.getTipText()!=null) {
			g2d.drawString(this.getTipText(), 20, 30);
		}else {
			System.out.println("�յģ�");
		}
	}
	@Deprecated
	 public void paintChildren(Graphics g) {  
         btu.repaint();  
    }  
	@Deprecated
    public JButton getButton() {  
         return btu;  
    }  
}
