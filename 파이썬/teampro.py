import os
from gtts import gTTS

def speak(text):
    filename = "voice.mp3"
    
    # 1. 기존 파일 삭제
    if os.path.exists(filename):
        os.remove(filename)
        
    # 2. gTTS 음성 파일 생성
    tts = gTTS(text=text, lang='ko')
    tts.save(filename)
    
    # 3. 맥북 내장 명령어로 MP3 재생 (에러 없음)
    os.system(f"afplay {filename}")

print("== TTS 음성 출력 프로그램 (종료하려면 'exit' 입력) ==")
while True:
    user_input = input("\n말할 내용을 입력하세요: ")
    
    if user_input.strip() == "exit":
        print("프로그램을 종료합니다.")
        break
        
    if user_input.strip() == "":
        continue
        
    speak(user_input)