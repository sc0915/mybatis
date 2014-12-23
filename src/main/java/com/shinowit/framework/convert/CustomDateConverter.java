package com.shinowit.framework.convert;

/**
 * Created by SC on 2014/12/16.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

public class CustomDateConverter implements Converter<String, Date> {
    private static final Logger logger = Logger.getLogger(CustomDateConverter.class);

    @Override
    public Date convert(String source) {
        if ((null == source) || (source.trim().length() == 0)) {
            return null;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(source);
        } catch (ParseException e) {
            if (logger.isDebugEnabled()) {
                logger.error(e.getMessage(), e);
            }
            throw new IllegalArgumentException(source + "不是一个有效的日期");
        }
    }
}
