package com.artisan.o2o.service;

import java.io.IOException;
import java.util.List;

import com.artisan.o2o.entity.Area;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface AreaService {

	// redis key的前缀，抽取到接口层，方便使用
	public static final String AREALISTKEY = "arealist";

	/**
	 * 
	 * 
	 * @Title: getAreaList
	 * 
	 * @Description: 获取区域列表
	 * 
	 * @return
	 * 
	 * @return: List<Area>
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	List<Area> getAreaList() throws JsonParseException, JsonMappingException, IOException;
}
