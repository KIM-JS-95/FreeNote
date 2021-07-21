# Login page 구성 프로젝트

## 1. 구성
1. 회원가입과 사용자 권한 부여
2. 로그인 요청
3. 페이지 접근 성공 / 실패에 따른 페이지 이동
4. 패스워드 BCryptPasswordEncoder 및 WebSecurity 설정

## 2. 화면 구성
![image](https://user-images.githubusercontent.com/65659478/125788971-65e5f49b-b0f7-4f48-83c4-460ad9679b8b.png)

## 3. Spring Security

자바 기반으로 구현된 인증및 권한을 관리하고 사용자가 커스텀 할 수 잇도록 작성된 프레임 워크이다.

즉, HTTP 요청에 대한 인증 및 인증된 요정에 대하여 권한을 체크 함으로서 인증된 요청 및 인가된 데이터에 대해서만 정상 동작하도록 하여 어플리게이션을 
보호할 수 있도록 하는 것이 목적이다.

## Review
웹 서비스에서 중요한 것을 꼽으면 당연 Security가 빠질 수 없다. 고객의 개인정보를 보호하고 관리하는 것도 중요하지만 Web 상에서 어떠한 공격과 취약점
에 대해서 조치, 예방하는 것 또한 중요하다. 

나는 보안예 관해서는 이전 까지 암호화 와 JWT에 대한 활용만을 이해하고 있었지만 이를 100% 활용하지는 못하였다. 

이번 프로젝트는 "보안" 을 중심으로 별도의 서비스제작 없이 LogIn 페이지에만 집중하였다. 그 과정에서 *HttpSecurity()* 와 암호화 활용 방안데 대해 
다시한번 리뷰해 보는 시간을 가질 수 있었다.


## Reference
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-security)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [클래스 HttpSecurity](https://docs.spring.io/spring-security/site/docs/4.2.x/apidocs/org/springframework/security/config/annotation/web/builders/HttpSecurity.html)
* [Blog by "u2ful"](https://u2ful.tistory.com/)




