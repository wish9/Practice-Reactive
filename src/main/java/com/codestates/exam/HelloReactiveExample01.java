package com.codestates.exam;

import reactor.core.publisher.Mono;

public class HelloReactiveExample01 { // 리액티브 프로그래밍 기본 구조
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Hello, Reactive"); // Publisher의 역할

        mono.subscribe(message -> System.out.println(message)); // Subscriber의 역할

        Mono // 이렇게 하나의 체인 형태로 표현도  (선언형 프로그래밍 방식으로 구성이 되기 때문)
                .just("Hello, Reactive")
                .subscribe(message -> System.out.println(message));
    }
}
