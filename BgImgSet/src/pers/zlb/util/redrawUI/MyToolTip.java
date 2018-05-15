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
 * @see 小趙
 * 项目名称：BgImgSet   
 * 类 名  称：MyToolTip      
 * 创 建  人：赵粒博   
 * 创建时间：2018年2月1日 上午12:00:18   <br/>
 * 类 描  述：   <br/>
 *   
 *  重写 ToolTip   废弃
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
        //生成颜色模板
        Paint paint = g2d.getPaint(); 
        g2d.setPaint(Color.WHITE);
        g2d.fillRect(0, 0, (int)getPreferredSize().getWidth(), (int)getPreferredSize().getHeight());
        g2d.setPaint(paint);
		if(this.getTipText()!=null) {
			g2d.drawString(this.getTipText(), 20, 30);
		}else {
			System.out.println("空的！");
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
