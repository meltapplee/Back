# Rest API?

---

**정의**

<aside>
✨ Representational State Transfer API

REST를 기반으로 만들어진 API

URI나 HTTP를 통한 통신 매개체

</aside>

[REST](Rest%20API%209ee6d37707ae416eb6dc4c7e0b69bfae/REST%20688bf48840f44452b8f0384fe14ff404.md)

[API](Rest%20API%209ee6d37707ae416eb6dc4c7e0b69bfae/API%20e216021787f94ff3a798c2cc65c4de86.md)

[JSON & XML](Rest%20API%209ee6d37707ae416eb6dc4c7e0b69bfae/JSON%20&%20XML%2081aab37db62e4c38ba5d655c7a9d870f.md)

### REST API의 구성

<aside>
🎈  1. **자원(RESOURCE)**- URL(Uniform Resource Locator, 인터넷 상 자원의 위치)

1. **행위(VERB)**- HTTP METHOD
2. **표현(REPRESENTATIONS, 클라이언트와 서버가 데이터를 주고받는 형태)**- JSON, XML

![https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F99CA713E5BF4ABB804](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F99CA713E5BF4ABB804)
</aside>

### 작동 방식

<aside>
🤖 **REST API의 작동방식**

HTTP요청을 통해 통신하여 데이터 생성, 읽기, 업데이트, 삭제 기능을 완료한다(CRUD작업)

CRUD

- Create : 생성(POST)
- Read : 조회(GET)
- UPdate : 수정(PUT)
- Delete : 삭제(DELETE)
</aside>

### 디자인 가이드

<aside>
🔨 **REST API의 디자인 가이드**

1. URL은 정보의 자원을 표현해야 한다
2. 자원에 대한 행위는 HTTP Method로 표현한다(Method는 URL에 포함되지 않는다)
</aside>

### 설계 규칙

<aside>
🚧 **REST API의 설계 규칙**

1. URL은 명사를, 대문자보다는 소문자를 사용 해야한다
2. 마지막에 슬래시(/)를 포함하지 않는다
3. 언더바(_) 대신 하이픈(-)을 사용한다
4. 파일 확장자는 URL에 포함 시키지 않는다
5. 행위를 포함하지 않는다
</aside>

### 장점

### 단점

<aside>
👍 **쉬운 사용성**

-REST API의 메세지가 직관적이기 때문에 의도를 확실히 파악할 수 있다. 별도의 인프라 구축이 필요하지 않다

**클라이언트와 서버의 완전한 분리**

-각각의 역할이 명확하게 나눠져 있기 때문에 업무량 감소 및 플랫폼의 독립성 확장이라는 효과를 가질 수 있다

</aside>

<aside>
👎 **메서드 형태가 제한적임**

-HTTP 메서드를 사용해 URL을 표현하기 때문에 메서드 형태가 제한적이다

**표준이 존재하지 않음**

-표준이 정해져 있지 않기에 관리가 어렵다

</aside>
