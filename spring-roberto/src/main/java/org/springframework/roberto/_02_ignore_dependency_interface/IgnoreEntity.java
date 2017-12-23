/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: IgnoreEntity
 * Author:   HuangTaiHong
 * Date:     2017-12-22 下午 5:24
 * Description:忽略自动注入实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto._02_ignore_dependency_interface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈忽略自动注入实体类〉
 *
 * @author HuangTaiHong
 * @create 2017-12-22
 * @since 1.0.0
 */
public class IgnoreEntity /*implements BeanFactoryAware*/ {
	private BeanFactory beanFactory;

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	// @Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
}