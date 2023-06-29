# URI, URL, URN 뭘까?

분류: 과제
작성일: 2023년 5월 9일
피드백: Yes

## URI(Uniform Resource Identifier)

통합 자원 **식별자**

- 인터넷에 있는 자원을 나타내는 유일한 주소
- 특정 서버에 있는 웹 문서를 가리킴
- 하위 개념으로 URL, URN이 있다.

<aside>
💡 구조

`scheme:[//[user[:password]@]host[:port]][/path][?query][#fragment]`

![phttps://velog.velcdn.com/images%2Fdev-joon%2Fpost%2F03f0adbc-6062-48aa-871f-40a45f975c09%2Fimage.png](https://velog.velcdn.com/images%2Fdev-joon%2Fpost%2F03f0adbc-6062-48aa-871f-40a45f975c09%2Fimage.png)

- Scheme(스킴)
    
    : URL에서 리소스를 요청하기 위해 사용해야 하는 프로토콜. HTTP / HTTPS 프로토콜이 가장 많이 사용되고 있음
    
- Domain(도메인)
    
    : 이 리소스를 호스팅하는 서버를 나타냄. 도메인 이름 또는 IP 주소 일 수 있음
    
- Port(포트)
    
    : 어떤 서버를 이용할지 결정.  서버가 프로토콜의 표준 포트를 사용 할 시 일반적으로 생
    
- Path(/)
    
    : 호스팅 서버의 경로(폴더와 비슷한 개념 /뒤에 나옴)
    
- Parameters(?)
    
    : 호스팅 서버에 제공되는 선택적 추가 정보. 여러개가 존재 할 수 있음
    
- Anchor(#)
    
    : 리소스 내부의 특정 부분을 나타냄. 프래그먼트 라고도 함
    
</aside>

## URL(**Uniform Resource Locator)**

통합 자원 지시자

- 네트워크상에서 자원이 어디 있는지를 알려주기 위한 규약
- **웹 주소**라고 불리며 특정 서버 하나의 리소스 위치를 구체적으로 서술하는 문자열
- 웹 문서 자체를 가르킴

## URN(**Uniform Resource Name)**

통합 자원 이름

- URL의 단점을 극복하기 위해 만들어졌다
- 자원에 대해 영속성을 가진 유일한 값(ex 주민번호)
- 독립적인 이름을 제공하기 위해 존재한다
- 자원의 존재 유무나 위치를 특정하는 것

![https://user-images.githubusercontent.com/72444675/159243009-82c7aa0c-71c7-4caa-901c-481d94409e67.png](https://user-images.githubusercontent.com/72444675/159243009-82c7aa0c-71c7-4caa-901c-481d94409e67.png)
![[URI,%20URL,%20URN%20%E1%84%86%E1%85%AF%E1%86%AF%E1%84%81%E1%85%A1%203424efcd3e844e89a702a437f1415d73/Untitled%201.png](URI,%20URL,%20URN%20%E1%84%86%E1%85%AF%E1%86%AF%E1%84%81%E1%85%A1%203424efcd3e844e89a702a437f1415d73/Untitled%201.png)
](https://velog.velcdn.com/images/yvnji25/post/469c8069-e667-4634-b004-4bef54f6d52d/image.png)
### URL URN 차이

- URL: 어떻게, 어디서 리소스를 가져와야 하는지 알려주는 URI
- URN: 리소스 그 차체와 경로를 특정 하는 URN
