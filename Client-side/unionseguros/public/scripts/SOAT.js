//Q&A
function toggleAnswer(answerId) {
    var answer = document.getElementById('answer' + answerId);
    var toggleIcon = document.getElementById('toggle-icon' + answerId);
    if (answer.style.display === 'block') {
        answer.style.display = 'none';
        toggleIcon.classList.remove('active');
    } else {
        answer.style.display = 'block';
        toggleIcon.classList.add('active');
    }
}

document.querySelector("#cotizar").addEventListener("click", function () {

    if (verificacion()){
        return;
    }

    localStorage.setItem("placa", document.querySelector("#txt-placa").value);
    localStorage.setItem("documento", document.querySelector("#txt-documento").value);
    localStorage.setItem("tipoDocumento", document.querySelector("#select-documento").value);

    window.location.href = "/SOATPRoceso";
});

function verificacion(){
    var placa = document.querySelector("#txt-placa").value;
    var documento = document.querySelector("#txt-documento").value;
    var tipoDocumento = document.querySelector("#select-documento").value;


    if (documento == ""){
        alert("Por favor ingrese el documento correcto.");
        return true;
    }else{
        if (tipoDocumento == "DNI" && (documento.length !== 8 || !/^[0-9]+$/.test(documento))){
            alert("Por favor ingrese el documento correcto.");
            return true;
        }else if (tipoDocumento == "CE" && (documento.length !== 9 || !/^[0-9]+$/.test(documento))){
            alert("Por favor ingrese el documento correcto.");
            return true;
        }else if (tipoDocumento == "RUC" && (documento.length !== 11 || !/^[0-9]+$/.test(documento))
                  || (documento.substring(0, 2) !== "10" && documento.substring(0, 2) !== "20")){
            alert("Por favor ingrese el documento correcto.");
            return true;
        }
    }

    if (placa == "" || placa.length !== 6 || !/^[A-Za-z0-9]+$/.test(placa)){
        alert("Por favor ingrese la placa correcta.");
        return true;
    }  
    return false
}

