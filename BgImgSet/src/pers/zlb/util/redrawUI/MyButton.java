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
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet   
 * �� ��  �ƣ�MyJtoolTipText      
 * �� ��  �ˣ�������   
 * ����ʱ�䣺2018��2��1�� ����3:09:21   <br/>
 * �� ��  ����   <br/>
 *   
 *   ��ť�ؼ��� Ԥ����
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
	
	// ���ñ�����ɫ
	@Override
	public JToolTip createToolTip() {
		//ȥ��Ĭ�ϵı߿�
		border = BorderFactory.createEmptyBorder();
		JToolTip jt = super.createToolTip();
		// ������ɫ
		jt.setBackground(Color.WHITE);
		// ��������
		jt.setFont(new Font("����", Font.PLAIN, 15));
		// ������ɫ
		jt.setForeground(Color.RED);
		jt.setBorder(border);
		// ����UI
		jt.updateUI();
		return jt;
	}

}
