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
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet   
 * �� ��  �ƣ�BgImgSetFrame      
 * �� ��  �ˣ�������   
 * ����ʱ�䣺2018��1��31�� ����3:25:02   <br/>
 * �� ��  ����   <br/>
 *   
 *   ��������
 *        ���ͼƬ��ɾ��ͼƬ�������һ�š�����\�˳����򡢿���������y/n��������ͼƬ�����ء�
 *        ���ڿ����϶��������Ч
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
	
    //��������
	private void StartUp() {
		// ���ñ���
		this.setTitle("Java���ֽ����");
		// ������ͼ������
		this.setType(JFrame.Type.UTILITY);
		// ȥ������Ĭ��װ��
		this.setUndecorated(true);
		// ���ô���ʼ������ǰ��
		this.setAlwaysOnTop(true);
		// ���ô��ڴ�С���ɸ���
		this.setResizable(false);
		// ���ô��ڱ���͸��
		this.setBackground(new Color(0, 0, 0, 0));
		// ���ڳ�ʼ��λ��
		this.setLocation(GetWindowSize.WINDOW_WDTH - 300, GetWindowSize.WINDOW_HEIGHT / 10);
		// ���ڴ�С
		this.setSize(FrameImgConstant.btu.getIconWidth() * 2, FrameImgConstant.btu.getIconHeight() + 200);
		// ��ʾ�ؼ�
		this.setButtonControl();
		// ��ʾϵͳ����ͼ��
		this.tray(this);
		// ��ʾ����
		this.setVisible(true);
	}
	
	//�ؼ�---button
	private void setButtonControl() {
		// ��屳����ɫ��ȫ͸��
		jp.setBackground(new Color(0, 0, 0, 0));
		this.setContentPane(jp);
		// ��ť����
		but = setcontrol.setButtons("q", FrameImgConstant.btu, "���������ֽ", 100, 100, true, this,mjm);
		jp.add(but);
		setJPoMenu();
	}
	
	//�ؼ� -- JPopuMenu
	private void setJPoMenu() {
		// �˵�����
		add = mjm.setJmenu("a","���ͼƬ", FrameImgConstant.add_btu);
		cha = mjm.setJmenu("c","�鿴ͼƬ", FrameImgConstant.all_01);
		ext = mjm.setJmenu("e","�˳�����", FrameImgConstant.exit_btu);
		//��ӵ��˵����
		mjm.add(add);
		mjm.add(cha);
		mjm.add(ext);
		//��ӵ����
		jp.add(mjm);
	}
	
	//֪ͨ��ͼ����ʾ
	private void tray(JFrame jframe) {
		// �ж�ϵͳ�Ƿ�����
		if (SystemTray.isSupported()) {
			Toolkit tk = Toolkit.getDefaultToolkit();
			// ���ͼ��
			trayIcon = new TrayIcon(tk.getImage(FrameImgConstant.ico));
			trayIcon.setToolTip("Java��_���汳��������");
			// ��ȡϵͳ����
			tray = SystemTray.getSystemTray();
			try {
				// ������ͼ����ӵ�ϵͳ����
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
