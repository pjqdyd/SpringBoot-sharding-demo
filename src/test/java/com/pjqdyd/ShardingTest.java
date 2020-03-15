package com.pjqdyd;

import com.pjqdyd.domain.TbOrder;
import com.pjqdyd.mapper.TbOrderItemMapper;
import com.pjqdyd.mapper.TbOrderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**   
 * @Description:  [测试分库分表]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingTest {

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Test
    public void testInsertOrder(){
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(1L);
        tbOrder.setUserId(1L);
        tbOrder.setOrderId(1L);

        int result = tbOrderMapper.insert(tbOrder);
        Assert.assertEquals(1, result);
    }

}
