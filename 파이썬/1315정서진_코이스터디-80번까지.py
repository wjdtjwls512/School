# %%
#15
a, b = input().split(":")
print(a, b, sep=":")

# %%
#16
y, m, d = input().split(".")
print(d,m,y,sep="-")

# %%
#17
yymmdd,xxxxxxx=input().split("-")
print(yymmdd,xxxxxxx,sep="")

# %%
#18
s = input()
print(s[0])
print(s[1])
print(s[2])
print(s[3])
print(s[4])

# %%
#19
s = input()
print(s[0:2],s[2:4],s[4:],sep=" ")

# %%
#20
h,m,s=input().split(":")
print(int(m))

# %%
#21
w1, w2 = input().split(" ")
s = w1 + w2
print(s)

# %%
#22
a,b=input().split(" ")
c = int(a) + int(b)
print(c)

# %%
#23
a=input()
b=input()
c = float(a) + float(b)
print(c)

# %%
#24
a = input()
n = int(a)
print("%x" % n)

# %%
#25
a = input()
n = int(a)
print("%X" % n)

# %%
#26
a = input()
n = int(a, 16)
print("%o" % n)

# %%
#27
n = ord(input())
print(n)

# %%
#28
c = int(input())
print(chr(c))

# %%
#29
n=int(input())
print(-n)

# %%
#30
n = ord(input())
print(chr(n+1))

# %%
#31
a,b=input().split(" ")
c = int(a) - int(b)
print(c)

# %%
#32
f1,f2=input().split(" ")
m = float(f1) * float(f2)
print(m)

# %%
#33
w, n = input().split(" ")
print(w*int(n))

# %%
#34
n = input()
s = input()
print(int(n)*s)

# %%
#35
a,b=input().split(" ")
c = int(a)**int(b)
print(c)

# %%
#36
f1,f2=input().split(" ")
f3 = float(f1)**float(f2)
print(f3)


# %%
#37
a,b=input().split(" ")
c=int(a)//int(b)
print(c)

# %%
#38
a,b=input().split(" ")
c=int(a)%int(b)
print(c)

# %%
#39
f=float(input())
print(round(f, 2))

# %%
#40
f1,f2=input().split(" ")
f3=float(f1)/float(f2)
print(round(f3, 3))

# %%
#41
a,b=input().split(" ")
print(int(a)+int(b))
print(int(a)-int(b))
print(int(a)*int(b))
print(int(a)//int(b))
print(int(a)%int(b))
print(round(int(a)/int(b),2))

# %%
#42
a,b,c=input().split(" ")
d=int(a)+int(b)+int(c)
f=[a,b,c]
e=d/len(f)
print(d,round(e,2))

# %%
#43
n=int(input())
print(n<<1)

# %%
#44
a,b=input().split(" ")
print(int(a)<<int(b))

# %%
#45
a,b=input().split(" ")
print(int(a)<int(b))

# %%
#46
a,b=input().split(" ")
print(int(a)==int(b))

# %%
#47
a,b=input().split(" ")
print(int(a)<=int(b))

# %%
#48
a,b=input().split(" ")
print(int(a)!=int(b))

# %%
#49
n=bool(int(input()))
print(n)

# %%
#50
a=bool(int(input()))
print(not a)

# %%
#51
a,b=input().split(" ")
print(bool(int(a)) and bool(int(b)))

# %%
#52
a,b=input().split(" ")
print(bool(int(a)) or bool(int(b)))

# %%
#53
a,b=input().split(" ")
c = bool(int(a))
d = bool(int(b))
print((c and (not d)) or ((not c) and d))

# %%
#54
a,b=input().split(" ")
c = bool(int(a))
d = bool(int(b))
print((c and d) or ((not c) and (not d)))

# %%
#55
a,b=input().split(" ")
c = bool(int(a))
d = bool(int(b))
print((not c) and (not d))

# %%
#56
a=int(input())

# %%
#60
a,b=input().split(" ")
a=int(a)
b=int(b)
c=((a if a>b else b))
print(c)

# %%
#61
a,b,c=input().split(" ")
a=int(a)
b=int(b)
c=int(c)
d=((a if a<b else b) if ((a if a<b else b)<c) else c)
print(d)

# %%
#62
a,b,c=input().split(" ")
a=int(a)
b=int(b)
c=int(c)
if a%2==0:
    print(a)
if b%2==0:
    print(b)
if c%2==0:
    print(c)

# %%
#63
a,b,c=input().split(" ")
a=int(a)
b=int(b)
c=int(c)
if a%2==0 :
    print("even")
else:
    print("odd")
if b%2==0 :
    print("even")
else:
    print("odd")
if c%2==0 :
    print("even")
else:
    print("odd")

# %%
#64
a=int(input())
if a<0 and a%2==0:
    print("A")
if a<0 and a%2!=0:
    print("B")
if a>0 and a%2==0:
    print("C")
if a>0 and a%2!=0:
    print("D")

# %%
#65
n=int(input())
if 100>=n>=90:
    print("A")
elif 90>n>=70:
    print("B")
elif 70>n>=40:
    print("C")
else:
    print("D")

# %%
#66
E=input()
if E=="A":
    print("best!!!")
elif E=="B":
    print("good!!")
elif E=="C":
    print("run!")
elif E=="D":
    print("slowly~")
else:
    print("what?")

# %%
#67
m=int(input())
if m==12 or m==1 or m==2:
    print("winter")
elif m==3 or m==4 or m==5:
    print("spring")
elif m==6 or m==7 or m==8:
    print("summer")
elif m==9 or m==10 or m==11:
    print("fall")

# %%
#68
n=1
while n!=0 :
    n=int(input())
    if n!=0 :
        print(n)

# %%
#69
n=int(input())
while n!=0 :
    print(n)
    n=n-1

# %%
#70
n=int(input())
while n!=0 :
    n=n-1
    print(n)

# %%
#71
c = ord(input())
t = ord("a")
while t<=c:
    print(chr(t),end=" ")
    t+=1

# %%
#72
t=-1
n=int(input())
while t!=n:
    t+=1
    print(t)

# %%
#73
n = int(input())
for i in range(n+1) :
    print(i)

# %%
#74
n=int(input())
s=0
for i in range(1, n+1):
    if i%2==0:
        s+=i
print(s)

# %%
#75
n=0
while n!="q":
    n=input()
    print(n)

# %%
#76
i=0
total=0
n=int(input())
while total<n:
    i+=1
    total+=i
print(i)

# %%
#77
n,m=input().split()
n=int(n)
m=int(m)
for i in range(1, n+1) :
    for j in range(1, m+1) :
        print(i, j) 

# %%
#78
n=int(input(), 16)
for i in range(1,16):
    print("%X" % n, "*%X" % i, "=%X" % (n*i), sep="")

# %%
#79
n=int(input())
for i in range(1, n+1) :
    if "3" in str(i) or "6" in str(i) or "9" in str(i):
        print("X", end=" ")
    else:
        print(i, end=" ")

# %%
#80
R,G,B=map(int,input().split())
for i in range(R):
    for j in range(G):
        for k in range(B):
            print(i,j,k)
print(R*G*B)


