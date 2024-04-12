package hello.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // final이 붙은 필수 필드의 생성자를 만들어준다.
public class HelloLombok {

    private String name;
    private int age;
}
