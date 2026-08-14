// 배열 함수 지정

const questions = ["Q1/5", "Q2/5", "Q3/5", "Q4/5", "Q5/5"];

const quizzes = [
  { q: "음식물 쓰레기는 환경오염의 원인이다", a: true },
  {
    q: "음식물 쓰레기를 매립할 때 발생하는 가스는 온실효과의 주범이다",
    a: true,
  },
  { q: "전 세계에서 생산되는 음식물의 3분의 1은 먹지 않고 버려진다", a: true },
  {
    q: "학교 급식에서 잔반을 조금 남기는 것은 환경에 거의 영향을 주지 않는다",
    a: false,
  },
  { q: "과일 껍질이나 채소 뿌리는 가축의 사료로 재활용할 수 없다", a: false },
];

const quizzesOExplanation = [
  "맞습니다! 음식물 쓰레기는 부패하면서 토양오염은 물론 심각한 수질오염을 일으킵니다.",
  "정답입니다! 매립된 음식물이 썩으면서 이산화탄소보다 20배 이상 강력한 온실가스인 '메탄가스'가 배출됩니다.",
  "정답입니다! 유엔환경계획(UNEP)에 따르면 매년 전 세계 음식물의 약 33%가 그냥 버려져 엄청난 자원이 낭비됩니다.",
  "올바른 생각입니다! 전교생이 남긴 잔반을 모으면 매일 엄청난 양이 되므로 나부터 다 먹는 실천이 중요합니다.",
  "정답입니다! 수분이 많고 부드러운 과일 껍질이나 채소 뿌리는 가공 후 훌륭한 사료나 퇴비가 될 수 있습니다.",
];

const quizzesXExplanation = [
  "틀렸습니다! 음식물 쓰레기는 처리 과정에서 막대한 온실가스를 배출하는 주요 환경오염 원인입니다.",
  "틀렸습니다! 음식물 쓰레기 매립 시 지구온난화를 가속화하는 주범인 '메탄가스'가 대량으로 발생합니다.",
  "틀렸습니다! 전 세계에서 생산되는 음식의 무려 3분의 1(약 13억 톤)이 손을 대지도 않은 채 버려지고 있습니다.",
  "아쉽습니다! 한 사람의 잔반은 적어 보여도 모이면 수십kg이 됩니다. 작은 잔반도 환경에 큰 영향을 줍니다.",
  "아쉽습니다! 딱딱한 씨앗이나 껍질을 제외한 일반적인 과일 껍질과 채소 뿌리는 사료로 재활용이 가능합니다.",
];

const quizScore = ["0 / 5", "1 / 5", "2 / 5", "3 / 5", "4 / 5", "5 / 5"];

const scoreMessages = [
  "아쉽습니다! 음식물 쓰레기와 환경 문제에 조금 더 관심을 가져볼까요?",
  "조금 더 분발해 봐요! 우리 작은 실천이 지구를 살리는 첫걸음입니다.",
  "기본적인 환경 지식을 가지고 계시군요! 조금만 더 실천해 보아요.",
  "좋은 성적입니다! 평소에 환경 보호에 관심이 많으시군요?",
  "훌륭합니다! 환경을 사랑하는 따뜻한 마음이 고스란히 느껴져요.",
  "완벽합니다! 당신은 진정한 지구 지킴이, 환경 전문가이시군요!",
];

//함수 지정

const O = document.querySelector("#O");
const X = document.querySelector("#X");
const button = document.querySelector(".next_quiz");
const quizExplanationBox = document.querySelector(".quiz_explanation_box");
const quizExplanation = document.querySelector(".quiz_explanation");
const quizExplanationText = document.querySelector(".quiz_explanation_text");
const questionsNumbers = document.querySelector(".questions");
const quizForm = document.querySelector(".quiz_form");
const contents = document.querySelector(".contents");
const result = document.querySelector(".result");
const answer = document.querySelectorAll(".answer");
const oxQuizResult = document.querySelector(".ox_quiz_result");
const progress = document.querySelector(".progress");
const scoreMessage = document.querySelector(".score_message");
const retry = document.querySelector(".retry");
const oxQuizArea = document.querySelector(".ox_quiz_area");
const quizQuestion = document.querySelector(".quiz_question");
const answerListArea = document.querySelector(".answer_list_area");
const a1 = document.querySelector("#a1");
const a2 = document.querySelector("#a2");
const a3 = document.querySelector("#a3");
const a4 = document.querySelector("#a4");
const a5 = document.querySelector("#a5");
const q1 = document.querySelector("#q1");
const q2 = document.querySelector("#q2");
const q3 = document.querySelector("#q3");
const q4 = document.querySelector("#q4");
const q5 = document.querySelector("#q5");

const answerListBox = [a1, a2, a3, a4, a5];
const questionListBox = [q1, q2, q3, q4, q5];

let number = 0;
let score = 0;

// 기본 텍스트 삽입

questionsNumbers.innerText = questions[0];
contents.innerText = quizzes[0].q;
button.innerText = "다음";

// 다음 콘텐츠로 넘어가는 함수

function nextContent() {
  questionListBox[number].innerText = quizzes[number].q;
  number++; // number 함수를 1씩증가시킴
  questionsNumbers.innerText = questions[number];
  if (number < quizzes.length) {
    contents.innerText = quizzes[number].q; // number 함수를 인덱스값에 넣어서 다음 퀴즈를 보여줄 수 있도록 함
  }
}

// 버튼 클릭시 작동
button.addEventListener("click", () => {
  nextContent(); // 함수 실행
  quizExplanationBox.style.display = "none";
  quizForm.reset(); // 폼 리셋 함수
  quizExplanationText.style.display = "none";
  if (number == questions.length - 1) {
    button.innerText = "결과보기"; // 마지막 문제가 되면 텍스트를 결과보기로 변경
  }
  answer.forEach((answer) => {
    answer.classList.remove("disabled"); // 다음 버튼을 누르면 퀴즈 클릭 가능
  });
  if (number == questions.length) {
    // 마지막 문제를 넘어가면 결과창 출력
    oxQuizArea.style.display = "none";
    oxQuizResult.style.display = "flex";
    answerListArea.style.display = "block";
    result.innerText = quizScore[score]; // score 함수 인덱스 출력
    progressbar(); // 함수 실행
  }
});

// 맞다 를 선택할때 작동
O.addEventListener("click", () => {
  if (O.classList.contains("disabled") || X.classList.contains("disabled"))
    return;
  answer.forEach((btn) => btn.classList.add("disabled")); // 한번 누르면 재선택을 막음
  quizExplanationBox.style.display = "block";
  quizExplanationText.style.display = "block";
  if (number < quizzes.length) {
    if (quizzes[number].a == true) {
      // 맞다 를 눌러서 정답을 맞혔을때
      quizExplanationText.innerText = quizzesOExplanation[number]; // 해설 삽입
      quizExplanation.style.backgroundColor = "#F0FDF4";
      answerListBox[number].style.backgroundColor = "#F0FDF4";
      score++;
    } else {
      // 틀렸을때
      quizExplanationText.innerText = quizzesXExplanation[number]; // 해설 삽입
      quizExplanation.style.backgroundColor = "#FEF2F2";
      answerListBox[number].style.backgroundColor = "#FEF2F2";
    }
  }
});

// 아니다 를 선택할때 작동
X.addEventListener("click", () => {
  if (O.classList.contains("disabled") || X.classList.contains("disabled"))
    return;
  answer.forEach((btn) => btn.classList.add("disabled")); // 한번 누르면 재선택을 막음
  quizExplanationBox.style.display = "block";
  quizExplanationText.style.display = "block";
  if (number < quizzes.length) {
    if (quizzes[number].a == false) {
      // 아니다 를 눌러서 정답을 맞혔을때
      quizExplanationText.innerText = quizzesOExplanation[number]; // 해설 삽입
      quizExplanation.style.backgroundColor = "#F0FDF4";
      answerListBox[number].style.backgroundColor = "#F0FDF4";
      score++;
    } else {
      // 틀렸을때
      quizExplanationText.innerText = quizzesXExplanation[number]; // 해설 삽입
      quizExplanation.style.backgroundColor = "#FEF2F2";
      answerListBox[number].style.backgroundColor = "#FEF2F2";
    }
  }
});

// 다시하기 버튼을 눌렀을 시 작동
retry.addEventListener("click", () => {
  location.reload(); // 창 새로고침 함수
});

// 점수에 따른 프로그레스바 함수
function progressbar() {
  if (score === 0) {
    // 0점일때
    progress.style.width = "0%";
  } else if (score === 1) {
    // 1점일때
    progress.style.width = "20%";
  } else if (score === 2) {
    // 2점일때
    progress.style.width = "40%";
  } else if (score === 3) {
    // 3점일때
    progress.style.width = "60%";
  } else if (score === 4) {
    // 4점일때
    progress.style.width = "80%";
  } else if (score === 5) {
    // 5점일때
    progress.style.width = "100%";
  }
  scoreMessage.innerText = scoreMessages[score]; // 점수에 알맞은 메세지 출력
}
