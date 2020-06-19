package com.xt.feedback.common.constant;

import com.xt.feedback.common.base.BaseResult;

/**
 * cms系统常量枚举类
 *
 */
public class FbResult extends BaseResult {

    public FbResult(FbResultConstant fbResultConstant, Object data) {
        super(fbResultConstant.getCode(), fbResultConstant.getMessage(), data);
    }
    
    public FbResult(FbResultConstant fbResultConstant,Object data,String message) {
    	super(fbResultConstant.getCode(), message, data);
    }

}
