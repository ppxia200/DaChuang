package ssm.exc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ssm.exc.mapper.TestMapper;
import ssm.exc.po.Item;
import ssm.exc.service.TestService;

public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestMapper testMapper;

	@Override
	public List<Item> findItems(Integer id) throws Exception {
		return testMapper.queryItems(id);
	}

}
