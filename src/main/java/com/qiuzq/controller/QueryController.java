package com.qiuzq.controller;

import com.qiuzq.entity.TUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

/**
 * program: springBoot_day01
 * Date: 2018/12/26/026 21:45
 *
 * @author: Mr.Qiu
 * Description:
 */
@RestController
public class QueryController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/validator", produces = {"text/plain;charset=utf-8"})
    public String validator(@Valid TUserEntity entity, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuffer sb = new StringBuffer();
            // 获取错误字段集合
            List<FieldError> errors = bindingResult.getFieldErrors();
            // 获取本地local.zh_CN
            Locale locale = LocaleContextHolder.getLocale();
            // 遍历错误字段获取错误消息
            for (FieldError error : errors) {
                // 获取错误消息
                String message = messageSource.getMessage(error, locale);
                // 添加错误消息
                sb.append(error.getField() + ":" + message + ",");
            }
            return sb.toString();
        }
        return "验证通过";
    }
}
