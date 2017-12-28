/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: _01_IocSimpleImplTest
 * Author:   HuangTaiHong
 * Date:     2017-12-22 下午 3:38
 * Description: 忽略自动注入测试
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
import org.springframework.roberto._02_ignore_dependency_interface.IgnoreEntity;

/**
 * 〈一句话功能简述〉<br>
 * 〈忽略自动注入测试〉
 *
 * @author HuangTaiHong
 * @create 2017-12-22
 * @since 1.0.0
 */
@SuppressWarnings("deprecation")
public class _02_IgnoreDependencyInterfaceTest {
	@Test
	public void testSimpleLoad2() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("02.ignore_dependency_interface.xml"));
		IgnoreEntity ignoreEntity = (IgnoreEntity) beanFactory.getBean("ignoreEntity");
		BeanFactory ignoreEntityBeanFactory = ignoreEntity.getBeanFactory();
		// 当把IgnoreEntity中 implements BeanFactoryAware 注释掉
		// 并且移除Override标记 测试方法即可运行成功
		TestBean testBean = (TestBean) ignoreEntityBeanFactory.getBean("testBean");
		System.out.println(testBean);
	}
}