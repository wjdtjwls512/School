let now = new Date(); //현재 날짜
let first_day = new Date("2026-03-10"); //시작 날짜

let passtime = now.getTime() - first_day.getTime(); //오늘까지 일수 계산

let passDay = Math.round(passtime / 1000 / 60 / 60 / 24); //오늘까지 지난 시간이 밀리초이므로 '일'로 계산 후 반올림

document.querySelector("#pass_day").innerText = passDay;
