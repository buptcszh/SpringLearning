package context;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        // 注册一个BeanDefinitionParser，用于解析自定义标签people
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
    }
}
