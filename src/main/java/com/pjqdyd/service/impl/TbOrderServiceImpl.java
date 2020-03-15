package com.pjqdyd.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pjqdyd.mapper.TbOrderMapper;
import com.pjqdyd.service.TbOrderService;
@Service
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;

}
