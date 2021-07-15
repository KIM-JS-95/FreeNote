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



