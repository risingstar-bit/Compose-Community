//Detecting Button Press

var totalDrum=document.querySelectorAll(".drum").length;

for(var i=0;i<totalDrum;i++){

  document.querySelectorAll(".drum")[i].addEventListener("click",function (){
          //what to do when click detected

          var buttonInnerHTML= this.innerHTML;
   makeSound(buttonInnerHTML);
   buttonAnimation(buttonInnerHTML);
  }
  );
}

//Detecting keyboard press

document.addEventListener("keydown",function(event){
  makeSound(event.key);
  buttonAnimation(event.key);
});


function makeSound(key){

  switch (key) {
    case "j":
         var audio = new Audio("sounds/tom-1.mp3");
         audio.play();
      break;

    case "k":
           var audio = new Audio("sounds/tom-2.mp3");
           audio.play();
        break;
   case "l":
             var audio = new Audio("sounds/tom-3.mp3");
             audio.play();
          break;
   case "d":
               var audio = new Audio("sounds/tom-4.mp3");
               audio.play();
            break;
   case "w":
                 var audio = new Audio("sounds/crash.mp3");
                 audio.play();
              break;
   case "s":
                   var audio = new Audio("sounds/snare.mp3");
                   audio.play();
                break;
   case "a":
                     var audio = new Audio("sounds/kick-bass.mp3");
                     audio.play();
                  break;

    default: console.log(key);

  }
}

function buttonAnimation(currentKey){
     var activeButton= document.querySelector("."+currentKey);
     activeButton.classList.add("pressed");

     setTimeout(function (){
       activeButton.classList.remove("pressed");
     },100);
}
