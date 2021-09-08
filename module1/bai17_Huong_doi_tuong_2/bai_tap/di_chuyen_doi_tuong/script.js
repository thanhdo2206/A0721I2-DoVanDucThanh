/**
 * Created by nhatnk on 4/26/17.
 */

function Hero(image, top, left, speed) {
  this.image = image;
  this.top = top;
  this.left = left;
  this.size = 200;
  this.speed = speed;

  this.getHeroElement = function () {
    return '<img width="' + this.size + '"' +
      ' height="' + this.size + '"' +
      ' src="' + this.image + '"' +
      ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
  }

  this.moveRight = function () {
    this.left += this.speed;
    console.log('ok: ' + this.left);
  }

  this.moveDown = function () {
    this.top += this.speed;
    console.log('ok: ' + this.top);
  }

  this.moveLeft = function () {
    this.left -= this.speed;
    console.log('ok: ' + this.left);
  }

  this.moveUp = function () {
    this.top -= this.speed;
    console.log('ok: ' + this.top);
  }

}

let speedInput = parseInt(prompt("nhập tốc độ bạn muốn"));
var hero = new Hero('lionel-messi-co-the-roi-barca-vao-nam-2021-4bf-5056926.jpg', 20, 30, speedInput);

//dịch phải left lúc sau lớn hơn left lúc đầu
//dịch trái left lúc sau bé hơn left lúc đầu
let leftCurrent = 0;
// hero.moveRight();

function start() {

  if (hero.left < window.innerWidth - hero.size) {

    if (leftCurrent < hero.left) {
      leftCurrent = hero.left;
      hero.moveRight();

    }


  } else if (hero.top < window.innerHeight - hero.size) hero.moveDown();
  else if (hero.left !== 0) {
    hero.moveLeft();
    // leftCurrent = hero.left;
  }
  // else if (hero.top !== 0) hero.moveUp();


  

  document.getElementById('game').innerHTML = hero.getHeroElement();


  setTimeout(start, 500);
}

start();