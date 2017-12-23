/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: TestBean
 * Author:   HuangTaiHong
 * Date:     2017-12-22 下午 3:30
 * Description: 测试实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto._01_iocsimpleimpl;

/**
 * 〈一句话功能简述〉<br> 
 * 〈容器简单实现测试实体类〉
 *
 * @author HuangTaiHong
 * @create 2017-12-22 
 * @since 1.0.0
 */
public class TestBean {
	private String str = "testStr";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}