# Ver2.
## 캡슐화
- Theater, TicketOffice간 의존성 제거
- TicketSeller가 인터페이스로 동작하도록 변꼉

# Ver1.

## 문제 투성이 코드
- 객체가 수동적이다
- 변경에 매우매우 취약함
- Audience, TicketSeller 변경 시  Theater도 함께 변경해야 함
- 객체 간 의존성이 너무 높다(=결합도가 높다)