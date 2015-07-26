/**
 * Copyright (c)2013-2014 by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.staff.service;

import java.util.List;

import com.hhf.staff.model.TResource;
import com.hhf.staff.model.extend.TResourceExtend;

/**
 * 资源服务接口
 * 
 * @author xuzunyuan
 * @date 2013年12月25日
 */
public interface ResourceService {
	/**
	 * 获取所有有效URL
	 * 
	 * @return
	 */
	public List<TResource> getAllUrl();

	/**
	 * 获取所有Folder
	 * 
	 * @return
	 */
	public List<TResource> getAllFolder();

	/**
	 * 获取所有资源
	 * 
	 * @return
	 */
	public List<TResource> getAllResource();

	/**
	 * 分级资源：一级为目录，二级为权限
	 * 
	 * @return
	 */
	public List<TResourceExtend> getAllHierarchicResources();
}
