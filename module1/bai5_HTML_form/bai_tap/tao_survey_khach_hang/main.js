
var $ = document.querySelector.bind(document);
var $$ = document.querySelectorAll.bind(document);

var other = $('.other');
var maxLength = $('.max_length');
var sex = $$('input[name= "sex"]');

sex.forEach((item, index) => {
    item.addEventListener('click', (event) => {
        if (item.classList.contains('other')) {
            maxLength.style.display = 'block';
        }
        else {
            maxLength.style.display = 'none';

        }

    })
})

var otherText = $('.other_text');
var lengthWord = $('.length_word');
otherText.addEventListener('keyup', (event) => {
    var text = event.target.value;
    var lengthText =text.length;
    lengthWord.innerText = lengthText;

})


otherText.addEventListener('click', () => {
    maxLength.style.display = 'block';
    other.checked = 'true';
})



var formItems = $$('.form_item');
formItems.forEach((item, index) => {

    item.addEventListener('click', (event) => {
        $('.form_item.active').classList.remove('active');
        item.classList.add('active');


    })
})

