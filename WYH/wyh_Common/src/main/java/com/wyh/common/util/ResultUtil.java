package com.wyh.common.util;

import com.wyh.common.result.R;

public class ResultUtil {
    public static R createResult(int res){
        if(res>0){
            return R.setOK();
        }else {
            return R.setError();
        }
    }
}
