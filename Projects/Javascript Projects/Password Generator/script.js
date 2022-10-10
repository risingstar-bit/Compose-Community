const resultEl = document.getElementById('result');
const lengthEl = document.getElementById('length');
const upperCaseEl = document.getElementById('uppercase');
const lowerCaseEl = document.getElementById('lowercase');
const numbersEl = document.getElementById('numbers');
const symbolsEl = document.getElementById('symbols');
const generateEl = document.getElementById('generate');
const clipBoardEl = document.getElementById('clipboard');

//getting the random characters 
const randomFunc ={
    lower: getRandomLower,
    upper: getRandomUpper,
    number: getRandomNumber,
    symbol:getRandomSymbol
};

generateEl.addEventListener('click',()=>{
    const length= +lengthEl.value;
    const hasLower = lowerCaseEl.checked;
    const hasUpper = upperCaseEl.checked;
    const hasNumber = numbersEl.checked;
    const hasSymbol = symbolsEl.checked;

    resultEl.innerText= generatePassword(hasLower,hasUpper,hasNumber,hasSymbol,length);
});


//generating password
function generatePassword(lower,upper,number,symbol,length){
    let generatedPassword="";
    const typesCount= lower+upper+number+symbol;
    const typesArr= [{ lower } , { upper } , { number } , { symbol }].filter
    (
        item => Object.values(item)[0]
    );

    if(typesCount ==0)
    {
        return '';
    }
    let i;
    for(i=0; i<length; i+= typesCount){
        typesArr.forEach(type => {
            const funcName = Object.keys(type)[0];
            //console.log(funcName);

        generatedPassword += randomFunc[funcName]();
        });
    }
    const finalPassword= generatedPassword.slice(0,length);
    return finalPassword;
}

//copy password to clipboard
clipBoardEl.addEventListener('click',() =>{
    const textarea = document.createElement('textarea');
    const password = resultEl.innerText;

    if(!password){
        return;
    }
    textarea.value = password;
    document.body.appendChild(textarea);
    textarea.select();
    document.execCommand('copy');
    textarea.remove();
    alert('Password copied to clipboard');
});

//functions to generate different characters
function getRandomLower(){
    return String.fromCharCode(Math.floor(Math.random()*26)+97);
}
function getRandomUpper(){
    return String.fromCharCode(Math.floor(Math.random()*26)+65);
}
function getRandomNumber(){
    return String.fromCharCode(Math.floor(Math.random()*10)+48);
}
function getRandomSymbol(){
    const symbols ='!@#$%^&*(){}[]=<>/,.';
    return symbols[Math.floor(Math.random()*symbols.length)];
}