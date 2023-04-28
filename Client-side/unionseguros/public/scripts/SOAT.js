// Función para desplegar o compactar la respuesta de una pregunta
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

    window.location.href = "/SOATPRoceso";
});

function verificacion(){
    var placa = document.querySelector("#txt-placa").value;
    var documento = document.querySelector("#txt-documento").value;
    var tipoDocumento = document.querySelector("#select-documento").value;

    if (tipoDocumento == ""){
        alert("Por favor elegir el tipo de documento.");
        return true;
    }

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
        }
    }



    if (placa == "" || placa.length !== 6 || !/^[A-Z0-9]+$/.test(placa)){
        alert("Por favor ingrese la placa correcta.");
        return true;
    }

    

    
    return false
}

