# 🌾 Spring Project
너와농부싶어 귀농귀촌 사이트(ver.2) Spring
##### 📆 2022.11.01 - 2022.12.20
<br>

## 📢 청년농 귀농귀촌 정보 지원 사이트 - '너와농부싶어'
#### 귀농귀촌에 대한 지식이 필요하거나 도움이 필요한 사용자들에게 정책과 체험 프로그램/멘토 서비스를 제공해주는 교육 및 커뮤니티 사이트
귀농귀촌의 관심이 있거나 원하지만 도움을 받기 힘든 사용자들에게 지식과 경험을 쌓을 수 있도록 필요한 지식 및 정보, 체험 프로그램이나 멘토 서비스를 제공합니다.
마을홍보를 원하거나 일손이 필요한 농장주들에게 일손 연결도 가능하며 서로 도움을 주거나 소통이 가능한 사이트를 목적으로 가지고 있습니다.

## 🔧 개발 환경
![image](https://user-images.githubusercontent.com/109490411/210180788-c149ad45-52c8-4988-8171-9aca287ddf55.png)


## 📌 맡은 업무
### [퍼블리싱]
- 로그인, 회원가입
- 마이페이지
- 커뮤니티
- 공지

### [백엔드]
#### ① 정보마당
1. 청년 정책
    - 청년 정책 리스트 출력
    - 검색, 페이징
2. 농업 정보
    - 농업 정보 리스트 출력 (이미지 포함)
    - 검색, 페이징
    
#### ② 공지사항
  - 공지 리스트 출력
  - 페이징
  - 공지 세부 페이지 출력
  - 조회수 증가
  - 첨부파일 출력 및 다운로드

#### ③ 문의하기
  - 문의 내용 작성

#### ④ 관리자
0. 메인
    - 사용자, 프로그램, 아르바이트, 멘토 홍보 글, 커뮤니티 댓글, 커뮤니티 최신 순으로 5개씩 출력
1. 사용자
    - 사용자 관리
      - 모든 사용자 리스트 출력
      - 필터 검색, 페이징
      - 사용자 탈퇴(삭제)
2. 프로그램
    - 프로그램 관리
      - 모든 프로그램 리스트 출력
      - 필터 검색, 페이징
      - 신청 마감 날짜 혹은 지원자 현황에 따른 상태 출력
      - 프로그램 글 삭제
    - 프로그램 지원자 관리
      - 모든 지원자 리스트 출력
      - 필터 검색, 페이징
      - 금액에 따른 문구 출력
      - 상태에 따른 문구 출력
3. 아르바이트
    - 아르바이트 관리
      - 모든 아르바이트 리스트 출력
      - 필터 검색, 페이징
      - 신청 마감 날짜 혹은 지원자 현황에 따른 상태 출력
      - 공고 글 삭제
    - 아르바이트 지원자 관리
      - 모든 지원자 리스트 출력
      - 필터 검색, 페이징
 4. 멘토
    - 멘토 관리
      - 모든 멘토 리스트 출력
      - 필터 검색, 페이징
      - 멘토와 매칭된 멘티 목록 출력
    - 멘토 홍보 글 관리
      - 모든 멘토 홍보 글 리스트 출력
      - 필터 검색, 페이징
      - 멘토 홍보 글 삭제
    - 멘토 리뷰 댓글 관리
      - 모든 멘토 리뷰 댓글 리스트 출력
      - 필터 검색, 페이징
      - 각 리뷰의 평점 표시
      - 리뷰 글 삭제
 5. 공지사항
    - 공지사항 관리
      - 공지사항 작성, 수정, 삭제
      - 모든 공지 글 리스트 출력
      - 필터 검색, 페이징
      - 다중 첨부파일 추가
      - 첨부파일 있는 공지 글 표시
 6. 문의하기
    - 문의하기 관리
      - 모든 문의 리스트 출력
      - 필터 검색, 페이징
      - 답변 유무에 따른 문의 상태 표시
      - 답변 등록, 수정
 7. 자유게시판
    - 자유게시판 관리
      - 모든 글 리스트 출력
      - 필터 검색, 페이징
      - 글 삭제
      - 각 커뮤니티 글의 댓글 개수 표시
    - 자유게시판 댓글 관리
      - 모든 댓글 리스트 출력
      - 필터 검색, 페이징
      - 댓글 삭제
 8. 청년 정책
    - 청년 정책 관리
      - 청년 정책 작성, 수정, 삭제
      - 모든 정책 리스트 출력
      - 필터 검색, 페이징
 9. 농업 정보
    - 농업 정보 관리
      - 농업 정보 작성, 수정, 삭제
      - 모든 정보 리스트 출력
      - 필터 검색, 페이징
      - 단일 첨부파일 추가
      - 첨부파일 있는 글 표시
 9. 배너
    - 배너 관리
      - 배너 등록, 수정, 삭제
      - 모든 배너 리스트 출력
      - 필터 검색, 페이징
      - 단일 배너 이미지 추가
      - 배너 상태 표시
  

## 😃 느낀점
- Spring, JPA를 배우고 작업에 바로 적용시키기가 힘들었지만 작업을 하다보니 저번 JSP 프로젝트 때 완성하지 못했던 검색이나 필터 등을 완성시켰다.<br>
완성도가 올라가고 이해도가 올라가면서 성취감을 느꼈고 다른 작업에 들어갈 때 전보다 자신감이 생겼다.
- 소통의 중요성을 배웠다.
서로 작업하는 부분이 연결되어 있다 보니 작업하면서 많은 소통이 필요했다.<br>
또한 내가 작업하는 부분에서 어려움이 생기거나 다른 작업에서 어려움이 생겼을 때 소통을 하며 해결해 나가면서 작업을 완성시켰다.
- 작업을 진행하면서 많은 오류를 마주했었는데 오류 해결에 많은 시간이 걸렸다.<br>
비교적 단순한 것도 있었지만 해결하기 어려운 것도 많았고 다양한 오류를 경험하며 해결하는 방법을 배우게 되었다.

## 😥 아쉬운점
- 기획 단계에서 세부적으로 설계되지 않아 진행하면서 수정한 부분도 있었고 컬럼 조건 때문에 테이블 수정이 여러 번 이루어졌다.<br>
나중에 다시 프로젝트를 진행하게 된다면 기획을 좀 더 꼼꼼하게 설계해서 불필요한 시간을 단축하고 싶다.<br>
- Rest를 많이 사용해 보지 못한 게 아쉽다.<br>
사용해 보고 싶어서 간단하게 리스트 출력으로 적용시켰지만 작성, 수정, 삭제 등 다양하게 적용시켜보지 못한 게 너무 아쉽다.
- 맡은 부분 특성상 비슷한 작업이 많았기 때문에 다음번엔 다른 다양한 작업(OAuth, 결제 API, 채팅 등)도 경험해 보고 싶다.


## 📚 ERD
![ERD drawio](https://user-images.githubusercontent.com/109490411/210175125-f1092cfd-668b-497a-87f3-bd1bf1dd389f.png)

## 👀 메뉴트리
#### [사용자 WEB]
![메뉴트리_사용자](https://user-images.githubusercontent.com/109490411/210175457-2cb281cf-0ca6-4171-b2be-db97c293c005.png)


#### [관리자 WEB]
![메뉴트리_관리자](https://user-images.githubusercontent.com/109490411/210175458-66f19f8f-0cb2-41fc-b57c-a7c37bf434a1.png)

