/**
 * 네임스페이스 오염 방지를 위해 모든 메뉴 제어 로직을 캡슐화한 객체
 */
const MenuManager = {
  // DOM 엘리먼트 캐시
  toggleBtn: null,
  menuBar: null,
  menuItems: null,

  init: function () {
    this.toggleBtn = document.getElementById('menu_toggle');
    this.menuBar = document.getElementById('menu_bar');
    this.menuItems = document.querySelectorAll('.menu_item');

    this.bindEvents();
  },

  bindEvents: function () {
    if (!this.toggleBtn) return;

    // 1. 모바일 토글 버튼 클릭 이벤트
    this.toggleBtn.addEventListener('click', () => {
      this.menuBar.classList.toggle('active');
    });

    // 2. 모바일 아코디언 서브메뉴 제어
    this.menuItems.forEach((item) => {
      const link = item.querySelector(':scope > a'); // 직속 상위 대메뉴 <a>만 타겟팅
      if (!link) return;

      link.addEventListener('click', (e) => {
        // 모바일 환경(768px 이하)에서만 아코디언 동작 구현
        if (window.innerWidth <= 768) {
          e.preventDefault(); // <a> 태그 기본 이동 막기

          // 클릭한 메뉴 외에 다른 열려있는 메뉴는 모두 닫음 (Exclusive Accordion)
          this.menuItems.forEach((otherItem) => {
            if (otherItem !== item) {
              otherItem.classList.remove('open');
            }
          });

          item.classList.toggle('open');
        }
      });
    });
  },
};

// DOM 파싱이 완료된 후 안전하게 스크립트 실행
document.addEventListener('DOMContentLoaded', () => {
  MenuManager.init();
});