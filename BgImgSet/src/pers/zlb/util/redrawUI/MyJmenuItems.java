/**
 * 
 */
package pers.zlb.util.redrawUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JMenuItem;
import javax.swing.JToolTip;
import javax.swing.border.Border;

/**
 * @wsee.
 * @see 小趙
 * 项目名称：BgImgSet   
 * 类 名  称：MyJmenuItems      
 * 创 建  人：赵粒博   
 * 创建时间：2018年2月6日 下午6:47:08   <br/>
 * 类 描  述：   <br/>
 *   
 *   定制菜单列表 样式
 *
 */
public class MyJmenuItems extends JMenuItem{
	private static final long serialVersionUID = 8006786168364173709L;

	private Border border;
	
	public MyJmenuItems() {super();}
	
	public MyJmenuItems(String emenuName,Icon icon) {super(emenuName,icon);}
	
	// 设置背景颜色
		@Override
		public JToolTip createToolTip() {
			// 去掉默认的边框
			border = BorderFactory.createEmptyBorder();
			JToolTip jt = super.createToolTip();
			// 背景颜色
			jt.setBackground(Color.WHITE);
			// 字体设置
			jt.setFont(new Font("宋体", Font.PLAIN, 15));
			// 字体颜色
			jt.setForeground(Color.RED);
			//设置边框样式
			jt.setBorder(border);
			// 更新UI
			jt.updateUI();
			return jt;
		}
}
