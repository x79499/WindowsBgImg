/**
 * 
 */
package pers.zlb.util;


import java.awt.Color;
import java.awt.Insets;

import javax.swing.Icon;

import pers.zlb.util.action.MyAction_MouseListener;
import pers.zlb.util.redrawUI.MyButton;

/**
 * @wsee.
 * @see 小趙
 * 项目名称：BgImgSet   
 * 类 名  称：SetControl      
 * 创 建  人：赵粒博   
 * 创建时间：2018年1月31日 下午4:26:51   <br/>
 * 类 描  述：   <br/>
 *   
 *  控件设置
 *
 */
public class SetControl extends MyButton{
	
	private static final long serialVersionUID = 4616714724669159906L;
	private MyButton button;

	// 控件的基本设置
	public MyButton setButtons(String butName,Icon buttonIcon, String toolTipTetx, int buttonWidth, int buttonHeight,
			boolean bol,BgImgSetFrame bsf,MyJpopMenu mjm) {
		button = new MyButton(butName,buttonIcon);
		button.setToolTipText(toolTipTetx);
		button.setBounds((100-buttonWidth)/2, (100-buttonHeight)/2, buttonWidth, buttonHeight);
		button.setVisible(bol);
		// 不绘制边框
		button.setBorderPainted(false);
		// 不绘制焦点
		button.setFocusPainted(false);
		// 不绘制内容区
		button.setContentAreaFilled(false);
		// 设置去焦点
		button.setFocusable(false);
		// 背景颜色
		button.setBackground(new Color(0, 0, 0, 0));
		// 设置按钮边框与边框内容之间的像素数
		button.setMargin(new Insets(0, 0, 0, 0));
		//字体颜色透明,为了不显示按钮文字butName，透明隐藏,因为按钮事件必须要按钮名称
		button.setForeground(new Color(0,0,0,0));
		//注册按钮点击事件
		button.addActionListener(new MyAction_MouseListener(button,bsf,mjm));
		//注册鼠标进入,拖动事件
		button.addMouseListener(new MyAction_MouseListener(button,bsf,mjm));
		//注册鼠标按下、退出事件】
		button.addMouseMotionListener(new MyAction_MouseListener(button,bsf,mjm));
		return button;
	}

}
