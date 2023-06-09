# import, pakage

---

다른 패키지에 속한 클래스를 사용 할 때 사용한다

컴파일러에 코드에서 사용할 클래스의 패키지에 대한 정보를 미리 제공하는 역할을 한다

```java
1. import 패키지이름.클래스이름;
//해당 패키지의 특정 클래스만을 사용하고자 할 때 사용함
2. import 패키지이름.*;
//해당 패키지의 모든 클래스를 클래스 이름만으로 사용하고싶을때 사용함
```

### 클래스 라이브러리 패키지

비슷한 종류의 클래스들을 모아놓은 자바의 디렉토리

사용하기 위해 코드 상단에 패키지 명을 import해주면 된다

```java
package 패키지이름;
```

### 패키지 추가하기

![https://velog.velcdn.com/images/hyun_ha/post/52b84a77-5c68-4308-9fb9-7adac7df8ce8/image.PNG](https://velog.velcdn.com/images/hyun_ha/post/52b84a77-5c68-4308-9fb9-7adac7df8ce8/image.PNG)

패키지가 상, 하위로 구부되어있다면 .을 사용하여 표현한다

```java
상위패키지.하위패키지.클래스
```

### 패키지 선언

- 패키지에 소속된 클래스 파일은 첫 번째 라인에서 잣신이 소속된 클래스 패키지 이름을 선언해야 한다
- 패키지 선언은 하나의 소스파일에 단 한 번만 선언될 수 있다
- 속할 패키지를 지정하지 않은 클래스는 자동적으로 ‘이름없는 패키지(unnamed package)’에 속하게 된다

```java
pakage 패키지명;
```

중복 방지를위해 회사의 도메인 이름으로 패키지를 만든다

- 도메인 이름 역순 + 프로젝트 이름을 붙여준다(포괄적인 이름이 상위 패키지가 되도록)
    
    ```java
    ex
    com.samsung.projectName
    com.google.projectName
    ```
    

### 패키지 사용

같은 패키지에 속하는 클래스: 조건X

다른 패키지에 속하는 클래스: 조건O

1. 패키지, 클래스 모두 기술하는 방법
    - 패키지에 속해있는 클래스에 대한 객체생성을 해야함
    - 패키지 이름을 포함한 풀네임으로 사용해야 함
        
        ```java
        com.soohyeon 패키지에 소속된 eye 클래스를 이용해서 필드를 선언 후 객체를 생성
        
        package com.soohyeon;
        
        public class Face {
        	com.hankook.Eye eye = new com.soohyeon.Eye();
        }
        ```
        
    
2. import문
