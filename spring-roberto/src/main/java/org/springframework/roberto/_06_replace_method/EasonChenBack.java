/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: EasonChenBack
 * Author:   HuangTaiHong
 * Date:     2017-12-27 下午 2:59
 * Description: 陈奕迅粤语版
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto._06_replace_method;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br> 
 * 〈陈奕迅粤语版〉
 *
 * @author HuangTaiHong
 * @create 2017-12-27 
 * @since 1.0.0
 */
public class EasonChenBack implements MethodReplacer{
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("明年今日");
		return null;
	}
}