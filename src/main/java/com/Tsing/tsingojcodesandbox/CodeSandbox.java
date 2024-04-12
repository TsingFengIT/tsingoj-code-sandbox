package com.Tsing.tsingojcodesandbox;


import com.Tsing.tsingojcodesandbox.model.ExecuteCodeRequest;
import com.Tsing.tsingojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
