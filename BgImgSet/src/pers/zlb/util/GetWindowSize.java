package pers.zlb.util;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @wsee.
 * @see С�w
 * ��Ŀ���ƣ�BgImgSet  
 * �� ��  �ƣ�GetWindowSize    
 * �� ��  �ˣ�������  
 * ����ʱ�䣺2018��1��31�� ����3:33:29   <br/>
 * �� ��  ����   <br/>
 * 
 * 
 *   �Զ���ȡwindows ����� ��С
 *
 */
public class GetWindowSize {
	  private static final Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
      public static final int WINDOW_WDTH=(int) screen.getWidth();
      public static final int WINDOW_HEIGHT=(int) screen.getHeight();
}
