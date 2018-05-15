/**
 * 
 */
package pers.zlb.util.redrawUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.basic.BasicMenuItemUI;

import pers.zlb.util.constant.FrameImgConstant;


/**
 * @wsee.
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet   
 * �� ��  �ƣ�MyEmenuUI      
 * �� ��  �ˣ�������   
 * ����ʱ�䣺2018��2��6�� ����10:25:53   <br/>
 * �� ��  ����   <br/>
 *   
 *
 */
public class MyEmenuUI extends BasicMenuItemUI {

	private MyJmenuItems mji;
	protected boolean mouseOver;

	// ��ʼ��Ĭ������
	public MyEmenuUI() {
		super();
		// ѡ�еı�����ɫ
		super.selectionBackground = new Color(0, 0, 0, 0);
	}

	public MyEmenuUI(MyJmenuItems mji) {
		this.setMji(mji);
	}
	public MyJmenuItems getMji() {
		return mji;
	}
	public void setMji(MyJmenuItems mji) {
		this.mji = mji;
	}

	//��װָ����������
		@Override  
	    protected void installComponents(JMenuItem menuItem) {  
	        super.installComponents(menuItem);  
	        this.defaultTextIconGap = 0;//����ͼ�����ּ��Ϊ5������  
	        //������ѡ��ı߿�
	        menuItem.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));  
	        menuItem.setBackground(new Color(0,0,0,0));
	        //���¼���˵���ĳߴ�  
	        Dimension menuSize = menuItem.getPreferredSize();  
	        menuSize.width = 45 ;  
	        menuSize.height=50;
	        //��������Ĵ�С
	        menuItem.setPreferredSize(menuSize);  
	    }
	
	// ���ͣ��
	protected MouseInputListener createMouseInputListener(JComponent c) {
		MouseInputListener mil = new MouseInputHandler() {
			// ������
			public void mouseEntered(MouseEvent e) {
				super.mouseEntered(e);
				mouseOver = true;
			}

			// ����˳�
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
				mouseOver = false;
			}

			// ��������
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				mouseOver = true;
			}

			// �ͷ�����
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				mouseOver = true;
			}
		};
		return mil;
	}

	// ��д�˵�����
	protected void paintBackground(Graphics g, JMenuItem menuItem, Color bgColor) {
		super.paintBackground(g, menuItem, bgColor);
		// ������ɫ͸��
		bgColor = new Color(0, 0, 0, 0);
		// ���ʵ���ɫ
		g.setColor(bgColor);
		// ���ʵĳߴ�
		g.fillRect(0, 0, menuItem.getWidth(), menuItem.getHeight());
		g.drawImage(FrameImgConstant.bg_01, 0, 0, null);
		// ���´��뽫�����ͣ��ʱ����
		if (mouseOver) {
			g.setColor(new Color(0, 0, 0, 0));
			g.fillRect(0, 0, menuItem.getWidth() - 8, menuItem.getHeight() - 10);
			g.drawImage(FrameImgConstant.bg_01, 0, 0, null);
			g.setColor(new Color(0, 0, 0, 0));
			g.drawRect(0, 0, menuItem.getWidth() - 8, menuItem.getHeight() - 10);
			g.drawImage(FrameImgConstant.bg_01, 0, 0, null);
		}
	}
	
	// ��д���ֵ�ǰ�˵�����ı�
	protected void paintText(Graphics g, JMenuItem menuItem, Rectangle textRect, String text) {
		g.setColor(new Color(0, 0, 0, 0));
		g.drawString(text, 0, 0);
	}
	
}
