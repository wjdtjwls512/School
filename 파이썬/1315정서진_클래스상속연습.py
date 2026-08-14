# %%
class Notification:
    platform='공동 알림 시스템'
    def __init__(self,user):
        self.user=user

    def send(self,message):
        print(f'{self.user}에게 알림:{message}')

class EmailNotification(Notification):
    method='이메일'
    def send(self,message):
        print(f'[이메일]{self.user}에게 전송:{message}')

class SMSNotification(Notification):
    method='문자'
    def send(self,message):
        print(f'[문자]{self.user}에게 전송:{message}')

class AppNotification(Notification):
    method='앱푸시'
    def send(self,message):
        print(f'[앱푸시]{self.user}에게 전송:{message}')

class KakaoNotification(Notification):
    def send(self,message):
        print(f'[카카오톡]{self.user}에게 전송:{message}')
#1
email=EmailNotification('철수')
sms=SMSNotification('영희')
app=AppNotification('민수')
kakao=KakaoNotification('수진')
noti=Notification('관리자')
#2
print(email.user)
print(sms.user)
print(app.user)
#3
print(Notification.platform)
#4
print(EmailNotification.platform)
print(SMSNotification.platform)
print(AppNotification.platform)
#5
print(EmailNotification.method)
print(SMSNotification.method)
print(AppNotification.method)
#6
print(email.method)
print(sms.method)
print(app.method)
#7
email.send('회원가입 완료')
sms.send('인증번호 1234')
app.send('새 메세지가 도착했습니다')
#8
noti.send('시스템 변경 안내')
#9
email=EmailNotification('지민')
email.send('비밀번호 변경 완료')
#10
n=[email,sms,app]
for i in n:
    i.send('공지사항이 있습니다')
#12
print(type(email))
print(type(sms))
print(type(app))
#13
print(isinstance(email,EmailNotification))
print(isinstance(email,Notification))
#14
notice=Notification('관리자')
print(isinstance(notice,Notification))
print(isinstance(notice,EmailNotification))
#15
kakao.send('친구 요청이 도착했습니다')
#17
Notification.platform='학교알림시스템'
print(email.platform)
print(sms.platform)
print(app.platform)
#18
email.title='가입안내'
print(email.title)
#20
email=EmailNotification('철수')
sms=SMSNotification('영희')
app=AppNotification('민수')

s=[email,sms,app]
for i in s:
    print(i.user)
    print(i.method)
    print(i.platform)
    i.send('오늘 수업이 있습니다')


