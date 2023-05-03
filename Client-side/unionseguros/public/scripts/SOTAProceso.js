
var stage = 0;

window.addEventListener('load', function() {
    var url = global.URL + '/api/soat/vehiculo?placa='+localStorage.getItem("placa");
    fetch(url)
      .then(response => response.json())
      .then(data => {
        console.log(data);
      })
      .catch(error => {
        // Handle the error
        console.error(error);
      });
  });


document.querySelector("#advance").addEventListener("click", function () {
    if (stage == 3) {
        window.location.href = "/SOAT";
    }
    var bar = document.querySelector(".ProgressBar");
    if (bar.querySelectorAll(".is-current").length > 0) {
        const progressBar = document.querySelector('.ProgressBar');
        const currentSteps = progressBar.querySelectorAll('.is-current');
        currentSteps.forEach((step) => {
        step.classList.remove('is-current');
        step.classList.add('is-complete');
        });
        const firstIncompleteStep = progressBar.querySelector('.ProgressBar-step:not(.is-complete)');
        if (firstIncompleteStep) {
        firstIncompleteStep.classList.add('is-current');
        }
    } else {
        const firstStep = bar.querySelector(".ProgressBar-step");
        if (firstStep) {
            firstStep.classList.add("is-current");
        }
    }

    stage = stage + 1;
    console.log(stage);
    changeStage();
});

document.querySelector("#previous").addEventListener("click", function () {

    if (stage == 0) {
        if (confirm("Deseas cancelar el proceso?")) {
            window.location.href = "/SOAT";
            return;
        } else {
           return;
    }
}

    const bar = document.querySelector(".ProgressBar");
    const currentSteps = bar.querySelectorAll(".is-current");
    if (currentSteps.length > 0) {
      currentSteps.forEach(step => {
        step.classList.remove("is-current");
        if (step.previousElementSibling) {
          step.previousElementSibling.classList.remove("is-complete");
          step.previousElementSibling.classList.add("is-current");
        }
      });
    } else {
      const lastCompleteStep = bar.querySelector(".is-complete:last-of-type");
      if (lastCompleteStep) {
        lastCompleteStep.classList.remove("is-complete");
        lastCompleteStep.classList.add("is-current");
      }
    }
    
    stage = stage - 1;
    console.log(stage);
    changeStage();
  });
  
function changeStage(){
    switch(stage){
        case 0:
            document.querySelector(".div-informacion-vehiculo").style.display = "block";
            document.querySelector(".div-plans").style.display = "none";
            document.querySelector(".div-payment").style.display = "none";
            document.querySelector(".div-result").style.display = "none";
            document.querySelector("#descargarConstancia").style.display = "none";
            document.querySelector("#previous").style.display = "block";
            break;
        case 1:
            document.querySelector(".div-informacion-vehiculo").style.display = "none";
            document.querySelector(".div-plans").style.display = "block";
            document.querySelector(".div-payment").style.display = "none";
            document.querySelector(".div-result").style.display = "none";
            document.querySelector("#descargarConstancia").style.display = "none";
            document.querySelector("#previous").style.display = "block";
            break;
        case 2:
            document.querySelector(".div-informacion-vehiculo").style.display = "none";
            document.querySelector(".div-plans").style.display = "none";
            document.querySelector(".div-payment").style.display = "block";
            document.querySelector(".div-result").style.display = "none";
            document.querySelector("#descargarConstancia").style.display = "none";
            document.querySelector("#previous").style.display = "block";
            break;
        case 3:
            document.querySelector(".div-informacion-vehiculo").style.display = "none";
            document.querySelector(".div-plans").style.display = "none";
            document.querySelector(".div-payment").style.display = "none";
            document.querySelector(".div-result").style.display = "block";
            document.querySelector("#descargarConstancia").style.display = "block";
            document.querySelector("#previous").style.display = "none";

            break;
    }
}

function verificacion(){
    switch(stage){
        case 0:
            
            break;
        case 1:
            break;
        case 2:
            break;
        case 3:
            break;
    }
}