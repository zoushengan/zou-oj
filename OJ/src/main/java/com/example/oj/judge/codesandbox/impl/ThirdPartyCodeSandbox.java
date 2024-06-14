package com.example.oj.judge.codesandbox.impl;

import com.example.oj.judge.codesandbox.CodeSandbox;
import com.example.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.example.oj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
