package com.Tsing.tsingojcodesandbox.sandbox.nativeSandbox;

import com.Tsing.tsingojcodesandbox.model.ExecuteCodeRequest;
import com.Tsing.tsingojcodesandbox.model.ExecuteCodeResponse;
import com.Tsing.tsingojcodesandbox.sandbox.JavaCodeSandboxTemplate;
import org.springframework.stereotype.Component;

/**
 * Java 原生代码沙箱实现（直接复用模板方法）
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
