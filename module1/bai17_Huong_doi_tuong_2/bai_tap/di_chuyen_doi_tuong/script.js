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
    return (
      '<img width="' + this.size +'"' +
      ' height="' +this.size +'"' +
      ' src="' + this.image +'"' +
      ' style="top: ' + this.top +"px; left:" + this.left + 'px;position:absolute;" />'
    );
  };

  this.moveRight = function () {
    this.left += this.speed;
    console.log("ok: " + this.left);
  };

  this.moveDown = function () {
    this.top += this.speed;
    console.log("ok: " + this.top);
  };

}

let speedInput = parseInt(prompt("nhập tốc độ bạn muốn"));
var hero = new Hero("lionel-messi-co-the-roi-barca-vao-nam-2021-4bf-5056926.jpg",20,30,speedInput);


let first = setInterval(start, 500);

function start() {
  if (hero.left < window.innerWidth - hero.size) {
    hero.moveRight();
  } else if (hero.top < window.innerHeight - hero.size) {
    hero.moveDown();
  } else clearInterval(first);

  document.getElementById("game").innerHTML = hero.getHeroElement();
}

