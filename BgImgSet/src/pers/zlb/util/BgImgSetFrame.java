package pers.zlb.util;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import pers.zlb.start_up.GetWindowSize;
import pers.zlb.util.constant.FrameImgConstant;
import pers.zlb.util.redrawUI.MyJmenuItems;

/**
 * @wsee.
 * @see 小趙
 * 项目名称：BgImgSet   
 * 类 名  称：BgImgSetFrame      
 * 创 建  人：赵粒博   
 * 创建时间：2018年1月31日 下午3:25:02   <br/>
 * 类 描  述：   <br/>
 *   
 *   窗口设置
 *        添加图片、删除图片、随机下一张、启动\退出程序、开机启动（y/n）、搜索图片并下载、
 *        窗口可以拖动、随机音效
 *
 */
public class BgImgSetFrame extends JFrame{
	private static final long serialVersionUID = -7647569065726583522L;
	private JPanel jp = new JPanel();
	private JButton but;
	private SetControl setcontrol = new SetControl();
	private SystemTray tray;
	private TrayIcon trayIcon;
	private MyJpopMenu mjm = new MyJpopMenu();
	private MyJmenuItems add ;
	private MyJmenuItems cha;
	private MyJmenuItems ext;
	
	public BgImgSetFrame() {};
	
    //启动程序
	private void StartUp() {
		// 设置标题
		this.setTitle("Java版壁纸设置");
		// 任务栏图标隐藏
		this.setType(JFrame.Type.UTILITY);
		// 去掉窗口默认装饰
		this.setUndecorated(true);
		// 设置窗口始终在最前面
		this.setAlwaysOnTop(true);
		// 设置窗口大小不可更改
		this.setResizable(false);
		// 设置窗口背景透明
		this.setBackground(new Color(0, 0, 0, 0));
		// 窗口初始化位置
		this.setLocation(GetWindowSize.WINDOW_WDTH - 300, GetWindowSize.WINDOW_HEIGHT / 10);
		// 窗口大小
		this.setSize(FrameImgConstant.btu.getIconWidth() * 2, FrameImgConstant.btu.getIconHeight() + 200);
		// 显示控件
		this.setButtonControl();
		// 显示系统托盘图标
		this.tray(this);
		// 显示窗口
		this.setVisible(true);
	}
	
	//控件---button
	private void setButtonControl() {
		// 面板背景颜色完全透明
		jp.setBackground(new Color(0, 0, 0, 0));
		this.setContentPane(jp);
		// 按钮设置
		but = setcontrol.setButtons("q", FrameImgConstant.btu, "点击更换壁纸", 100, 100, true, this,mjm);
		jp.add(but);
		setJPoMenu();
	}
	
	//控件 -- JPopuMenu
	private void setJPoMenu() {
		// 菜单设置
		add = mjm.setJmenu("a","添加图片", FrameImgConstant.add_btu);
		cha = mjm.setJmenu("c","查看图片", FrameImgConstant.all_01);
		ext = mjm.setJmenu("e","退出程序", FrameImgConstant.exit_btu);
		//添加到菜单面板
		mjm.add(add);
		mjm.add(cha);
		mjm.add(ext);
		//添加到面板
		jp.add(mjm);
	}
	
	//通知栏图标显示
	private void tray(JFrame jframe) {
		// 判断系统是否托盘
		if (SystemTray.isSupported()) {
			Toolkit tk = Toolkit.getDefaultToolkit();
			// 添加图标
			trayIcon = new TrayIcon(tk.getImage(FrameImgConstant.ico));
			trayIcon.setToolTip("Java版_桌面背景更换器");
			// 获取系统托盘
			tray = SystemTray.getSystemTray();
			try {
				// 将托盘图表添加到系统托盘
				tray.add(trayIcon);
			} catch (AWTException e1) {
				e1.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new BgImgSetFrame().StartUp();
	}

}
