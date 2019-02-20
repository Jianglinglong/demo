package com.example.demo.config.expression.processor;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

/**
 * @author Jiang
 * @date 2018/7/11
 * @time 9:21
 *
 * 为自定义thymeleaf方言 yuansuju做出相应的处理 processor
 */
public class YuansujuAttributeTagProcessor extends AbstractAttributeTagProcessor {
    public static final int PRECEDENCE = 10000;
    public static final String TEXT = "text";
    public static final String REPLACE = "replace";

    public YuansujuAttributeTagProcessor(final TemplateMode templateMode, final String dialectPrefix,final String attributeName) {
        super(templateMode, dialectPrefix, null, false, attributeName, true, PRECEDENCE, true);
    }


    @Override
    protected void doProcess(
            ITemplateContext context,
            IProcessableElementTag tag,
            AttributeName attributeName,
            String attributeValue,
            IElementTagStructureHandler structureHandler) {
        String name = attributeName.getAttributeName();
        if (TEXT.equals(name)){
            structureHandler.setBody(attributeValue,false);
        }
        if (REPLACE.equals(name)){
            structureHandler.replaceWith(attributeValue,false);
        }
    }
}
