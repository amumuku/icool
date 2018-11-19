package com.general.freight.server.brand;


import com.general.freight.dal.bean.Brand;
import com.general.freight.dal.dao.BrandMapper;
import com.general.freight.server.Application;
import com.general.freight.server.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class BrandTestDemo extends BaseTest {

	@Autowired
	BrandFacade brandFacade;

	@Autowired
	InventoryRemoteService inventoryRemoteService;
	@Test
	public void test() {
		String dolphinTest = brandFacade.getSayHelloWorld();
		System.out.println(dolphinTest);

	}
	@Test
	public void test2() {
		InventoryQueryDtoParam queryDtoParam = new InventoryQueryDtoParam();
		queryDtoParam.setShopId(50954);
		Result<List<InventoryDto>> result = inventoryRemoteService.getInventoryListByParam(queryDtoParam);
		System.out.println(JSONUtils.toJSONString(result.getData()));

	}
}
