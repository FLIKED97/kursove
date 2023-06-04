document.addEventListener("DOMContentLoaded", function (event) {
    let slides = document.getElementsByClassName("slide");
    let currentSlide = 0;
    let prevButton = document.querySelector(".prev-slide");
    let nextButton = document.querySelector(".next-slide");
  
    function showSlide(slideIndex) {
      for (let i = 0; i < slides.length; i++) {
        slides[i].classList.remove("show");
      }
      slides[slideIndex].classList.add("show");
    }
  
    function nextSlide() {
      currentSlide++;
      if (currentSlide >= slides.length) {
        currentSlide = 0;
      }
      showSlide(currentSlide);
    }
  
    function prevSlide() {
      currentSlide--;
      if (currentSlide < 0) {
        currentSlide = slides.length - 1;
      }
      showSlide(currentSlide);
    }
  
    showSlide(currentSlide); // Показати перший слайд
  
    nextButton.addEventListener("click", nextSlide);
    prevButton.addEventListener("click", prevSlide);
  });

  var callBackLink = document.getElementById('callBack');

  callBackLink.addEventListener('click', function(event) {
      event.preventDefault(); // Це додається для того, щоб уникнути переходу за замовчуванням на іншу сторінку

      // Додайте код, який виконується при натисканні на посилання "Оформити замовлення"
      // Наприклад, ви можете перенаправити користувача на іншу сторінку:
      window.location.href = 'form.html';
  });