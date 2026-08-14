# %%
s=0
while True:
    num=input("숫자 입력(종료는 n):")
    if num=="n":
        break
    num=int(num)
    s+=num
print("합계:",s)

# %%
i=1
total=0
while i<=5:
    print(i)
    total+=i
    i+=1
print("1~5까지의 합은",total)

# %%
sum=0
while sum<20:
    n=int(input("숫자 입력:"))
    sum+=n
print("입력한 수의 합은:",sum)

# %%
total=0
while total<20:
    num=int(input("숫자 입력:"))
    total+=num
    if total>=20:
        break
print("입력한 수의 합은:",total)

# %%
point=0
sum=0
while sum<20:
    point=int(input("다트 점수를 입력하세요:"))
    print("이번 점수는",point)
    sum+=point
print("합계 점수는",sum)


