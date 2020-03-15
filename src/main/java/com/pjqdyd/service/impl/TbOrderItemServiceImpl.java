package com.pjqdyd.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pjqdyd.mapper.TbOrderItemMapper;
import com.pjqdyd.service.TbOrderItemService;
@Service
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

}
