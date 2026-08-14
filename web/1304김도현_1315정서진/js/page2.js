// 함수 지정
const imageInput = document.getElementById("img_input");
const preview = document.getElementById("preview");
const inputText = document.querySelector("#input_text");
const imageLabel = document.querySelector('label[for="img_input"]');
const button = document.querySelector("#submit");
const good = document.querySelector("#good");

imageInput.addEventListener("change", function (event) {
  const file = event.target.files[0];

  if (file) {
    const reader = new FileReader();

    reader.onload = function (e) {
      preview.src = e.target.result;
      preview.style.display = "block"; // 이미지를 보이게 처리

// 이미지를 올리면 'has-image'클래스추가
      if (imageLabel) {
        imageLabel.classList.add("has-image");
      }
    };

    reader.readAsDataURL(file); // 파일을 읽어 데이터 URL로 변환
  }
// 버튼을 클릭하면 도장 찍어줌
  button.addEventListener("click", () => {
    preview.style.display = "none";
    inputText.style.display = "none";
    good.style.display = "block";
    button.style.display = "none";
  });
});

