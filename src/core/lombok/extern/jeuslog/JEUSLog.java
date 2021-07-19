package core.lombok.extern.jeuslog;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: Jaeseong An
 * @since: JEUS 8
 * Created Date: 2021-07-19
 *
 * Causes lombok to generate a logger field.
 * <p>
 * Complete documentation is found at <a href="https://projectlombok.org/features/Log">the project lombok features page for lombok log annotations</a>.
 * <p>
 * Example:
 * <pre>
 * &#64;JEUSLog
 * public class LogExample {
 * }
 * </pre>
 *
 * will generate:
 *
 * <pre>
 * public class LogExample {
 *     private static final org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger(LogExample.class);
 * }
 * </pre>
 *
 * This annotation is valid for classes and enumerations.<br>
 * @see <a href="https://docs.jboss.org/jbosslogging/latest/org/jboss/logging/Logger.html">org.jboss.logging.Logger</a>
 * @see <a href="https://docs.jboss.org/jbosslogging/latest/org/jboss/logging/Logger.html#getLogger(java.lang.Class)">org.jboss.logging.Logger#getLogger(java.lang.Class)</a>
 * @see lombok.extern.apachecommons.CommonsLog &#64;CommonsLog
 * @see lombok.extern.java.Log &#64;Log
 * @see lombok.extern.log4j.Log4j &#64;Log4j
 * @see lombok.extern.log4j.Log4j2 &#64;Log4j2
 * @see lombok.extern.slf4j.Slf4j &#64;Slf4j
 * @see lombok.extern.slf4j.XSlf4j &#64;XSlf4j
 * @see lombok.extern.flogger.Flogger &#64;Flogger
 * @see lombok.CustomLog &#64;CustomLog
 */
@Retention(RetentionPolicy.SOURCE)
@Target(java.lang.annotation.ElementType.TYPE)
public @interface JEUSLog {

    /** @return The category of the constructed Logger. By default, it will use the type where the annotation is placed. */
    String topic() default "";
}
