package ssm.exc.mapper;

import java.util.List;

import ssm.exc.po.Item;
/*
 *测试mapper的整合
 */
public interface TestMapper {
	
	public List<Item> queryItems(Integer id)throws Exception;
}
