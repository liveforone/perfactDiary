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
https://doublesprogramming.tistory.com/99
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
