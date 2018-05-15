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
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet   
 * �� ��  �ƣ�MyJmenuItems      
 * �� ��  �ˣ�������   
 * ����ʱ�䣺2018��2��6�� ����6:47:08   <br/>
 * �� ��  ����   <br/>
 *   
 *   ���Ʋ˵��б� ��ʽ
 *
 */
public class MyJmenuItems extends JMenuItem{
	private static final long serialVersionUID = 8006786168364173709L;

	private Border border;
	
	public MyJmenuItems() {super();}
	
	public MyJmenuItems(String emenuName,Icon icon) {super(emenuName,icon);}
	
	// ���ñ�����ɫ
		@Override
		public JToolTip createToolTip() {
			// ȥ��Ĭ�ϵı߿�
			border = BorderFactory.createEmptyBorder();
			JToolTip jt = super.createToolTip();
			// ������ɫ
			jt.setBackground(Color.WHITE);
			// ��������
			jt.setFont(new Font("����", Font.PLAIN, 15));
			// ������ɫ
			jt.setForeground(Color.RED);
			//���ñ߿���ʽ
			jt.setBorder(border);
			// ����UI
			jt.updateUI();
			return jt;
		}
}
