# %%
score=input("성적을 입력하시오:")
score=int(score)
if score>=60:
    print("합격입니다.")
else:
    print("불합격입니다.")

# %%
card=int(input("카드 잔액을 입력하세요:"))
if card>=1000:
    print("버스 탑승 가능")
else:
    print("버스 탑승 불가능")

# %%
card=input("보안 문자 입력하세요:")
if card=="N8SHA":
    print("비밀번호 찾기 허용")
else:
    print("비밀번호 찾기 허용 안 함")

# %%
base=270
use=int(input("전기 사용량(kW)입력:"))
cost=base*use
if use>100:
    cost+=cost/10
else:
    cost=base*use
print("전기 사용량:",use,"kW")
print("전기 요금:",cost,"원")

# %%
id=input("id를 입력하세요:")
pwd=input("pwd를 입력하세요")
if id=="info" and pwd=="edu":
    print("로그인 되었습니다.")
else:
    print("로그인에 실패했습니다.")

# %%
kind=input("당신의 승객 유형은?[임산부,노약자,일반]")
if kind=="임산부" or kind=="노약자":
    print("이용 가능")
else:
    print("이용 불가능")

# %%
kind=input("당신의 승객 유형은?[임산부,노약자,일반]")
if kind not in "일반":
    print("이용 가능")
else:
    print("이용 불가능")

# %%
point=input("점수를 입력하세요.")
point=int(point)
if point>=90:
    print("성취도 A")
elif point>=80:
    print("성취도 B")
elif point>=70:
    print("성취도 C")
else:
    print("성취도 D")

# %%
num=int(input("정수를 입력하시오."))
if num%2==1:
    print("홀수입니다.")
else:
    print("짝수입니다.")

# %%
num=int(input("정수를 입력하시오."))
if num>0:
    print("양수입니다.")
elif num<0:
    print("음수입니다.")
else:
    print("0")

# %%
age=int(input("나이를 입력하세요:"))
cost=14000
if age>=60 or age<=10:
    if age>=60:
        cost*=0.7
    else:   
        cost*=0.8
        
else:
    print("할인 대상이 아닙니다.")
print("찜질방 이용 요금:",cost)


# %%
n1=int(input("첫 번째 정수 : "))
n2=int(input("두 번째 정수 : "))
if n1>n2:
    print(n1,"이(가) 더 큽니다.")
elif n2>n1:
    print(n2,"이(가) 더 큽니다.")
else:
    print("값이 같습니다.")

# %%
a=int(input("점수를 입력하세요:"))
if a>=60:
    print("합격입니다.")
    if a>=90:
        print("장학금 대상")
else:
    print("불합격")


