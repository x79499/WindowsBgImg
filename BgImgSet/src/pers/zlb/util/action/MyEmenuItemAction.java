/**
 * 
 */
package pers.zlb.util.action;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import pers.zlb.util.constant.FrameImgConstant;
import pers.zlb.util.redrawUI.MyJmenuItems;

/**
 * @wsee.
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet   
 * �� ��  �ƣ�MyEmenuItemAction      
 * �� ��  �ˣ�������   
 * ����ʱ�䣺2018��2��6�� ����9:48:48   <br/>
 * �� ��  ����   <br/>
 *   
 *    �����˵�  ����¼�
 *
 */
public class MyEmenuItemAction implements MouseListener{
	private MyJmenuItems mji;
	
	//ע���¼�
	public MyEmenuItemAction(MyJmenuItems mj) {
		this.mji=mj;
	}
	
	/* (non-Javadoc)
	 *   ��갴�²��ͷ�
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * ������ϰ�����갴ťʱ
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * ��������ͷ���갴ťʱ
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 *  ���������ʱ
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		String emenuName = this.mji.getText();
		switch (emenuName) {
		case "a":
			this.mji.setIcon(FrameImgConstant.cler);
			 this.mji.setIcon(FrameImgConstant.add_btu_01);
			break;
		case "c":
			this.mji.setIcon(FrameImgConstant.cler);
			this.mji.setIcon(FrameImgConstant.all_02);
			break;
		case "e":
			this.mji.setIcon(FrameImgConstant.cler);
			this.mji.setIcon(FrameImgConstant.exit_btu_01);
			break;
		}
	}

	/* (non-Javadoc)
	 * ����˳����ʱ
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		String emenuName = this.mji.getText();
		switch (emenuName) {
		case "a":
			this.mji.setIcon(FrameImgConstant.cler);
			 this.mji.setIcon(FrameImgConstant.add_btu);
			break;
		case "c":
			this.mji.setIcon(FrameImgConstant.cler);
			this.mji.setIcon(FrameImgConstant.all_01);
			break;
		case "e":
			this.mji.setIcon(FrameImgConstant.cler);
			this.mji.setIcon(FrameImgConstant.exit_btu);
			break;
		}
	}

}
