package com.qiuzq.validator;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * program: springBoot_day01
 * Date: 2018/12/26/026 22:30
 *
 * @author: Mr.Qiu
 * Description:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
//@Constraint(validatedBy = Fl)
public @interface FlagValidtor {
}
