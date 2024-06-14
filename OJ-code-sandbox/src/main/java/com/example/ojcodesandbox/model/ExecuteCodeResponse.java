package com.example.ojcodesandbox.model;

import lombok.Data;

import java.util.List;

/**
 * 代码执行响应封装
 */
@Data
public class ExecuteCodeResponse {

    private List<String> outputList;

    private String message;

    private Integer status;

    private JudgeInfo judgeInfo;
}
