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
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.roberto._04_profile.TestProfileBean;

/**
 * 〈一句话功能简述〉<br> 
 * 〈懒加载测试〉
 *
 * @author HuangTaiHong
 * @create 2017-12-23 
 * @since 1.0.0
 */
@SuppressWarnings("all")
public class _04_ProfileTest {
	@Test
	public void testProfile() {
		System.setProperty("spring.profiles.active","dev");
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("04.profile.xml"));
		TestProfileBean testProfileBeant = (TestProfileBean) beanFactory.getBean("testProfileBean");
		System.out.println(testProfileBeant);
	}
}