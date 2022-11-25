package com.codefarm.codefarmer.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "TBL_CHAT_ROOM")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class ChatRoom extends ChatPeriod {
    @Id @GeneratedValue
    private Long chatRoomId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    @Column(name = "MENTOR_ID")
    private Member mentor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    @Column(name = "MENTEE_ID")
    private Member mentee;
}