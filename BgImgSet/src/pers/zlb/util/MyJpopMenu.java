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
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet   
 * �� ��  �ƣ�MyJpopMenu      
 * �� ��  �ˣ�������   
 * ����ʱ�䣺2018��2��6�� ����2:17:54   <br/>
 * �� ��  ����   <br/>
 *   
 *
 */
public class MyJpopMenu extends JPopupMenu {

	private static final long serialVersionUID = -1299014419421482997L;
	private MyJmenuItems jMenu;

	public MyJpopMenu() {
		super();
		// ����͸��
		this.setBackground(new Color(0, 0, 0, 200));
		// �����Ʊ߿�
		this.setBorderPainted(false);
		// ���ô�С
		this.setSize(200, 200);
	}

	//���ò˵�ѡ������
		public  MyJmenuItems setJmenu(String emenuName,String tooTipText,Icon icon) {
			jMenu  = new MyJmenuItems(emenuName,icon);
			//����������ɫ
			jMenu.setForeground(new Color(0,0,0,0));
			//����͸��
			jMenu.setBackground(new Color(0, 0, 0,0));
			//�����Ʊ߿�
			jMenu.setBorderPainted(false);
			//������������
			jMenu.setContentAreaFilled(false);
			// ���ð�ť�߿���߿�����֮���������
			jMenu.setMargin(new Insets(0, 0, 0, 0));
			//��ʾ��Ϣ
			jMenu.setToolTipText(tooTipText);
			//�����Զ���UI
			jMenu.setUI(new MyEmenuUI(jMenu));
			//ע���¼�
			jMenu.addMouseListener(new MyEmenuItemAction(jMenu));
			return jMenu;
		}
	  
}
