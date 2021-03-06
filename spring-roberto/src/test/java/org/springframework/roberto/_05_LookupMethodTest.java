/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: _03_LazyInitTest
 * Author:   HuangTaiHong
 * Date:     2017-12-23 下午 4:55
 * Description: LookupMethod测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.roberto._05_lookup_method.VocalConcert;

/**
 * 〈一句话功能简述〉<br> 
 * 〈LookupMethod测试〉
 *
 * @author HuangTaiHong
 * @create 2017-12-23 
 * @since 1.0.0
 */
@SuppressWarnings("all")
public class _05_LookupMethodTest {
	@Test
	public void testLookupMethod() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("05.lookup_method.xml"));
		VocalConcert vocalConcert = (VocalConcert) beanFactory.getBean("vocalConcert");
		vocalConcert.sing();
	}
}