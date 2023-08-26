# JWT



**Json Web Token**

인증에 필요한 정보들을 암호화 한 JSON토큰

Json포맷을 이용하여 사용자에 대한 속성을 저장

인증: 로그인

인가: 권한 생성

![https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FrdboS%2FbtqArUrgcMr%2FHWY80zNL9reAv6FeE6AYE1%2Fimg.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FrdboS%2FbtqArUrgcMr%2FHWY80zNL9reAv6FeE6AYE1%2Fimg.png)

### **구조**

### `Header.Payload.Signature`

**Header (type - 알고리즘)**

타입과 알고리즘의 두 가지 내용으로 이루어져 있다.

- `typ` : 토큰의 유형(type)
    
    ex) JWT
    
- `alg` : 해싱 알고리즘을 지정(토큰을 검증할 때 사용되는 signature부분에서 사용한다)
    
    ex) HMAC SHA256 또는 RSA
    

**payload**

토큰에 담을 정보인 클레임을 가지고 있다. 보내고자 하는 데이터 자체를 의미한다

- `path`: 토큰의 적용 대상 URL 경로
- `sub` : 토큰 제목
- `iss` : 토큰 발행자
- `iat` : 발행 시각(NumericDate형식으로 날짜를 지정)
- `exp` : 만료 시각(NumericDate형식으로 날짜를 지정)
- `aud` : 클라이언트(토큰의 대상)
- `nbf`: 토큰 활성화
- `개인 클레임`: 서로 정보를 공유하기 위해 생성된 사용자 지정 클레임
    
    ex) userId, userName
  <br/> 
    

**signature**

- header랑 payload조합해서 암호화 하는 그런거(토큰 암호화 코드)
- 다른사람이 위변조 했는지 검증하기 위한 부분이다
- 헤더의 인코딩 값 + 내용의 인코딩 값을 합친 후 비밀키로 해시를 하여 생성한다

---

해시함수: 임의의 크기의 정보를 고정된 크기의 정보로 줄여주는 것

해싱: 해시 알고리즘을 사용하여 해시 코드를 얻는 과정

파싱: 주어진 정보를 **내가 원하는 형태로 가공**하여 서버에서 불러들이는 것  
<br/>   

  


### Access Token 사용 방법

1. Http Header에 Token을 삽입하여 서버로 Request를 보낸다
2. 서버는 JwtInterceptor를 사용하여 Controller에 접근하기 전에 토큰을 먼저 낚아채 검증한다

### RefreshToken을 사용한 AccessToken 갱신

1. Http Header에 삽입하여 서버로 Request를 보내며 갱신을 위해 AccessToken과 함께 서버로 보낸다
2. JwtInterceptor를 사용하여 Http Header에 RefrexhToken이 있다면 RefreshToken을 검증 한 후 AccessToken을 재발급 한다
