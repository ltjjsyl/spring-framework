/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: _03_LazyInitTest
 * Author:   HuangTaiHong
 * Date:     2017-12-23 下午 4:55
 * Description: 懒加载测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.roberto._03_lazy_init.LazyInitClasspathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈懒加载测试〉
 *
 * @author HuangTaiHong
 * @create 2017-12-23 
 * @since 1.0.0
 */
public class _03_LazyInitTest {
	@Test
	public void testLayzyInit() {
		long currentTime = System.currentTimeMillis();
		new ClassPathXmlApplicationContext("03.lazy_init.xml");
		System.out.println("No LazyInit Cost Time:" + (System.currentTimeMillis() - currentTime));

		currentTime = System.currentTimeMillis();
		new LazyInitClasspathXmlApplicationContext("03.lazy_init.xml");
		System.out.println("LazyInit Cost Time:" + (System.currentTimeMillis() - currentTime));
	}
}