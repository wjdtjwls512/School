// let join = document.querySelector("#h_box3");

// join.onclick = function () {
//   join.style.color = "green";
// };

// alert('안녕하세요?')

// let reply = confirm('정말 배경이미지를 바꾸시겠습니까?')

// let name = prompt('이름을 입력하세요.', '홍길동')
// let name = prompt('이름을 입력하세요.')

// document.write('안녕하세요 홍길동님 환영합니다')

// let width;
// let height;
// width = 200;
// height = 50;
// let area = width * height;
// console.log(area);

// const pi = 3.14;
// let r = prompt("반지름을 입력하세요.");
// let area = pi * r * r;
// console.log(area);

// 3의 배수 확인하기1

// const number = parseInt(prompt());

//   if (number % 3 == 0) {
//     console.log("3의 배수입니다");
//   } else {
//     console.log("3의 배수가 아닙니다");
//   }

//3의 배수 확인하기2

// const number = prompt();

// if (number != null) {
//   if (number % 3 == 0) {
//     console.log("3의 배수입니다");
//   } else {
//     console.log("3의 배수가 아닙니다");
//   }
// } else {
//   console.log("입력 취소");
// }

//3의 배수 확인하기3

// const number = prompt();

// if (number != null) {
//   (parseInt(number) % 3 == 0) ? console.log('3의 배수') : console.log('3의 배수 아님')
// } else {
//   console.log("입력 취소");
// }

//자격증 합격 여부 판단하기

// const a = parseInt(prompt('a과목 점수를 입력하세요'));
// const b = parseInt(prompt('b과목 점수를 입력하세요'));
// const c = parseInt(prompt('c과목 점수를 입력하세요'));

// const avg = (a + b + c) / 3;

// if (avg >= 60 && a >= 40 && b >= 40 && c >= 40) {
//   console.log("합격");
// } else {
//   console.log("불합격");
// }

//switch문으로 조건 체크하기

// let session = prompt("관심 세션을 선택해주세요. 1-마케팅, 2-개발, 3-디자인");

// switch (session) {
//   case "1":
//     document.write("마케팅 세션은 <b>201호</b>에서 진행됩니다.");
//     break;
//   case "2":
//     document.write("개발 세션은 <b>203호</b>에서 진행됩니다.");
//     break;
//   case "3":
//     document.write("디자인 세션은 <b>205호</b>에서 진행됩니다.");
//     break;
//   default:
//     alert("잘못 입력 했습니다.");
// }

//for문을 사용해 1~50까지 더하기

// let sum = 0;
// for (let i = 1; i <= 50; i++){
//     sum+=i
// }

// document.write(`1부터 50까지 더하면 ${sum}`)

//for문을 사용해 30~1까지 더하기

// let sum = 0;
// for (let i = 30; i >= 1; i--) {
//   sum += i;
// }

// document.write(`30부터 1까지 더하면 ${sum}`);

//for문을 이용허여 구구단 작성

// for (let i = 2; i <= 9; i++) {
//   for (let j = 1; j <= 9; j++) {
//     document.write(`${i} x ${j} = ${i * j}<br>`);
//   }
// }

//while문으로 * 표시하기
// let star = parseInt(prompt());

// while (star > 0) {
//   document.write("*");
//   star--;
// }

//do~while문으로 * 표시하기
// let star = parseInt(prompt());

// do {
//   document.write("*");
//   star--;
// } while (star > 0);

// let number = parseInt(prompt());
// let count = 0;

// for (let i = 1; i <= number; i++) {
//   if (i % 7 == 0) {
//     document.write(`${i}<br>`);
//     count++;
//   }
// }
// document.write(`1에서 부터 ${number}까지 7의 배수 개수는 ${count}개`);

//두 수를 만들고 곱하는 함수 실행하기

// function mulNumber() {
//   let num1 = 2;
//   let num2 = 3;
//   let mul = num1 * num2;
//   console.log(`${mul}`);
// }

// function mulNumber2(n1, n2) {
//   let mul = n1 * n2;
//   console.log(`${mul}`);
// }

// mulNumber();
// mulNumber2(2, 5);
// mulNumber2(8, 7);
// mulNumber();

// function addNumber(num1 = 7, num2 = 9) {
//   let sum = num1 + num2;
//   return sum;
// }

// let result = addNumber(2, 3);
// let result2 = addNumber();
// let result3 = addNumber(5);
// console.log(result);
// console.log(result2);
// console.log(result3);

//익명함수
// let sum = function (a, b) {
//   return a + b;
// };

// console.log(`함수 실행 결과: ${sum(10,20)}`)

//즉시실행함수
// (function (a, b) {
//   sum = a + b;
// })(100, 200);
// console.log(`함수 실행 결과: ${sum}`)

// const hi = () => {alert('안녕하세요')};

// let sum = (a, b) => a + b;