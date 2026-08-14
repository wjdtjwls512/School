# %%
#1
word=input()
if word==word[::-1]:
    print('펠린드롬')
else:
    print('펠렌드롬아님')

# %%
#1
word=input()
is_pal=True
for i in range(0,len(word)//2):
    if word[i]!=word[-1-i]:
        is_pal=False
        break
if is_pal:
    print('펠린드롬')
else:
    print('펠린드롬아님')

# %%
#2
nums=[10,15,13,20]
for i in range(1,len(nums)):
    print(nums[i]-nums[i-1], end=' ')

# %%
#3
nums=[5,7,3,8,10]
for i in range(len(nums)):
    if nums[i]>nums[i-1]:
        print(nums[i], end=' ')

# %%
#4
dict={}
while True:
    data=input()
    if data=='q':
        break
    name,score=data.split()
    dict[name]=int(score)
print(dict)

for name,score in dict.items():
    if score>=80:
        print(name,'합격')
    else:
        print(name,'불합격')


for name in dict:
    if dict[name]>=80:
        print(name,'합격')
    else:
        print(name,'불합격')

# %%
#5
student_count = int(input())
scores=[]

for i in range(student_count):
    score=int(input())
    scores.append(score)

total_score=0
max_score=scores[0]
min_score=scores[0]

for score in scores:
    total_score+=score
    if score>max_score:
        max_score=score
    if score<min_score:
        min_score=score

if student_count>0:
    average_score=total_score/student_count
else:
    average_score=0

print(f'총점: {total_score}')
print(f'평균: {int(average_score)}')
print(f'최고점: {max_score}')
print(f'최저점: {min_score}')

# %%
#6
score={}
n=int(input())
for i in range(n):
    data=input()
    name,s=data.split()
    score[name]=int(s)

top_name=None
top_score=1
for name,s in score.items():
    if s>top_score:
        top_score=s
        top_name=name
print(top_name,top_score)

for name in score:
    if score[name]>top_score:
        top_score=score[name]
        top_name=name
print(top_name,top_score)

# %%
#7
text=input()

seen=set()
dup=set()

for i in text:
    if i in seen:
        dup.add(i)
    else:
        seen.add(i)
print(dup)

# %%
#8
sentence=input().split()
freq={}

for word in sentence:
    word=word.lower()
    if word in freq:
        freq[word]+=1
    else:
        freq[word]=1
for i in freq:
    print(i,freq[i])

# %%
#get() 사용
sentence=input().split()
freq={}

for word in sentence:
    word=word.lower()
    freq[word]=freq.get(word,0)+1
for k,v in freq.items():
    print(k,v)

# %%
#9
pw=input()
info={'alpha':0,'digit':0,'special':0}
for i in pw:
    if i.isalpha():
        info['alpha']+=1
    elif i.isdigit():
        info['digit']+=1
    else:
        info['special']+=1
print(info)


# %%
#10-1
person={}
name=list(map(str, input().split()))
age=list(map(int, input().split()))

for i in range(len(name)):
    person[name[i]]=age[i]
print(person)

# %%
#10-2
person={}
name=list(map(str, input().split()))
age=list(map(int, input().split()))

for i ,j in zip(name,age):
    person[i]=j
print(person)

# %%
#11
fruits_box={}
fruits=['사과','바나나','포도']
prices=[2500,1500,5000]

for i,j in zip(fruits,prices):
    fruits_box[i]=j
print(fruits_box)

#12
for k,v in fruits_box.items():
    print(f'{k}의 가격은 {v}원 입니다')

#13
sales_box={}
for k,v in fruits_box.items():
    dsc_price=int(v*0.9)
    fruits_box[k]=dsc_price
print(fruits_box)

# %%
#14
names=['민수','영희','철수']
math=[80,90,70]
eng=[90,85,95]

for i,j,k in zip(names,math,eng):
    avg=(j+k)/2
    print(f'{i}의 평균점수: {avg}')

# %%
#15
old_dict={'A':1,'B':2,'C':3}
new_dict={}
for i,j in old_dict.items():
    new_dict[j]=i
print(new_dict)


