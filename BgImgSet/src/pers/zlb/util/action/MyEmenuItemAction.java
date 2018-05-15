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
 * @see 小趙
 * 项目名称：BgImgSet   
 * 类 名  称：MyEmenuItemAction      
 * 创 建  人：赵粒博   
 * 创建时间：2018年2月6日 下午9:48:48   <br/>
 * 类 描  述：   <br/>
 *   
 *    弹出菜单  鼠标事件
 *
 */
public class MyEmenuItemAction implements MouseListener{
	private MyJmenuItems mji;
	
	//注册事件
	public MyEmenuItemAction(MyJmenuItems mj) {
		this.mji=mj;
	}
	
	/* (non-Javadoc)
	 *   鼠标按下并释放
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * 在组件上按下鼠标按钮时
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * 在组件上释放鼠标按钮时
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 *  鼠标进入组件时
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
	 * 鼠标退出组件时
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
