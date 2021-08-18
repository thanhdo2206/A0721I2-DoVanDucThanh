let table = document.getElementById('mul_table');

let x="" ;
for (let i=1;i<10;i++){
    let text = " ";
    for(let j=2;j<10;j++){
        let result = j*i;
        text += `<td>${j} x ${i} = ${result}</td>`;
    }
    x += `<tr>${text}</tr>`;
}

table.innerHTML = x;