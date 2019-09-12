/*
 * Copyright (C), 2017-2019 bigmoon
 * FileName: Flyweight.java
 * Author:   bigmoon
 * Date:     19-5-6 上午9:32
 * Description: designModels
 */
package org.yhx.design.mode.flyweight;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class Flyweight {

	private String innerStatus;

	/**
	 * @return the innerStatus
	 */
	public String getInnerStatus() {
		return innerStatus ;
	}

	public abstract void operation(String outStatus);
}
