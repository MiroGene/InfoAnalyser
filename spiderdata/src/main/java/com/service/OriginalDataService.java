package com.service;

import com.vo.ConditionVo;

/**
 * Created by Gene on 2017/7/27.
 */
public interface OriginalDataService {
    public boolean saveOriginalData();
    public OriginalDataService getOriginalData(ConditionVo cv);
}
