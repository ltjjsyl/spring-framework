/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: _01_IocSimpleImplTest
 * Author:   HuangTaiHong
 * Date:     2017-12-22 下午 3:38
 * Description: 容器简单实现测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.roberto._01_iocsimpleimpl.TestBean;

/**
 * 〈一句话功能简述〉<br> 
 * 〈容器简单实现测试类〉
 *
 * @author HuangTaiHong
 * @create 2017-12-22 
 * @since 1.0.0
 */
@SuppressWarnings("deprecation")
public class _01_IocSimpleImplTest {
	@Test
	public void testSimpleLoad() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("01.ioc_simple_impl.xml"));
		TestBean testBean = (TestBean) beanFactory.getBean("testBean");
		System.out.println(testBean.getStr());
	}
}