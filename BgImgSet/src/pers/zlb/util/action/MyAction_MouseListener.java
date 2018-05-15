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
 * @see 小趙
 * 项目名称：BgImgSet   
 * 类 名  称：MyActionListener      
 * 创 建  人：赵粒博   
 * 创建时间：2018年2月4日 下午10:47:25   <br/>
 * 类 描  述：   <br/>
 *   
 *  公共事件类
 *     按钮点击事件
 *     鼠标事件
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

	// button事件注册
	public MyAction_MouseListener(JButton jbt, BgImgSetFrame bsf, MyJpopMenu jpm) {
		this.setJbt(jbt);
		this.bs = bsf;
		this.jpms = jpm;
		this.point = new Point();
	}

	/****************************************ActionListener*************************************************************/

	// (non-Javadoc) 按钮点击事件
	public void actionPerformed(ActionEvent e) {
		String btuName = e.getActionCommand();
		switch (btuName) {
		case "q":// 切换壁纸
			this.getJbt().setIcon(FrameImgConstant.btu_gif);
			break;
		}

	}

	
	/****************************************MouseListener*************************************************************/
	
	public void mouseDragged(MouseEvent e) {
		String btuName = this.getJbt().getText();
		Point p = this.bs.getLocation();
		switch (btuName) {
		case "q":// 切换壁纸
			this.bs.setLocation((int) p.getX() + (e.getX() - point.x), (int) p.getY() + (e.getY() - point.y));
			break;
		}
	}

	// (non-Javadoc) 鼠标进入组件但没有按钮被按下时
	public void mouseMoved(MouseEvent e) {
	}

	
	/************************************MouseMotionListener*********************************************************/

	
	public void mouseClicked(MouseEvent e) {
		String btuName = this.getJbt().getText();
		switch (btuName) {
		case "q":// 切换壁纸
					// 鼠标右键
			if (e.isMetaDown()) {
				jpms.show(jbt, jbt.getX() - 18, jbt.getY() + 60);
			}
			break;
		}

	}

	// (non-Javadoc) 在组件上按下鼠标按钮时
	public void mousePressed(MouseEvent e) {
		String btuName = this.getJbt().getText();
		switch (btuName) {
		case "q":// 切换壁纸
			point.x = e.getX();
			point.y = e.getY();
			break;
		}

	}

	// 在组件上释放鼠标按钮时
	public void mouseReleased(MouseEvent e) {
		String btuName = this.getJbt().getText();
		switch (btuName) {
		case "q":// 切换壁纸
			
			break;
		}

	}

	// 鼠标进入组件时
	public void mouseEntered(MouseEvent e) {
		String btuName = this.getJbt().getText();
		if (btuName.equals("q")) {
			this.getJbt().setIcon(FrameImgConstant.btu_01);
		} 
	}

	// 鼠标退出组件时
	public void mouseExited(MouseEvent e) {
		String btuName = this.getJbt().getText();
		switch (btuName) {
		case "q":// 切换壁纸
			this.getJbt().setIcon(FrameImgConstant.btu);
			break;
		}
	}
}
