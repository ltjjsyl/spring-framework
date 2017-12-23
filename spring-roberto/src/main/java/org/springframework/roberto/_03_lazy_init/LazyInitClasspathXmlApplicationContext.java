/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: LazyInitClasspathXmlApplicationContext
 * Author:   HuangTaiHong
 * Date:     2017-12-23 下午 4:45
 * Description: 懒加载测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto._03_lazy_init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈懒加载测试〉
 *
 * @author HuangTaiHong
 * @create 2017-12-23
 * @since 1.0.0
 */
public class LazyInitClasspathXmlApplicationContext extends ClassPathXmlApplicationContext {
	public LazyInitClasspathXmlApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}

	@Override
	protected void initBeanDefinitionReader(XmlBeanDefinitionReader reader) {
		super.initBeanDefinitionReader(reader);
		reader.setEventListener(new CustomerEventListener());
	}
}