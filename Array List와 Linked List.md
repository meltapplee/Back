# Array List와 Linked List

## 개념

---

### Array List(배열 리스트)

배열과 리스트의 장점을 합친 리스트로 일반 배열과 인덱스로 객체를 관리한다는 점이 같지만, 크기를 유동적으로 늘릴 수 있다. 또한 지정한 저장 용량을 넘으면 자동으로 부족한 크기 만큼의 저장 용량을 증가 시킨다.

### Doubly Linked List(이중 연결 리스트)

연결 리스트는 자료의 순번을 맞추는 것이 아니라 자료를 서로 연결해 놓는 것이다. 데이터와 포인터로 구성되어있는 노드가 서로를 연결하고 있다.

이러한 연결 리스트 중 앞과 뒤를 가리키는 포인터가 두 개 있고, 그것이 앞과 뒤의 노드를 가르키는 리스트가 이중 연결 리스트이다.

## 동작 과정(삽입, 삭제)

<aside>
➰ **Double Linked List**

삽입

1. 삽입할 노드를 생성한다
2. 삽입할 노드의 링크가 삽입될 위치의 후행 노드를 가리키게 한다
3. 삽입될 위치의 선행 노드가 삽입할 노드를 가리키게 한다

   ![https://velog.velcdn.com/images%2Fapril_5%2Fpost%2F3e85ab2a-172e-4177-9e93-6435bf559ea6%2Fimage.png](https://velog.velcdn.com/images%2Fapril_5%2Fpost%2F3e85ab2a-172e-4177-9e93-6435bf559ea6%2Fimage.png)

삭제

1. 삭제할 노드의 선행 노드의 링크가 삭제할 노드의 후 행 노드를 가리키게 한다
2. 삭제할 노드를 메모리에 반환한다
</aside>

<aside>
🔗 **Array List**

삽입

- **배열 리스트 위치에 따른 삽입**
    
    <aside>
    🧗 1. 인덱스가 i인 원소에 접근
    
    배열의 첫 번째 원소의주소를 알고 있으니 i번째 원소에 접근하기 위해서는 첫 번째 원소의 주소 + (자료형 크기)*i 한 주소에 접근하면 됨
    
    따라서 시간 복잡도는 O(1)
    
    ![https://blog.kakaocdn.net/dn/buAixT/btrC88TMnsb/17COQQQ1pcKpRdzVKQvyN1/img.png](https://blog.kakaocdn.net/dn/buAixT/btrC88TMnsb/17COQQQ1pcKpRdzVKQvyN1/img.png)
    
    1. 마지막에 값 삽입, 삭제
    
    크기를 변경할 수 없으니 맨 뒤에 집어 넣을 수가 없다. 그렇기 때문에 지금보다 길이가 1 더 긴 배열을 선언하고 원래의 배열을 복사하고 마지막에 새로운 값을 삽입 하면 됨
    
    배열의 모든 원소를 복사해야 하므로 시간복잡도는 O(n)
    
    ![https://blog.kakaocdn.net/dn/bkkB1B/btrC9MiKL6v/aeIoKnRgQnoI7vomlhuZ4K/img.gif](https://blog.kakaocdn.net/dn/bkkB1B/btrC9MiKL6v/aeIoKnRgQnoI7vomlhuZ4K/img.gif)
    
    마지막에 값 삽입
    
    </aside>
    
1. List의 크기를 삽입될 자료만큼 늘리는 연산을 수행한다
2. 삽입될 자료의 위치를 기준으로 기존의 데이터들을 뒤, 혹은 앞으로 이동하는 연산을 수행한다
3. 해당 위치에 자료를 입력한 후 삽입 연산을 마친다

삭제

1. 삭제될 자료가 위치한 인덱스의 자료를 삭제한다
2. 삭제한 자료의 인덱스를 기준으로 이후의 자료들을 이동하는 연산을 수행한다
3. List의 맨 마지막은 비어있는 상태로 삭제를 완료한다
</aside>

### Array List와 Double Linked List의 차이

|  | 데이터 크기 | 인덱스 조회 | 삽입/삭제 |
| --- | --- | --- | --- |
| Array List | 고정적(선언할 때 크기가 고정) | 인덱스만 안다면 접근 가능 (빠름) | 삽입- 기존의 데이터들의 위치를 뒤로 이동 시킴 (중간 삽입 속도 > 마지막 삽입 속도)
삭제-기존의 데이터들의 위치를 앞으로 이동 시킴(비효율적) |
| Double Linked List | 동적(데이터 삽입 때마다 증가) | 하나하나 위치를 따라가 접근(배열에 비해 느림) | 삽입- 리스트에 연결되어있는 위치에 접근한 후 리스트 추가
삭제-리스트에 연결되어있는 위치에 접근하여 삭제 후, 기존의 리스트를 연결
삽입/삭제 시 메모리를 할당/해제 할 필요가 있음(효율적) |
