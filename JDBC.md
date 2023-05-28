# JDBC

---

**Java Database Connectivity**

자바에서 데이터베이스에 접속할 수 있도록 하는 자바API

자바에서 데이터베이스로 접근하기 위해 필요

<aside>
💣 **구조**

Java 프로그램 ↔ JDBC 서버 ↔ JDBC 드라이버 ↔ DB

![image.png](JDBC%20409f91256c9a42d5830fbba4623515f4/image.png)

---

**JDBC 드라이버**

JDBC API를 사용하여 자바 애플리케이션과 DBMS간의 연결을 관리하는 자바 클래스

자신의 DBMS에 맞도록 JDBC인터페이스를 구현하여 라이브러리로 제공하는 것

- DBMS별로 알맞은 JDBC드라이버 필요
</aside>

<aside>
👌 **장점**

- JDBC 드라이버가 제공된 데이터베이스는 코드 수정 없이 바로 사용 가능
- 친숙한 데이터 액세스 기술로 별도의 학습 없이 개발 가능
- 데이터베이스와 직접적으로 통신하기 때문에 연산에 대한 성능과 효율성을 극대화 시킬 수 있음
- 다른 데이터베이스 종류로 변경하여도 JDBC구현 라이브러리만 변경하면 됨
</aside>

<aside>
👎 **단점**

- 간단한 SQL을 실행하는 데도 중복된 코드가 반복적으로 사용 됨
- 데이터베이스와의 직접적인 상호작용을 하기 위해 로우 레벨의 작업을 수행해야 함
- 요청 실행 이전과 이후에 많은 코드를 작성함
</aside>