package com.hy.ureport.service.impl;

import com.hy.ureport.entity.AcParamB204;
import com.hy.ureport.mapper.AcParamB204Mapper;
import com.hy.ureport.service.AcParamB204Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 总企业数与带报数传值 服务实现类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
@Service
public class AcParamB204ServiceImpl extends ServiceImpl<AcParamB204Mapper, AcParamB204> implements AcParamB204Service {
    @Transactional
    @Override
    public void saveParam(AcParamB204 acParamB204) {
        AcParamB204 acParam = new AcParamB204();
        acParam.setTotalHz(acParamB204.getTotalHz());
        acParam.setReHz(acParamB204.getReHz());
        acParam.setTotalWx(acParamB204.getTotalWx());
        acParam.setReWx(acParamB204.getReWx());
        acParam.setTotalNx(acParamB204.getTotalNx());
        acParam.setReNx(acParamB204.getReWx());
        acParam.setTotalDq(acParamB204.getTotalDq());
        acParam.setReDq(acParamB204.getReDq());
        acParam.setTotalCx(acParamB204.getTotalCx());
        acParam.setReCx(acParamB204.getReCx());
        acParam.setTotalAj(acParamB204.getTotalAj());
        acParam.setReAj(acParamB204.getReAj());
        acParam.setTotalCh(acParamB204.getTotalCh());
        acParam.setReCh(acParamB204.getReCh());
        
        baseMapper.insert(acParam);
    }
}
