/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: TestLazyInitBean
 * Author:   HuangTaiHong
 * Date:     2017-12-23 下午 4:52
 * Description: 测试懒加载实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto._03_lazy_init;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试懒加载实体类〉
 *
 * @author HuangTaiHong
 * @create 2017-12-23
 * @since 1.0.0
 */
public class TestLazyInitBean {
	public void init() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("TestBean Init");
	}
}