package com.borisov.conditions;

import com.borisov.annotations.ConditionMode;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

/**
 * Created by uladzislau on 7/28/16.
 */
public class ModeCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        MultiValueMap<String, Object> allAnnotationAttributes = annotatedTypeMetadata.getAllAnnotationAttributes(ConditionMode.class.getName());
        boolean enabled = (boolean) allAnnotationAttributes.getFirst("value");
//        System.getProperties().containsKey("")

        return enabled;
    }
}
