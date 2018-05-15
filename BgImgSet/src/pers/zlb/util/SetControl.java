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
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet   
 * �� ��  �ƣ�SetControl      
 * �� ��  �ˣ�������   
 * ����ʱ�䣺2018��1��31�� ����4:26:51   <br/>
 * �� ��  ����   <br/>
 *   
 *  �ؼ�����
 *
 */
public class SetControl extends MyButton{
	
	private static final long serialVersionUID = 4616714724669159906L;
	private MyButton button;

	// �ؼ��Ļ�������
	public MyButton setButtons(String butName,Icon buttonIcon, String toolTipTetx, int buttonWidth, int buttonHeight,
			boolean bol,BgImgSetFrame bsf,MyJpopMenu mjm) {
		button = new MyButton(butName,buttonIcon);
		button.setToolTipText(toolTipTetx);
		button.setBounds((100-buttonWidth)/2, (100-buttonHeight)/2, buttonWidth, buttonHeight);
		button.setVisible(bol);
		// �����Ʊ߿�
		button.setBorderPainted(false);
		// �����ƽ���
		button.setFocusPainted(false);
		// ������������
		button.setContentAreaFilled(false);
		// ����ȥ����
		button.setFocusable(false);
		// ������ɫ
		button.setBackground(new Color(0, 0, 0, 0));
		// ���ð�ť�߿���߿�����֮���������
		button.setMargin(new Insets(0, 0, 0, 0));
		//������ɫ͸��,Ϊ�˲���ʾ��ť����butName��͸������,��Ϊ��ť�¼�����Ҫ��ť����
		button.setForeground(new Color(0,0,0,0));
		//ע�ᰴť����¼�
		button.addActionListener(new MyAction_MouseListener(button,bsf,mjm));
		//ע��������,�϶��¼�
		button.addMouseListener(new MyAction_MouseListener(button,bsf,mjm));
		//ע����갴�¡��˳��¼���
		button.addMouseMotionListener(new MyAction_MouseListener(button,bsf,mjm));
		return button;
	}

}
