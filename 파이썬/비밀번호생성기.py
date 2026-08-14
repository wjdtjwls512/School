import os, random
from gtts import gTTS

# 아스키 아트 출력
def ascii_art():
    print("""
========================================================================================================
████   ███   ████  ████ █   █  ███  ████  ████      ███  █████ █   █ █████ ████   ███  █████  ███  ████
█   █ █   █ █     █     █   █ █   █ █   █ █   █    █     █     ██  █ █     █   █ █   █   █   █   █ █   █
████  █████  ███   ███  █ █ █ █   █ ████  █   █    █  ██ ████  █ █ █ ████  ████  █████   █   █   █ ████
█     █   █     █     █ ██ ██ █   █ █  █  █   █    █   █ █     █  ██ █     █  █  █   █   █   █   █ █  █
█     █   █ ████  ████  █   █  ███  █   █ ████      ███  █████ █   █ █████ █   █ █   █   █    ███  █   █
========================================================================================================
""")

# 터미널 화면 지우기
def clear_terminal():
    os.system('cls' if os.name == 'nt' else 'clear')

# y 또는 n만 입력받기 위한 함수
def get_yn(message):
    while True:
        value = input(message).lower()

        if value in ['y', 'n']:
            return value

        print("[오류] y 또는 n만 입력해주세요.")

# 기존 비밀번호 저장 기능 함수
def past_password(service, text):
    mode = "a" if os.path.exists("password.txt") else "w"
    
    with open("password.txt", mode, encoding="utf-8") as file:
        file.write(f"\n\n{service}: {text}")
        
    print(f"\n[알림] password.txt에 기록 완료!")

# 비밀번호를 자연스럽게 발음해 주는 함수
def speak(text):
    read_text = ''.join(ch for ch in text if ch.isalpha()).lower()

    tts = gTTS(text=f"Your password is {read_text}", lang='en')
    tts.save("temp.mp3")

    if os.name == 'nt':
        os.system("start temp.mp3")
    else:
        os.system("afplay temp.mp3")
        os.remove("temp.mp3")

# 비밀번호 생성에 사용할 문자 목록
consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'v', 'w', 'z']
vowels = ['a', 'e', 'i', 'o', 'u']
special_chars = ['!', '@', '#', '$', '%', '^', '&', '*']

# 비밀번호 생성 함수
def make_password(length, upper, special, item_repeat):
    while True:
        result = []

        for i in range(length):
            if i % 2 == 0:
                result.append(random.choice(consonants))
            else:
                result.append(random.choice(vowels))

        if item_repeat == 'n':
            is_bad = False

            for i in range(len(result) - 1):
                if result[i] == result[i + 1]:
                    is_bad = True
                    break

            if is_bad:
                continue

        if upper == 'y':
            result[0] = result[0].upper()

        if special == 'y':
            result.append(random.choice(special_chars))

        return "".join(result)

# 비밀번호 보안등급 판별 함수
def check_level(password, upper, special):
    length = len(password)
    score = length
    
    if upper == 'y': 
        score += 2    
    if special == 'y': 
        score += 2  

    if score >= 12:
        return "강함 (안전)"
    elif score >= 7:
        return "보통 (적정)"
    else:
        return "약함 (위험)"


# =====================
# 입력
# =====================

clear_terminal()
ascii_art()
if os.path.exists("password.txt"):
    with open("password.txt", "r", encoding="utf-8") as file:
        lines = file.read().strip()
        
    if lines:  # 파일 안에 내용이 있을 때만 조회 여부 확인
        print(" [안내] 기존에 저장된 비밀번호 기록이 있습니다.")
        view_old = get_yn(" 기존 저장된 비밀번호 목록을 조회하시겠습니까? (y/n): ")
        
        if view_old == 'y':
            print("\n==================== 기존 비밀번호 목록 ====================")
            print(lines)
            print("============================================================\n")
            input("확인하셨다면 [Enter] 키를 눌러 새 비밀번호 생성으로 넘어갑니다...")
            clear_terminal()
            ascii_art()
    else:
        print(" [안내] 저장된 비밀번호가 없습니다. 새 비밀번호 생성을 시작합니다.\n")
else:
    print(" [안내] 저장된 비밀번호가 없습니다. 새 비밀번호 생성을 시작합니다.\n")

while True:
    try:
        input_len = int(input("비밀번호 길이를 입력하시오 (4~20): "))

        if input_len < 4:
            print("[오류] 4자 이상 입력해주세요.")
            continue

        if input_len > 20:
            print("[오류] 최대 길이는 20자입니다.")
            continue

        break

    except ValueError:
        print("[오류] 숫자만 입력해주세요.")

input_upper = get_yn("\n대문자 유무(있으면 y 아니면 n): ")
input_special = get_yn("\n특수문자 유무(있으면 y 아니면 n): ")
input_repeat = get_yn("\n연속된 문자 허용(되면 y 아니면 n): ")

while True:
    try:
        input_count = int(input("\n추천받을 비밀번호 개수(1~5): "))

        if 1 <= input_count <= 5:
            break

        print("[오류] 1~5 사이의 숫자를 입력해주세요.")

    except ValueError:
        print("[오류] 숫자만 입력해주세요.")


# =====================
# 처리
# =====================

# 생성된 비밀번호를 저장할 리스트
passwords = []

# 원하는 개수만큼 비밀번호 생성
for _ in range(input_count):
    passwords.append(
        make_password(
            input_len,
            input_upper,
            input_special,
            input_repeat
        )
    )

clear_terminal()

# 추천 비밀번호 목록 출력
print("========================================================================================================")
print("추천 비밀번호 목록")
print("========================================================================================================")

for idx, pw in enumerate(passwords, start=1):
    level = check_level(
        pw,
        input_upper,
        input_special
    )

    print(f"{idx}. {pw}")
    print(f"   보안등급 : {level}")
    print()

# 사용할 비밀번호 선택
while True:
    try:
        choice = int(input("사용할 비밀번호 번호를 선택하세요: "))

        if 1 <= choice <= len(passwords):
            break

        print("[오류] 목록에 있는 번호를 입력해주세요.")

    except ValueError:
        print("[오류] 숫자만 입력해주세요.")

# 선택한 비밀번호 저장
my_password = passwords[choice - 1]


# =====================
# 출력
# =====================

clear_terminal()

# 최종 선택 결과 출력
print("\n========================================================================================================")
print(f"선택한 비밀번호 : {my_password}")
print(f"보안등급 : {check_level(my_password, input_upper, input_special)}")
print("========================================================================================================")


# =====================
# 음성 안내 기능
# =====================

voice_choice = get_yn("\n[안내] 비밀번호 발음을 들어보시겠습니까? (y/n): ")

if voice_choice == 'y':

    while True:
        print("\n음성을 재생합니다...")
        
        # 선택한 비밀번호 발음 재생
        speak(my_password)

        again = get_yn("\n[안내] 다시 들어보시겠습니까? (y/n): ")

        if again == 'n':
            break
        
save_password = get_yn("\n[안내] 생성한 비밀번호를 저장하겠습니까? (y/n): ")


if save_password == 'y':
    service = input("이 비밀번호를 사용할 서비스 입력: ")
    past_password(service, my_password)

print('\n프로그램 종료')