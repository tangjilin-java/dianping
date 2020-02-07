package ab.tjl.dianping.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author:TangJiLin
 * @Description:统一处理权限  切面处理事务 防止其他用户直接闯入后台界面
 * @Date: Created in 2020/2/7 11:09
 * @Modified By:
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AdminPermission {
    String produceType() default "text/html";
}
