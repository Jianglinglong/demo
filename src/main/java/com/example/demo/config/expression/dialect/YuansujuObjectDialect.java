package com.example.demo.config.expression.dialect;

import com.example.demo.config.expression.factory.YuansujuObjectExpressionFactory;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.dialect.IExpressionObjectDialect;
import org.thymeleaf.expression.IExpressionObjectFactory;

/**
 * @author Jiang
 * @date 2018/7/11
 * @time 10:39
 *
 * 使用 EXPRESSION_OBJECTS_FACTORY{@link YuansujuObjectExpressionFactory}解析自定义工具方言
 */
public class YuansujuObjectDialect extends AbstractDialect implements IExpressionObjectDialect {
    private static final String NAME ="money";
    public YuansujuObjectDialect() {
        super(NAME);
    }

    private final IExpressionObjectFactory EXPRESSION_OBJECTS_FACTORY = new YuansujuObjectExpressionFactory();

    @Override
    public IExpressionObjectFactory getExpressionObjectFactory() {
        return this.EXPRESSION_OBJECTS_FACTORY;
    }
}
