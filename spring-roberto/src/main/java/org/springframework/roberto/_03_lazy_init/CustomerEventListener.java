/**
 * Copyright (C), 2015-2017, ND Co., Ltd.
 * FileName: CustomerEventListener
 * Author:   HuangTaiHong
 * Date:     2017-12-23 下午 4:48
 * Description: 自定义事件监听器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.springframework.roberto._03_lazy_init;

import org.springframework.beans.factory.parsing.*;
import org.springframework.beans.factory.xml.DocumentDefaultsDefinition;

/**
 * 〈一句话功能简述〉<br>
 * 〈自定义事件监听器〉
 *
 * @author HuangTaiHong
 * @create 2017-12-23
 * @since 1.0.0
 */
public class CustomerEventListener implements ReaderEventListener {
	@Override
	public void defaultsRegistered(DefaultsDefinition defaultsDefinition) {
		if (defaultsDefinition instanceof DocumentDefaultsDefinition) {
			DocumentDefaultsDefinition defaults = (DocumentDefaultsDefinition) defaultsDefinition;
			defaults.setLazyInit("true");
		}
	}

	@Override
	public void componentRegistered(ComponentDefinition componentDefinition) {

	}

	@Override
	public void aliasRegistered(AliasDefinition aliasDefinition) {

	}

	@Override
	public void importProcessed(ImportDefinition importDefinition) {

	}
}