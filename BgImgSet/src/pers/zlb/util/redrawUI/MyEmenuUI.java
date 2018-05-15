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
 * @see 小趙
 * 项目名称：BgImgSet   
 * 类 名  称：MyEmenuUI      
 * 创 建  人：赵粒博   
 * 创建时间：2018年2月6日 下午10:25:53   <br/>
 * 类 描  述：   <br/>
 *   
 *
 */
public class MyEmenuUI extends BasicMenuItemUI {

	private MyJmenuItems mji;
	protected boolean mouseOver;

	// 初始化默认设置
	public MyEmenuUI() {
		super();
		// 选中的背景颜色
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

	//安装指定的组件规格
		@Override  
	    protected void installComponents(JMenuItem menuItem) {  
	        super.installComponents(menuItem);  
	        this.defaultTextIconGap = 0;//设置图标文字间距为5个像素  
	        //不绘制选项的边框
	        menuItem.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));  
	        menuItem.setBackground(new Color(0,0,0,0));
	        //重新计算菜单项的尺寸  
	        Dimension menuSize = menuItem.getPreferredSize();  
	        menuSize.width = 45 ;  
	        menuSize.height=50;
	        //设置组件的大小
	        menuItem.setPreferredSize(menuSize);  
	    }
	
	// 鼠标停留
	protected MouseInputListener createMouseInputListener(JComponent c) {
		MouseInputListener mil = new MouseInputHandler() {
			// 鼠标进入
			public void mouseEntered(MouseEvent e) {
				super.mouseEntered(e);
				mouseOver = true;
			}

			// 鼠标退出
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
				mouseOver = false;
			}

			// 按下鼠标键
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				mouseOver = true;
			}

			// 释放鼠标键
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				mouseOver = true;
			}
		};
		return mil;
	}

	// 重写菜单背景
	protected void paintBackground(Graphics g, JMenuItem menuItem, Color bgColor) {
		super.paintBackground(g, menuItem, bgColor);
		// 背景颜色透明
		bgColor = new Color(0, 0, 0, 0);
		// 画笔的颜色
		g.setColor(bgColor);
		// 画笔的尺寸
		g.fillRect(0, 0, menuItem.getWidth(), menuItem.getHeight());
		g.drawImage(FrameImgConstant.bg_01, 0, 0, null);
		// 以下代码将在鼠标停留时绘制
		if (mouseOver) {
			g.setColor(new Color(0, 0, 0, 0));
			g.fillRect(0, 0, menuItem.getWidth() - 8, menuItem.getHeight() - 10);
			g.drawImage(FrameImgConstant.bg_01, 0, 0, null);
			g.setColor(new Color(0, 0, 0, 0));
			g.drawRect(0, 0, menuItem.getWidth() - 8, menuItem.getHeight() - 10);
			g.drawImage(FrameImgConstant.bg_01, 0, 0, null);
		}
	}
	
	// 重写呈现当前菜单项的文本
	protected void paintText(Graphics g, JMenuItem menuItem, Rectangle textRect, String text) {
		g.setColor(new Color(0, 0, 0, 0));
		g.drawString(text, 0, 0);
	}
	
}
