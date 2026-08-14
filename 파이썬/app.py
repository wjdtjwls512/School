assignment_dict = {}

# 1. 우선순위 점수 계산 함수
def cal_score(d_day, ratio):
    return ratio / d_day

# 2. 데이터 입력 함수
def get_data():
    print("\n=== 수행평가 입력 모드 ===")
    while True:
        name = input("과제명을 입력하세요 (이전 메뉴로 돌아가려면 '그만' 입력): ").strip()
        if name == "그만":
            break
        
        if not name:
            print("과제명은 빈칸으로 둘 수 없습니다. 다시 입력해주세요.\n")
            continue
        
        if name in assignment_dict:
            print(f"'{name}'은(는) 이미 존재하는 과제명입니다. 다른 이름으로 입력해주세요.\n")
            continue
            
        try:
            d_day = int(input(f"[{name}] 마감까지 남은 일수(D-Day, 정수 입력): "))
            if d_day <= 0:
                print(f"1 이상의 정수를 입력하세요. 처음부터 다시 입력합니다.\n")
                continue
                
            ratio = int(input(f"[{name}] 성적 반영 비율(%, 정수 입력): "))
            if ratio <= 0:
                print("반영 비율은 1% 이상이어야 합니다. 처음부터 다시 입력합니다.\n")
                continue
                
        except ValueError:
            print("정수로만 정확히 입력해주세요. 처음부터 다시 입력합니다.\n")
            continue
        
        score = cal_score(d_day, ratio)
        assignment_dict[name] = {"d_day": d_day, "ratio": ratio, "score": score, "status": "진행중"}
        print(f"       Saved: {name} (우선순위 점수: {score:.2f}점)\n")

# 3. 정렬 및 출력 함수
def print_rank():
    ongoing_tasks = {name: info for name, info in assignment_dict.items() if info['status'] == "진행중"}
    
    if not ongoing_tasks:
        print("\n  현재 진행 중인 수행평가 과제가 없습니다.")
        return

    print("\n" + "="*40)
    print("     [오늘의 수행평가 우선순위 명단]     ")
    print("="*40)
    
    sorted_tasks = sorted(ongoing_tasks.items(), key=lambda x: x[1]['score'], reverse=True)
    
    for rank, (name, info) in enumerate(sorted_tasks, start=1):
        print(f"{rank}위: {name}")
        print(f"   - 반영비율: {info['ratio']}%, 마감: {info['d_day']}일 남음")
        print(f"   - 우선순위 점수: {info['score']:.2f}점")
        print("-" * 40)

# 4. 과제 완료 처리 함수
def complete_task():
    ongoing_tasks = [name for name, info in assignment_dict.items() if info['status'] == "진행중"]
    
    if not ongoing_tasks:
        print("\n  완료 처리할 진행 중인 과제가 없습니다.")
        return
        
    print("\n 현재 진행 중인 과제 목록:", ongoing_tasks)
    name = input("완료한 과제명을 정확히 입력하세요: ").strip()
    
    if name in assignment_dict and assignment_dict[name]['status'] == "진행중":
        assignment_dict[name]['status'] = "완료"
        print(f"{name} 과제를 완료 처리했습니다. 우선순위 목록에서 제외됩니다.")
    else:
        print("입력하신 과제명을 목록에서 찾을 수 없거나 이미 완료된 과제입니다.")

# 5. 완료된 과제 목록 보기
def print_completed_tasks():
    completed_tasks = [name for name, info in assignment_dict.items() if info['status'] == "완료"]
    
    if not completed_tasks:
        print("\n아직 완료된 과제가 없습니다.")
        return
        
    print("\n" + "✓"*40)
    print("     [완료한 과제들 목록]     ")
    print("✓"*40)
    for name in completed_tasks:
        print(f"{name}")
    print("✓"*40)

# 6. 프로그램 메인 메뉴 제어 루프
def main_menu():
    while True:
        print("\n" + "★"*25)
        print("  수행평가 우선순위 스케줄러")
        print("  1. 새 수행평가 입력하기")
        print("  2. 우선순위 명단 보기")
        print("  3. 과제 완료 처리하기")
        print("  4. 완료된 과제 목록 확인")
        print("  5. 프로그램 종료")
        print("★"*25)
        
        choice = input("원하는 기능의 번호를 입력하세요: ").strip()
        
        if choice == "1":
            get_data()
        elif choice == "2":
            print_rank()
        elif choice == "3":
            complete_task()
        elif choice == "4":
            print_completed_tasks()
        elif choice == "5":
            print("\n 프로그램을 종료합니다.")
            break
        else:
            print("올바른 번호(1~5)를 입력해주세요.\n")

if __name__ == "__main__":
    main_menu()