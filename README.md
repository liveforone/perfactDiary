<h1>로컬 로그인 게시판</h1>

<h3>설계</h3>
<pre>
스프링 시큐리티가 아닌 자체 밸리데이션을 활용한
로컬 로그인 게시판
일기처럼 간단하게 작성하고 남길 수 있음
</pre>

<h3>요구사항</h3>
<pre>
컨트롤러 단에서 저자를 매핑해준다.
저자만 업데이트 삭제 가능하게 변경
저자만 가능하게 하려면 findByName 으로 찾도록 함 이름이 일치하는지!!
로그인 한 상태에서의 리스트 url이 필요함 /{user}/list
https://doublesprogramming.tistory.com/99
공지사항 넣기
로그아웃 넣기
마지막엔 계속해서 등록가능하도록 dll-auto update로 바꾼다
</pre>

<h3><u>뷰로 부터 데이터 가져오기</u></h3>
<pre>
뷰단에 가져올 데이터는 name="이름" 으로 되어있어야하면
@RequestParam("이름")
이면 가져오게 된다. 타입은 어떠한 것이던 상관없다.
</pre>

<h3>참고사항</h3>
<pre>
게시판 : basicBoard
로그인 : springsession
객체간 상호작용 : apiserver
</pre>

<h3>회고</h3>
<pre>
완벽하지 못했고, 내가 원한 기능들이 많이 빠져있었다.
예를 들면 작성자만 글 삭제, 세션으로 로그인한 사용자 이름들고와서 post시 사용
신고기능 등등 많은 기능들이 없지만 그래도
혼자서 뷰단 까지, 부트스트랩 적용가지, 서버는 말할것도 없고 ㅋㅋ
처음으로 만들어본 게시판이다.
누군가의 것을 모방하고 업그레이드 한 게시판이 아닌
혼자 만들어본,,, 기초를 이해하는데에 많은도움이됬다.
기초도 모르고 무작정 많이 따라치다보니 이 기능이 정확히 왜 쓰이고
또 다르게 어떻게 쓰일 수 있는지 새롭게 알게되는 좋은 시간이였다.
회고 
</pre>
