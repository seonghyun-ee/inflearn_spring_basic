package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core", // 이 위치부터 하위 패키지로 찾아간다.
        basePackageClasses = AutoAppConfig.class, // 내 패키지에서 찾는다.
        /**
         * default
         * @ComponentScan을 붙인 클래스의 패키지(시작위치)로부터 하위 패키지로 찾는다.
        */
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
