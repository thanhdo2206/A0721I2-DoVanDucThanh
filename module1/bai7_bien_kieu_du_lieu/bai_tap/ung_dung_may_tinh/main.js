var $ = document.querySelector.bind(document);
var $$ = document.querySelectorAll.bind(document);

let number = $$('.number_input');
let calItem = $$('#calculation-item');
let result = $ ('.result');

calItem.forEach(item => {
    item.addEventListener('click',event=>{
        event.preventDefault();
        let number_a = parseFloat(number[0].value);
        let number_b = parseFloat(number[1].value);

        let classCal = event.target.classList.value;
        let ket_qua;
        switch(classCal){
            case 'add': ket_qua = number_a+number_b;break;
            case 'sub': ket_qua= number_a-number_b;break;
            case 'mul': ket_qua = number_a*number_b;break;
            case 'div' : ket_qua = number_a/number_b;break;
        }

        result.innerText = ket_qua;

    })
});