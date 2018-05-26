package ssm.exc.service;

import java.util.List;

import ssm.exc.po.Item;
/*
 * 测试service的整合
 */
public interface TestService {
	
	public List<Item> findItems(Integer id)throws Exception;
}
