package com.ck.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Tile:自动编号生成工具类
 * Author:何盼
 * Time:2021/04/11
 */
public class TenantCode {
        public static String AutoGenCode(){
            final String UN = "CK"; //这是在生成的编码前加统一前缀
            //下面两行是获取系统时间，并将时间以"202001062309123"这种格式输出
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("yyyyMMddHHmmssSSS");
            //下面是后缀加的随机数
            String str="0123456789";
            Random random=new Random();
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<6;i++){ //此处i<6意为在上面str字符串中随机取6位
                int number=random.nextInt(10);
                sb.append(str.charAt(number));
            }
            return (UN +simpleDateFormat.format(new Date())+sb.toString());
        }
}
