package com.alibaba.cola.extension.register;

import com.alibaba.cola.extension.BizScenario;
import com.alibaba.cola.extension.ExtensionExecutor;
import com.alibaba.cola.extension.test.Application;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ExtensionRegisterTest {

    @Resource
    private ExtensionRegister register;

    @Resource
    private ExtensionExecutor executor;

    @Test
    public void test() {
        SomeExtensionPoint extA = new SomeExtensionA();
        register.doRegistration(extA);

        SomeExtensionPoint extB = CglibProxyFactory.createProxy(new SomeExtensionB());
        register.doRegistration(extB);

        executor.executeVoid(SomeExtensionPoint.class, BizScenario.valueOf("A"), SomeExtensionPoint::doSomeThing);
        executor.executeVoid(SomeExtensionPoint.class, BizScenario.valueOf("B"), SomeExtensionPoint::doSomeThing);
    }

}
