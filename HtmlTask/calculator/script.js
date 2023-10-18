const buttonVal = document.querySelector('.number-container')
const inputfield = document.querySelector('#input-num')

buttonVal.addEventListener('click', calc);

let str = ""
function calc(e){
    if(e.target.innerText === "AC"){
        str = "";
        inputfield.value = str;
    }else if(e.target.innerText === "="){
        inputfield.value = eval(str)
    }else{
        str += e.target.innerText;
        inputfield.value = str;
    }
   
}
