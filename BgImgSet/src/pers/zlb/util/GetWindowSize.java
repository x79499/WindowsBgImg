package pers.zlb.util;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @wsee.
 * @see 小趙
 * 项目名称：BgImgSet  
 * 类 名  称：GetWindowSize    
 * 创 建  人：赵粒博  
 * 创建时间：2018年1月31日 下午3:33:29   <br/>
 * 类 描  述：   <br/>
 * 
 * 
 *   自动获取windows 桌面的 大小
 *
 */
public class GetWindowSize {
	  private static final Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
      public static final int WINDOW_WDTH=(int) screen.getWidth();
      public static final int WINDOW_HEIGHT=(int) screen.getHeight();
}
