package com.example.ojcodesandbox;

import com.example.ojcodesandbox.model.ExecuteCodeRequest;
import com.example.ojcodesandbox.model.ExecuteCodeResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class OjCodeSandboxApplicationTests {

    @Resource
    private JavaNativeCodeSandbox javaNativeCodeSandbox;

    @Test
    void contextLoads() {
        ExecuteCodeRequest executeCodeRequest = new ExecuteCodeRequest();
        List<String> inputList = new ArrayList<>();
        inputList.add("1 2");
        inputList.add("3 4");
        executeCodeRequest.setInputList(inputList);
        executeCodeRequest.setCode("public class Main {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        int a = Integer.parseInt(args[0]);\n" +
                "        int b = Integer.parseInt(args[1]);\n" +
                "        System.out.println(a + b);\n" +
                "    }\n" +
                "}");
        executeCodeRequest.setLanguage("java");
        ExecuteCodeResponse executeCodeResponse = javaNativeCodeSandbox.executeCode(executeCodeRequest);
        System.out.println(executeCodeResponse);
    }

}
