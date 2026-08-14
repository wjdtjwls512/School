import random
select=["가위","바위","보"]
computer=random.choice(select)

again=input("계속하시겠습니까?(y or n)")
while True:
    if again=="y":




        me=input("가위 바위 보중 하나를 선택: ")

        if me=="가위" and computer=="보" or me=="바위" and computer=="가위" or me=="보" and computer=="바위":
            print("당신이 이김")
        elif me=="가위" and computer=="바위" or me=="바위" and computer=="보" or me=="보" and computer=="가위":
            print("컴퓨터가 이김")
        elif me==computer:
            print("비겼습니다")
        else:
            print("잘못된 입력입니다")

        print("나는 %s를 선택"%me)
        print("컴퓨터는 %s를 선택"%computer)
    else:
        break