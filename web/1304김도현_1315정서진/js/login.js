const see = document.querySelector("#see");
const password = document.querySelector("#password");
const button = document.querySelector("#button");
const passwordArray = [];

see.addEventListener("change", () => {
  if (password.type === "password") {
    password.type = "text";
  } else if (password.type === "text") {
    password.type = "password";
  }
});

button.addEventListener("click", () => {
  const passwordText = password.value; 

  // 🔍 규칙 설명:
  // (?=.*[a-zA-Z]) : 영어 대소문자 중 최소 하나 포함
  // (?=.*[!@#$%^&*(),.?":{}|<>]) : 지정된 특수문자 중 최소 하나 포함
  // ^[a-zA-Z0-9!@#$%^&*(),.?":{}|<>]+$ : 오직 영어, 숫자, 특수문자만 허용 (한글 등 금지)
  const passwordRegex = /^(?=.*[a-zA-Z])(?=.*[!@#$%^&*(),.?":{}|<>])[a-zA-Z0-9!@#$%^&*(),.?":{}|<>]{8,16}$/;

  if (passwordText === "") {
    alert('비밀번호를 입력해주세요.');
  } 
  // 🔥 정규식 조건에 맞지 않으면 경고!
  else if (!passwordRegex.test(passwordText)) {
    alert('비밀번호는 8~16자이내로 작성하되 영어와 특수문자를 무조건 포함해야 하며, 한글은 사용할 수 없습니다.');
  } 
  else {
    alert('로그인 성공!');
  }
});
