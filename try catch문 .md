# try catch문

---

![try%20catch%E1%84%86%E1%85%AE%E1%86%AB%20b42fed4d442342dbb86d8bff27572e7f/Untitled.png]

```java
try {

//예외발생할 가능성이 있는 문장 
    
}catch(Exception1 e1) {

 //Exception1이 발생했을 경우, 이를 처리하기 위한 문장적는다.
 //보통 이곳에 예외메세지를 출력하고 로그로 남김.
 
}catch(Exception2 e2) {

 //Exception2이 발생했을 경우, 이를 처리하기 위한 문장적는다.
 
}catch(ExceptionN eN) {

 //ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장적는다.
 
}finally{

//예외발생여부에 관계없이 항상 수행되어야 하는 문장적는다.

}
```

try문에서 Exception1이 발생하면 catch(Exception1 e1)로 빠져 중괄호 안의 문장을 실행한다.

예외가 try-catch문 밖에서 일어나거나 해당하는 catch문이 없을 시 에는 에러가 나게 된다

finally문에서는 예외 발생/미 발생 에 관계없이 무조건 수행해야하는 문장을 적는다

- 보통 자원 또는 DB에 연결되어있는 경우, 파일 닫기, 연결 닫기와 같은 정리 문장을 적는다

```java
catch (AuthException e) { //(처리하고자하는예외타입 참조변수)
    	    e.printStackTrace();    //예외정보 출력 
            log.error("AuthException ERROR: {} ", e.getMassage()); //로그남김 
            throw e;  //예외 던지기 
} catch (Exception e ) {
            e.printStackTrace();
            log.error("Exception ERROR: {} ", e.getMassage());
            throw e;
}
```
