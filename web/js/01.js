const text = document.querySelector(".text");
const btn = document.querySelector(".btn");
const box = document.querySelector(".box");

btn.addEventListener("click", () => {
  async function getData() {
    try {
      const response = await fetch(
        "https://jsonplaceholder.typicode.com/posts/1",
      );
      const data = await response.json();
      text.innerText = data.title;
      console.log(data);
    } catch (error) {
      text.innerText = error.message;
    }
  }
  getData();
});

box.addEventListener("mouseenter", () => {
  btn.style.display = "block";
});
box.addEventListener("mouseleave", () => {
  btn.style.display = "none";
});

const cursor = document.querySelector(".cursor");

// 🌍 화면 전체(document)에서 마우스 클릭(click)을 감시합니다.
document.addEventListener("mousemove", (e) => {
  // e.clientX: 클릭한 위치의 가로(X) 좌표
  // e.clientY: 클릭한 위치의 세로(Y) 좌표
  const mouseX = e.clientX;
  const mouseY = e.clientY;

  // 🔥 클릭한 위치로 동그라미를 transform 시킵니다!
  // -10을 해주는 것은 동그라미의 정중앙이 클릭 위치에 오도록 조정하는 것입니다.
  cursor.style.transform = `translate(${mouseX - 10}px, ${mouseY - 10}px)`;
});
