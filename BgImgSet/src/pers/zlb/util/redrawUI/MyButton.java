/**
 * 
 */
package pers.zlb.util.redrawUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JToolTip;
import javax.swing.border.Border;

/**
 * @wsee.
 * @see 小趙
 * 项目名称：BgImgSet   
 * 类 名  称：MyJtoolTipText      
 * 创 建  人：赵粒博   
 * 创建时间：2018年2月1日 下午3:09:21   <br/>
 * 类 描  述：   <br/>
 *   
 *   按钮控件的 预处理
 *
 */
public class MyButton extends JButton {
	private static final long serialVersionUID = -5203120194857067936L;

	private Border border;
	private MyButton myBtu;
	
	public MyButton() {
		super();
	}
	
	public MyButton(MyButton myBtu) {
		this.setMyBtu(myBtu);
	}
	
	public MyButton(String butName,Icon icon) {
		super(butName,icon);
	}
	
	public MyButton getMyBtu() {
		return myBtu;
	}

	public void setMyBtu(MyButton myBtu) {
		this.myBtu = myBtu;
	}
	
	// 设置背景颜色
	@Override
	public JToolTip createToolTip() {
		//去掉默认的边框
		border = BorderFactory.createEmptyBorder();
		JToolTip jt = super.createToolTip();
		// 背景颜色
		jt.setBackground(Color.WHITE);
		// 字体设置
		jt.setFont(new Font("宋体", Font.PLAIN, 15));
		// 字体颜色
		jt.setForeground(Color.RED);
		jt.setBorder(border);
		// 更新UI
		jt.updateUI();
		return jt;
	}

}
