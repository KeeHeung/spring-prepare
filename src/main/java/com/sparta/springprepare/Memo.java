package com.sparta.springprepare;

import lombok.*;

@Getter // 멤버필드 get메소드
@Setter // 멤버필드 set메소드
//@AllArgsConstructor // 멤버필드가 있는 생성자
//@NoArgsConstructor // 멤버필드가 없는 생성자
@RequiredArgsConstructor // final 멤버필드만 가지는 생성자
public class Memo {
    private final String username;
    private String contents;
}