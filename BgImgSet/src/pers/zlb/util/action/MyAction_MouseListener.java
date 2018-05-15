package pers.zlb.util.action;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;

import pers.zlb.util.BgImgSetFrame;
import pers.zlb.util.MyJpopMenu;
import pers.zlb.util.constant.FrameImgConstant;

/**
 * @wsee.
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet   
 * �� ��  �ƣ�MyActionListener      
 * �� ��  �ˣ�������   
 * ����ʱ�䣺2018��2��4�� ����10:47:25   <br/>
 * �� ��  ����   <br/>
 *   
 *  �����¼���
 *     ��ť����¼�
 *     ����¼�
 *
 */
public class MyAction_MouseListener extends BgImgSetFrame
		implements ActionListener,MouseListener,MouseMotionListener {
	private static final long serialVersionUID = 1752750462538788451L;
	private BgImgSetFrame bs;
	private Point point;
	private MyJpopMenu jpms;

	private JButton jbt;

	public JButton getJbt() {
		return jbt;
	}

	public void setJbt(JButton jbt) {
		this.jbt = jbt;
	}

	// button�¼�ע��
	public MyAction_MouseListener(JButton jbt, BgImgSetFrame bsf, MyJpopMenu jpm) {
		this.setJbt(jbt);
		this.bs = bsf;
		this.jpms = jpm;
		this.point = new Point();
	}

	/****************************************ActionListener*************************************************************/

	// (non-Javadoc) ��ť����¼�
	public void actionPerformed(ActionEvent e) {
		String btuName = e.getActionCommand();
		switch (btuName) {
		case "q":// �л���ֽ
			this.getJbt().setIcon(FrameImgConstant.btu_gif);
			break;
		}

	}

	
	/****************************************MouseListener*************************************************************/
	
	public void mouseDragged(MouseEvent e) {
		String btuName = this.getJbt().getText();
		Point p = this.bs.getLocation();
		switch (btuName) {
		case "q":// �л���ֽ
			this.bs.setLocation((int) p.getX() + (e.getX() - point.x), (int) p.getY() + (e.getY() - point.y));
			break;
		}
	}

	// (non-Javadoc) �����������û�а�ť������ʱ
	public void mouseMoved(MouseEvent e) {
	}

	
	/************************************MouseMotionListener*********************************************************/

	
	public void mouseClicked(MouseEvent e) {
		String btuName = this.getJbt().getText();
		switch (btuName) {
		case "q":// �л���ֽ
					// ����Ҽ�
			if (e.isMetaDown()) {
				jpms.show(jbt, jbt.getX() - 18, jbt.getY() + 60);
			}
			break;
		}

	}

	// (non-Javadoc) ������ϰ�����갴ťʱ
	public void mousePressed(MouseEvent e) {
		String btuName = this.getJbt().getText();
		switch (btuName) {
		case "q":// �л���ֽ
			point.x = e.getX();
			point.y = e.getY();
			break;
		}

	}

	// ��������ͷ���갴ťʱ
	public void mouseReleased(MouseEvent e) {
		String btuName = this.getJbt().getText();
		switch (btuName) {
		case "q":// �л���ֽ
			
			break;
		}

	}

	// ���������ʱ
	public void mouseEntered(MouseEvent e) {
		String btuName = this.getJbt().getText();
		if (btuName.equals("q")) {
			this.getJbt().setIcon(FrameImgConstant.btu_01);
		} 
	}

	// ����˳����ʱ
	public void mouseExited(MouseEvent e) {
		String btuName = this.getJbt().getText();
		switch (btuName) {
		case "q":// �л���ֽ
			this.getJbt().setIcon(FrameImgConstant.btu);
			break;
		}
	}
}
