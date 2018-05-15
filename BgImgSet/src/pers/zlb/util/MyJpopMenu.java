/**
 * 
 */
package pers.zlb.util;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JPopupMenu;

import pers.zlb.util.action.MyEmenuItemAction;
import pers.zlb.util.redrawUI.MyEmenuUI;
import pers.zlb.util.redrawUI.MyJmenuItems;

/**
 * @wsee.
 * @see 小趙
 * 项目名称：BgImgSet   
 * 类 名  称：MyJpopMenu      
 * 创 建  人：赵粒博   
 * 创建时间：2018年2月6日 上午2:17:54   <br/>
 * 类 描  述：   <br/>
 *   
 *
 */
public class MyJpopMenu extends JPopupMenu {

	private static final long serialVersionUID = -1299014419421482997L;
	private MyJmenuItems jMenu;

	public MyJpopMenu() {
		super();
		// 背景透明
		this.setBackground(new Color(0, 0, 0, 200));
		// 不绘制边框
		this.setBorderPainted(false);
		// 设置大小
		this.setSize(200, 200);
	}

	//设置菜单选项内容
		public  MyJmenuItems setJmenu(String emenuName,String tooTipText,Icon icon) {
			jMenu  = new MyJmenuItems(emenuName,icon);
			//设置文字颜色
			jMenu.setForeground(new Color(0,0,0,0));
			//背景透明
			jMenu.setBackground(new Color(0, 0, 0,0));
			//不绘制边框
			jMenu.setBorderPainted(false);
			//不绘制内容区
			jMenu.setContentAreaFilled(false);
			// 设置按钮边框与边框内容之间的像素数
			jMenu.setMargin(new Insets(0, 0, 0, 0));
			//提示信息
			jMenu.setToolTipText(tooTipText);
			//设置自定义UI
			jMenu.setUI(new MyEmenuUI(jMenu));
			//注册事件
			jMenu.addMouseListener(new MyEmenuItemAction(jMenu));
			return jMenu;
		}
	  
}
