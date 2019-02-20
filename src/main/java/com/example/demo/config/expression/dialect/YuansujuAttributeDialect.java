package com.example.demo.config.expression.dialect;

import com.example.demo.config.expression.processor.YuansujuAttributeTagProcessor;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jiang
 * @date 2018/7/11
 * @time 9:17
 *
 * 自定义thymeleaf方言前缀
 */
public class YuansujuAttributeDialect extends AbstractProcessorDialect {
    /**
     * 定义方言名称
     */
    public static final String NAME = "yuansuju money dialect";
    /**
     * 定义方言前缀
     */
    public static final String PREFIX = "yuansuju";
    public static final int PROCESSOR_PRECEDENCE = 1000;


    public YuansujuAttributeDialect() {
        super(NAME, PREFIX, PROCESSOR_PRECEDENCE);
    }

    @Override
    public Set<IProcessor> getProcessors(String dialectPrefix) {
        Set<IProcessor> processors = new HashSet<IProcessor>();
        //添加我们定义的标签
        processors.add(new YuansujuAttributeTagProcessor(TemplateMode.HTML,dialectPrefix,YuansujuAttributeTagProcessor.TEXT));
        processors.add(new YuansujuAttributeTagProcessor(TemplateMode.HTML,dialectPrefix,YuansujuAttributeTagProcessor.REPLACE));
        return processors;
    }
}
