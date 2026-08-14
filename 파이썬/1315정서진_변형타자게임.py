import random, time
w=['cat','dog','fox','monkey','mouse','panda','frog','snake','wolf']
n=0
i=0
print('타자게임:준비되면 엔터')
input()
start=time.time()
while i<5:
    q=random.choice(w)
    print(q)
    ans=input()
    if q==ans:
        print("pass")
        n+=1
    else:
        print("fail")
    i+=1
end=time.time()
re=end-start
print(f"pass{n}개, 시간제한10초:걸린시간:{re:4f}초")
if re>10:
    print("시간초과") #시간제한 10초 추가
elif n<5:
    print("오답있음") #오답이 있으면 실패
else:
    print("성공") #시간도 지키고 오답도 없으면 성공