package com.example.socket.global.socket;

import org.springframework.stereotype.Service;


import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
@ServerEndpoint(value="/chat")
public class WebsocketChatt {
    private static Set<Session> clients = Collections.synchronizedSet(new HashSet<>());

    @OnMessage
    public void onMessage(String msg, Session session) throws Exception {
        System.out.println("receive message: " + msg);
        for(Session s : clients) { //서버에 연결되어있는 모든 클라 메세지 전송
            System.out.println("send data: "+ msg);
            s.getBasicRemote().sendText(msg); // 메세지 전송
        }
    }

    @OnOpen
    public void onOpen(Session s) {
        System.out.println("open session: " + s.toString());
        if(!clients.contains(s)) { //clients에 해당 세션이 존재하지 않으면 clients에 접속된 클라이언트를 추가
            clients.add(s);
            System.out.println("session open" + s);
        }
        else {
            System.out.println("이미 연결된 세션 입니다");
        }
    }

    @OnClose
    public void onClose(Session s) {
        System.out.println("session close" + s);
        clients.remove(s); //클라이언트 정보 삭제
    }
}
