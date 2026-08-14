# %%
#1
nums=[2,4,6,8]
for i in nums:
    print(i)

# %%
#2
nums=[5,10,15]
total=0
for i in nums:
    total+=i
print(total)

# %%
#3
nums=[1,2,3,4,5,6]
cnt=0
for i in nums:
    if i%2==0:
        cnt+=1
print(cnt)

# %%
#4
nums=[3,15,7,20,9]
for i in nums:
    if i>10:
        print(i)

# %%
#5
nums=[12,7,25,3,18]
m=nums[0]
for n in nums:
    if n>m:
        m=n
print(m)

# %%
#6
nums=[1,2,3,4]
num=[]
for i in nums:
    n=i*i
    num.append(n)
print(num)

# %%
#7
nums=[1,3,3,2,3,4]
cnt=0
for i in nums:
    if i==3:
        cnt+=1
print(cnt)

# %%
#8
nums=[10,20,30,40]
num=[]
for i in range(len(nums)-1,-1,-1):
    num.append(nums[i])
print(num)

# %%
#9
nums=[1,2,2,3,1,4,3]
new_list = []
for n in nums:
    if n not in new_list:
        new_list.append(n)
print(new_list)
    

# %%
#10
a=[1,2,3,4,5]
b=[3,5,7,9]
c=[]
for n in a:
    if n in b:
        c.append(n)
print(c)

# %%
#11
nums=[4,9,2,9,1]
m=0
for i in range(1, len(nums)):
    if nums[i]>nums[m]:
        m=i
print(m)

# %%
#12
nums=[1,2,2,3,3,3,4]
d = {}
for n in nums:
    if n in d:
        d[n] += 1
    else:
        d[n] = 1
mx_cnt = 0
res = None
for k, v in d.items():
    if v > mx_cnt:
        mx_cnt = v
        res = k
print(res)

# %%
#13
nums=[5,12,7,20,3,15]
num=[]
for i in nums:
    if i>10:
        num.append(i)
print(num)

# %%
#14
words=['apple','kiwi','banana']
nw=[]
for i in words:
    nw.append(len(i))
print(nw)

# %%
#15
nums = [5, 2, 8, 1, 3]
n = len(nums)
for i in range(n):
    for j in range(i+1,n):
        if nums[i]>nums[j]:
            nums[i],nums[j]=nums[j],nums[i]
print(nums)