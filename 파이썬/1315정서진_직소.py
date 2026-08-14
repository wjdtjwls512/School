# %%
A=input()
B=input()
C=input()
D=input()
A=(A=="True")
B=(B=="True")
C=(C=="True")
D=(D=="True")
if B == True and A == False:
    cond1 = False
else:
    cond1 = True

if C == False and B == False:
    cond2 = False
else:
    cond2 = True

if (A == True and D == True) or (A == False and D == False):
    cond3 = False
else:
    cond3 = True

if B != D:
    cond4 = False
else:
    cond4 = True
if cond1 and cond2 and cond3 and cond4:
    print("조건 만족")
else:
    print("조건 불만족")

# %%
height = int(input("키를 입력하세요"))
prot = input('보호자 동반 여부(True or False)')
age = int(input("나이를 입력하세요"))
manager = input('직원 여부(True or False)')
edu = input('안전교육 이수 여부(True or False)')
                                
if manager == "True" and edu == "True" :
    print("탑승 가능")
elif age >= 65 :
    print('탑승 불가')
elif height >= 140 :
    print('탑승 가능')
elif height>=120 and height<140 and prot == "True" :
    print('보호자 동반 시 가능')
else :
    print('탑승불가')

# %%
i=0
sum=0
while True:
    score=int(input())
    if score==-1:
        break
    if 0<=score<=100:
        sum+=score
        i+=1
    else:
        print("잘못된 점수입니다")
if i== 0:
    print("입력된 점수가 없습니다")
else:
    print(f"평균:{sum/i}")

# %%
has_exclamation=False
has_number=False
while True:
    pw=input()

    for ch in pw:
        if ch=="!":
            has_exclamation=True
        if ch.isdigit():
            has_number=True
    if len(pw)>=8 and has_exclamation and has_number:
        print("사용 가능 비밀번호")
        break
    else:
        print("다시 입력")

# %%
point=0
for i in range(1,201):
    if i%28==0:
        continue
    elif i%4==0:
        point+=4
    elif i%7==0:
        point+=7
print(f"{i}일차 총 에코 포인트:{point}")

# %%
num = 5
squ = 0
for i in range(num):
    for j in range(i+1):
        squ += 10 ** j
    print(' '*(num-i-1)+str(squ*squ))
    squ = 0


