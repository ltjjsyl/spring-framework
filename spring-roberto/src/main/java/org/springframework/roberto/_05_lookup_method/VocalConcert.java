/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: VocalConcert
 * Author:   HuangTaiHong
 * Date:     2017-12-27 下午 12:09
 * Description: 演唱会
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto._05_lookup_method;

/**
 * 〈一句话功能简述〉<br> 
 * 〈演唱会〉
 *
 * @author HuangTaiHong
 * @create 2017-12-27 
 * @since 1.0.0
 */
public abstract class VocalConcert {
	public void sing(){
		this.getSinger().sing();
	}

	public abstract Singer getSinger();
}