# %%
class Monster:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def say(self):
        print(f'나는 {self.name}, {self.age}살이다.')

shark=Monster('상어',3)
wolf=Monster('늑대',5)

shark.say()
wolf.say()

# %%
class Student:
    def __init__(self,name,age,score):
        self.name=name
        self.age=age
        self.score=score
    def is_pass(self):
        return self.score>=60
    
stu1=Student('민수',17,90)
stu2=Student('영희',17,65)
stu3=Student('james',17,50)


stu1.is_pass()
stu2.is_pass()
stu3.is_pass()

# %%
class Dog:
    def __init__(self,name,age,kind):
        self.name=name
        self.age=age
        self.kind=kind
    def bark(self):
        print(f'이름은 {self.name} 나이는 {self.age}살 품종은 {self.kind}')
    def sit(self):
        print(f'이름은 {self.name} 나이는 {self.age}살 품종은 {self.kind}')

my_dog=Dog('망고',3,'푸들')

my_dog.bark()

your_dog=Dog('당근',5,'진도')

your_dog.sit()

# %%
class Cat:
    species = '고양이'
    def __init__(self,name,color):
        self.name=name
        self.color=color
    def intro(self):
        print(f'안녕! 나는{self.color}섹 {Cat.species} {self.name}이야')

cat1=Cat('나비','흰')
cat2=Cat('까미','검정')

cat1.intro()
cat2.intro()

# %%
#1
class Person:
    def __init__(self,name):
        self.name=name
p1=Person('홍길동')
p2=Person('이순신')

print(p1.name)
print(p2.name)

# %%
#2
class Animal:
    def __init__(self,name,age):
        self.name=name
        self.age=age
dog=Animal('강아지',3)

print(f'이름: {dog.name} 나이: {dog.age}')

# %%
#3
class Dragon:
    def __init__(self,name):
        self.name=name
    def say(self):
        print(f'나는 {self.name}')

name_=Dragon('드래곤')
name_.say()

# %%
#4
class Student:
    def __init__(self,name,score):
        self.name=name
        self.score=score
    
s1=Student('철수',80)
s2=Student('영희',90)
s3=Student('민수',70)

student=[s1,s2,s3]

for s in student:
    print(s.name,s.score)

# %%
#5
class Score:
    def __init__(self,score):
        self.score=score
    def is_pass(self):
        if self.score>=60:
            print('합격')
        else:
            print('불합격')

s1=Score(70)
s2=Score(50)
s1.is_pass()
s2.is_pass()

# %%
#6
class Student:
    school='소프트웨어고'
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def intro(self):
        print(f'{Student.school} 학생 {self.name}, {self.age}살')

s1=Student('민수',17)
s2=Student('지우',18)

s1.intro()
s2.intro()


# %%
#7
class Book:
    category='도서'
    def __init__(self,title,price):
        self.title=title
        self.price=price
    def discount(self,rate):
        self.price=self.price-self.price*rate
    
    def show(self):
        print(f'{self.title}/{self.price}원/{Book.category}')

b1=Book('파이썬 입문',20000)
b1.discount(0.1)
b1.show()

# %%
#8
class Character:
    game_name='RPG 게임'
    def __init__(self,name,hp):
        self.name=name
        self.hp=hp
    def attack(self,damage):
        self.hp=self.hp-damage
    def status(self):
        print(f'{self.name} HP:{self.hp}({Character.game_name})')

g1=Character('전사',100)
g1.attack(20)
g2=Character('마법사',100)
g2.attack(50)

g1.status()
g2.status()

# %%
#9
class Student:
    school='소마고'
    def __init__(self,name,score):
        self.name=name
        self.score=score
    def intro(self):
        print(f'{Student.school} 학생 {self.name}입니다')
    def add_score(self,point):
        self.score=self.score+point
        print(f'{self.name}의 점수가 {point}점 증가헸습니다')
    def show_score(self):
        print(f'{self.name}의 현재 점수: {self.score}')

s1=Student('철수',80)
s2=Student('영희',90)
s1.intro()
s2.intro()
s1.add_score(10)
s2.add_score(5)
s1.show_score()
s2.show_score()
print(f'학교: {Student.school}')



