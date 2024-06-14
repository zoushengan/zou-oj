package com.example.oj.judge.codesandbox;

import com.example.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.example.oj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
