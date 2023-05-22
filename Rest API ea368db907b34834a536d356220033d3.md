# Rest API?

---

### **정의**

<aside>
✨ Representational State Transfer API

REST를 기반으로 만들어진 API

URI나 HTTP를 통한 통신 매개체

</aside>

### **REST API의 구성**

[REST](Rest%20API%20ea368db907b34834a536d356220033d3/REST%20724866aed27c4792a5a059782cb31eec.md)

[API](Rest%20API%20ea368db907b34834a536d356220033d3/API%20d6aa6011cfd04f83bcdba2eaf780eaa1.md)

[JSON & XML](Rest%20API%20ea368db907b34834a536d356220033d3/JSON%20&%20XML%20d773dfc8a9dd48a2bc9f327c71f9114b.md)

<aside>
<img src="https://www.notion.so/icons/new-badge_gray.svg" alt="https://www.notion.so/icons/new-badge_gray.svg" width="40px" /> **자원(RESOURCE)**- URL(Uniform Resource Locator, 인터넷 상 자원의 위치)

**행위(VERB)**- HTTP METHOD

**표현(REPRESENTATIONS, 클라이언트와 서버가 데이터를 주고받는 형태)**- JSON, XML

![99CA713E5BF4ABB804.jpg](Rest%20API%20ea368db907b34834a536d356220033d3/99CA713E5BF4ABB804.jpg)

</aside>

### **REST API의 작동방식**

HTTP요청을 통해 통신하여 데이터 생성, 읽기, 업데이트, 삭제 기능을 완료한다(CRUD작업)

CRUD

- Create : 생성(POST)
- Read : 조회(GET)
- UPdate : 수정(PUT)
- Delete : 삭제(DELETE)

### 디자인 가이드

<aside>
<img src="https://www.notion.so/icons/crayon_gray.svg" alt="https://www.notion.so/icons/crayon_gray.svg" width="40px" /> **REST API의 디자인 가이드**

1. URL은 정보의 자원을 표현해야 한다
2. 자원에 대한 행위는 HTTP Method로 표현한다(Method는 URL에 포함되지 않는다)
</aside>

### 설계 규칙

<aside>
<img src="https://www.notion.so/icons/t-square_gray.svg" alt="https://www.notion.so/icons/t-square_gray.svg" width="40px" /> **REST API의 설계 규칙**

1. URL은 명사를, 대문자보다는 소문자를 사용 해야한다
2. 마지막에 슬래시(/)를 포함하지 않는다
3. 언더바(_) 대신 하이픈(-)을 사용한다
4. 파일 확장자는 URL에 포함 시키지 않는다
5. 행위를 포함하지 않는다
</aside>

### 장점

<aside>
👍 **쉬운 사용성**

-REST API의 메세지가 직관적이기 때문에 의도를 확실히 파악할 수 있다. 별도의 인프라 구축이 필요하지 않다

**클라이언트와 서버의 완전한 분리**

-각각의 역할이 명확하게 나눠져 있기 때문에 업무량 감소 및 플랫폼의 독립성 확장이라는 효과를 가질 수 있다

</aside>

### 단점

<aside>
👎 **메서드 형태가 제한적임**

-HTTP 메서드를 사용해 URL을 표현하기 때문에 메서드 형태가 제한적이다

**표준이 존재하지 않음**

-표준이 정해져 있지 않기에 관리가 어렵다

</aside>