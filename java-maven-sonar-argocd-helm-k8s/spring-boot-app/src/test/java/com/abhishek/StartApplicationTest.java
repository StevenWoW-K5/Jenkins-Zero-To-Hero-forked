package com.abhishek;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

class StartApplicationTest {

    @Test
    void index() {

        // 创建 StartApplication 实例
        StartApplication startApplication = new StartApplication();

        // 创建一个模拟的 Model 对象
        Model model = Mockito.mock(Model.class);

        // 调用 index 方法
        String result = startApplication.index(model);

        // 验证 model 的属性是否正确设置
        Mockito.verify(model).addAttribute("title", "I have successfuly built a sprint boot application using Maven999111-666hhh11123664tttSEP");
        Mockito.verify(model).addAttribute("msg", "This application is deployed on to Kubernetes using Argo CD");

        // 验证 index 方法的返回值是否符合预期
        assertEquals("index", result);
        assertEquals(6,6);
    }

    @Test
    void main() {
    }
}