package com.zb;

/**
 * Created by zhangbing on 2/21/17.
 */
public interface Callback<T> {
    void onData(SvcResult<T> result);
}