package com.example.demo.config.expression.factory;

import com.example.demo.util.MoneyUtil;
import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.expression.IExpressionObjectFactory;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Jiang
 * @date 2018/7/11
 * @time 10:41
 *
 * 为thymeleaf模板添加自定义 工具类,使用方式<p th:text="${#moneyUtil.autoDouble(10000010)}">123</p>
 */
public class YuansujuObjectExpressionFactory implements IExpressionObjectFactory {
    public static final String STRING_UTILS_EXPRESSION_OBJECT_NAME = "moneyUtil";

    private static final MoneyUtil MONEY_UTIL = new MoneyUtil();


    public static final Set<String> ALL_EXPRESSION_OBJECT_NAMES;


    static {

        final Set<String> allExpressionObjectNames = new LinkedHashSet<String>();
        allExpressionObjectNames.add(STRING_UTILS_EXPRESSION_OBJECT_NAME);
        ALL_EXPRESSION_OBJECT_NAMES = Collections.unmodifiableSet(allExpressionObjectNames);

    }
    public YuansujuObjectExpressionFactory(){
        super();
    }

    @Override
    public Set<String> getAllExpressionObjectNames() {
        return ALL_EXPRESSION_OBJECT_NAMES;
    }

    @Override
    public Object buildObject(IExpressionContext context, String expressionObjectName) {
        return STRING_UTILS_EXPRESSION_OBJECT_NAME.equals(expressionObjectName) ? MONEY_UTIL : null;

    }

    @Override
    public boolean isCacheable(String expressionObjectName) {
        return STRING_UTILS_EXPRESSION_OBJECT_NAME.equals(expressionObjectName);
    }
}
