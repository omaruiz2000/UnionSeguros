// const GLOBAL_URL = 'https://apimocha.com/unionseguros';
const GLOBAL_URL = 'http://localhost:8080/api/v1';

var stage = 0;

window.onload = function () {
    localStorage.setItem("idCliente", 0);
    localStorage.setItem("idVehiculo", 0);


    document.querySelector("#dpFecha").value = new Date().toISOString().split("T")[0];

    const today = new Date();

    document.querySelector("#dpFecha").min = today.toISOString().split("T")[0];

    //vehiculo
    fetch(GLOBAL_URL + '/marcaVehiculo/listarTodas')
        .then(response => response.json())
        .then(data => {
            data.forEach(element => {
                var _option = document.createElement("option");
                _option.value = element.id;
                _option.text = element.marca;
                document.querySelector("#select-marca").appendChild(_option);
            });
        }).catch(error => {
            // Handle the error
            console.error(error);
        });

    document.querySelector("#select-marca").addEventListener("change", function () {
        document.querySelector("#select-modelo").innerHTML = "";
        fetch(GLOBAL_URL + '/modelo/listarModelosPorIdMarca?idMarca=' + document.querySelector("#select-marca").value)
            .then(response => response.json())
            .then(data => {
                data.forEach(element => {
                    var _option = document.createElement("option");
                    _option.value = element.id;
                    _option.text = element.modelo;
                    document.querySelector("#select-modelo").appendChild(_option);
                });
            }).catch(error => {
                // Handle the error
                console.error(error);
            });
    });

    const select = document.getElementById('select-anio');

    // Get the current year
    const currentYear = new Date().getFullYear();

    // Generate options for years from 1980 to current year + 1
    for (let i = currentYear + 1; i >= 1980; i--) {
        const option = document.createElement('option');
        option.value = i;
        option.textContent = i;
        select.appendChild(option);
    }

    const usos = [
        { id: 1, nombre: "Particular" },
        { id: 2, nombre: "Taxi" },
        { id: 5, nombre: "Carga" },
    ]
    usos.forEach(element => {
        var _option = document.createElement("option");
        _option.value = element.id;
        _option.text = element.nombre;
        document.querySelector("#select-uso").appendChild(_option);
    });

    fetch(GLOBAL_URL + '/vehiculo/buscarVehiculoPorPlaca?placaIngresada=' + localStorage.getItem("placa"))
        .then(response => response.json())
        .then(data => {
            console.log(data);
            localStorage.setItem("idVehiculo", data.id);
            // marca

            if (data.fidModelo.fidMarcaVehiculo != "") {
                document.querySelector("#select-marca").disabled = true;
                document.querySelector("#select-marca").value = data.fidModelo.fidMarcaVehiculo.id;
            }
            document.querySelector("#select-modelo").innerHTML = "";
            fetch(GLOBAL_URL + '/modelo/listarModelosPorIdMarca?idMarca=' + data.fidModelo.fidMarcaVehiculo.id)
                .then(response => response.json())
                .then(data => {
                    data.forEach(element => {
                        var _option = document.createElement("option");
                        _option.value = element.id;
                        _option.text = element.modelo;
                        document.querySelector("#select-modelo").appendChild(_option);
                    });

                    if (data.fidModelo != "") {
                        document.querySelector("#select-modelo").disabled = true;
                        document.querySelector("#select-modelo").value = data.fidModelo.id;
                    }
                }).catch(error => {
                    // Handle the error
                    console.error(error);
                });


            // modelos



            // numero de asientos
            document.querySelector("#txt-asientos").value = data.numeroAsientos;
            if (data.numeroAsientos != "") {
                document.querySelector("#txt-asientos").disabled = true;
            }

            // anio
            if ((data.anhoFabricacion).substring(0, 4) != "") {
                document.querySelector("#select-anio").disabled = true;
                document.querySelector("#select-anio").value = (data.anhoFabricacion).substring(0, 4);
            }
            //serie
            document.querySelector("#txt-serie").value = data.serie;
            if (data.serie != "") {
                document.querySelector("#txt-serie").disabled = true;
            }

            //uso
            if (data.fidTipoUso != "") {
                document.querySelector("#select-uso").value = data.fidTipoUso.idTipoUso;
            } else {
            }
        })
        .catch(error => {
            // Handle the error
            console.error(error);
        });

    fetch(GLOBAL_URL + '/cliente/buscarClientePorNumDocumento?numDocumentoIngresado=' + localStorage.getItem("documento"))
        .then(response => response.json())
        .then(data => {
            localStorage.setItem("idCliente", data.id);
            document.querySelector("#txt-apdPaterno").value = data.apellidoPaterno;
            if (data.serie != "") {
                document.querySelector("#txt-apdPaterno").disabled = true;
            }

            document.querySelector("#txt-apdMaterno").value = data.apellidoMaterno;
            if (data.serie != "") {
                document.querySelector("#txt-apdMaterno").disabled = true;
            }

            document.querySelector("#txt-nombres").value = data.nombre;
            if (data.serie != "") {
                document.querySelector("#txt-nombres").disabled = true;
            }
        })
        .catch(error => {
            // Handle the error
            console.error(error);
        });
};

document.querySelector("#advance").addEventListener("click", function () {
    if (stage == 3) {
        window.location.href = "/SOAT";
    }

    if (!verificacion()) {
        return;
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

function changeStage() {
    switch (stage) {
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
            loadPlans();
            break;
        case 2:
            document.querySelector(".div-informacion-vehiculo").style.display = "none";
            document.querySelector(".div-plans").style.display = "none";
            document.querySelector(".div-payment").style.display = "block";
            document.querySelector(".div-result").style.display = "none";
            document.querySelector("#descargarConstancia").style.display = "none";
            document.querySelector("#previous").style.display = "block";
            loadTarjeta();
            break;
        case 3:
            document.querySelector(".div-informacion-vehiculo").style.display = "none";
            document.querySelector(".div-plans").style.display = "none";
            document.querySelector(".div-payment").style.display = "none";
            document.querySelector(".div-result").style.display = "block";
            document.querySelector("#descargarConstancia").style.display = "block";
            document.querySelector("#previous").style.display = "none";
            guardar();
            loadResumen();
            break;
    }
}

function loadPlans() {
    fetch(GLOBAL_URL + '/planSOAT/listarActivos')
        .then(response => response.json())
        .then(data => {
            const planContainer = document.querySelector('.content-plan');
            planContainer.innerHTML = '';
            data.forEach(plan => {
                const planDiv = document.createElement('div');
                planDiv.classList.add('plan-soat');

                const heading = document.createElement('h2');
                heading.innerText = plan.nombrePlan;
                planDiv.appendChild(heading);

                const price = document.createElement('h1');
                price.innerText = `S/.${plan.precio}`;
                planDiv.appendChild(price);

                const descriptionList = document.createElement('ul');
                descriptionList.classList.add('plan-soat-description');

                const coverage = document.createElement('li');
                coverage.innerText = `Cobertura completa hasta S/.${plan.cobertura}`;
                descriptionList.appendChild(coverage);

                const discount = document.createElement('li');
                discount.innerText = 'Descuento del 30% en Repsol y Primax';
                descriptionList.appendChild(discount);

                const ley = document.createElement('li');
                ley.innerText = 'SOAT de acuerdo a la ley.';
                descriptionList.appendChild(ley);

                planDiv.appendChild(descriptionList);

                const selectButton = document.createElement('input');
                selectButton.type = 'radio';
                selectButton.name = 'select-plan';
                selectButton.classList.add('button-red-whie-back');
                selectButton.value = plan.id;
                planDiv.appendChild(selectButton);

                planContainer.appendChild(planDiv);
            });
        })
        .catch(error => {
            // Handle the error
            console.error(error);
        });
}

function loadResumen() {
    document.querySelector("#txt-res-nombre").innerText = document.querySelector("#txt-nombres").value + ", " + document.querySelector("#txt-apdPaterno").value + " " + document.querySelector("#txt-apdMaterno").value;
    document.querySelector("#txt-res-placa").innerText = localStorage.getItem("placa");
    document.querySelector("#txt-res-plan").innerText = document.querySelector('input[name="select-plan"]:checked').parentElement.querySelector('h2').innerText;
    document.querySelector("#txt-res-precio").innerText = document.querySelector('input[name="select-plan"]:checked').parentElement.querySelector('h1').innerText;
    // the date of dpFecha to teh date plus a year
    document.querySelector("#txt-res-fecha").innerText = document.querySelector("#dpFecha").value + " - " + document.querySelector("#dpFecha").value.addYears(1);
}

function loadTarjeta() {
    document.querySelectorAll('input[name="select-plan"]').forEach((plan) => {
        if (plan.checked) {
            document.querySelector("#total-a-pagar").innerText = 'Total: ' + plan.parentElement.querySelector('h1').innerText;
        }
    });
}

function verificacion() {
    const apdPaterno = document.querySelector("#txt-apdPaterno").value;
    const apdMaterno = document.querySelector("#txt-apdMaterno").value;
    const nombres = document.querySelector("#txt-nombres").value;
    const marca = document.querySelector("#select-marca").value;
    const modelo = document.querySelector("#select-modelo").value;
    const anio = document.querySelector("#select-anio").value;
    const uso = document.querySelector("#select-uso").value;
    const numAsiento = document.querySelector("#txt-asientos").value;
    const numSerie = document.querySelector("#txt-serie").value;
    const fecha = document.querySelector("#dpFecha").value;

    switch (stage) {
        case 0:
            if (apdPaterno == "" || nombres == "" || marca == "" || modelo == "" || anio == "" || uso == "" || numAsiento == "" || numSerie == "" || fecha == "") {
                alert("Falta completar campos");
                return false;
            }

            if (numAsiento < 1 || numAsiento > 20) {
                alert("El número de asientos debe ser entre 1 y 20");
                return false;
            }

            if (numSerie.length != 17) {
                alert("El número de serie debe tener 17 caracteres");
                return false;
            }

            if (!/^[A-Za-z]+$/.test(apdPaterno) || !/^[A-Za-z]+$/.test(apdMaterno) || !/^[A-Za-z ]+$/.test(nombres)) {
                if (apdMaterno != "-") {
                    alert("Los nombres y apellidos no deben contener caracteres especiales");
                    return false;
                }
            }
            break;
        case 1:
            //verificar que se haya seleccionado un plan
            var cont = 0;
            document.querySelectorAll('input[name="select-plan"]').forEach((plan) => {
                if (plan.checked) {
                    cont++;
                }
            });
            if (cont == 0) {
                alert("Debe seleccionar un plan");
                return false;
            }

            break;
        case 2:
            //verificar que se haya llenado los datos de la tarjeta
            const numTarjeta = document.querySelector("#txt-num-tarjeta").value;
            const cvv = document.querySelector("#txt-CVV").value;
            const fechaVencimiento = document.querySelector("#txt-fecha-venc").value;
            const nombreTitular = document.querySelector("#txt-tarjeta-nombre").value;
            const email = document.querySelector("#txt-email").value;
            const moneda = document.querySelector("#select-moneda").value;

            if (numTarjeta == "" || cvv == "" || fechaVencimiento == "" || nombreTitular == "" || email == "" || moneda == "") {
                alert("Falta completar campos");
                return false;
            }

            if (email.indexOf("@") == -1) {
                alert("El correo electrónico no es válido");
                return false;
            }

            if (numTarjeta.length != 16) {
                alert("El número de tarjeta debe tener 16 caracteres");
                return false;
            }

            if (!/^[0-9]+$/.test(numTarjeta)) {
                alert("El número de tarjeta debe ser numérico");
                return false;
            }

            if (cvv.length != 3) {
                alert("El CVV debe tener 3 caracteres");
                return false;
            }

            if (!/^[0-9]+$/.test(cvv)) {
                alert("El CVV debe ser numérico");
                return false;
            }

            if (!/^[A-Za-z ]+$/.test(nombreTitular)) {
                alert("El nombre del titular no debe contener caracteres especiales");
                return false;
            }

            if (fechaVencimiento.indexOf("/") != 2) {
                alert("El formato de la fecha de vencimiento no es válido (MM/YY)");
                return false;
            }

            if (fechaVencimiento.length != 5) {
                alert("El formato de la fecha de vencimiento no es válido (MM/YY)");
                return false;
            }

            if (!/^[0-9]+$/.test(fechaVencimiento.substring(0, 2)) || !/^[0-9]+$/.test(fechaVencimiento.substring(3, 5))) {
                alert("El formato de la fecha de vencimiento no es válido (MM/YY)");
                return false;
            }
            break;
        case 3:
            break;
    }
    return true;
}

function guardar() {
    const apdPaterno = document.querySelector("#txt-apdPaterno").value;
    const apdMaterno = document.querySelector("#txt-apdMaterno").value;
    const nombres = document.querySelector("#txt-nombres").value;
    const marca = document.querySelector("#select-marca").value;
    const modelo = document.querySelector("#select-modelo").value;
    const anio = document.querySelector("#select-anio").value;
    const uso = document.querySelector("#select-uso").value;
    const numAsiento = document.querySelector("#txt-asientos").value;
    const numSerie = document.querySelector("#txt-serie").value;
    const fecha = document.querySelector("#dpFecha").value;
    const plan = document.querySelector('input[name="select-plan"]:checked').value;
    const numTarjeta = document.querySelector("#txt-num-tarjeta").value;
    const cvv = document.querySelector("#txt-CVV").value;
    const fechaVencimiento = document.querySelector("#txt-fecha-venc").value;
    const nombreTitular = document.querySelector("#txt-tarjeta-nombre").value;
    const email = document.querySelector("#txt-email").value;
    const moneda = document.querySelector("#select-moneda").value;
    const dateParts = fecha.split('-');
    const yyyy = dateParts[0];
    const mm = dateParts[1];
    const dd = dateParts[2];
    const formattedDate = `${yyyy}-${mm}-${dd}`;


    const [month, year] = fechaVencimiento.split('/');

    const date = `${20+year}-${month}-01`;

    var idUsuario;
    if (localStorage.getItem('idCliente') == 0) {
        const infoCliente = {
            "nombre": nombres,
            "apellidoPaterno": apdPaterno,
            "apellidoMaterno": apdMaterno,
            "numeroDocumento": localStorage.getItem("documento"),
            "activo": true,
            "fidTipoDocumento": {
                "id": localStorage.getItem("tipoDocumento")
            },
            "fechaCreacion": formattedDate,
            "baneado": false,
            "fidRoles": {
                "idRole": 1,
                "fidPermisos": {
                    "id": 1
                }
            }

        };

        fetch(GLOBAL_URL + '/cliente/ingresar', {
            method: 'POST',
            body: JSON.stringify(infoCliente),
            headers: {
                'Content-Type': 'application/json'
            },
        })
            .then(response => response.json())
            .then(element => {
                if (element) {

                } else {
                    alert("No se ha podido guardar");
                    return;
                }
            })
            .catch(error => {
                // Handle the error
                console.error(error);
            });


        fetch(GLOBAL_URL + '/cliente/buscarClientePorNumDocumento?numDocumentoIngresado=' + localStorage.getItem("documento"))
            .then(response => response.json())
            .then(element => {
                idUsuario = element.id
            })
            .catch(error => {
                // Handle the error
                console.error(error);
            });
    } else {
        idUsuario = localStorage.getItem('idCliente');
    }

    var idVehiculo;
    if (localStorage.getItem('idVehiculo') == 0) {
        const infoVehiculo = {
            "fidTipoUso": {
                "idTipoUso": uso
            },
            "fidModelo": {
                "id": modelo
            },
            "fidPersona": {
                "id": idUsuario
            },
            "anhoFabricacion": anio + "-01-01",
            "numeroAsientos": numAsiento,
            "placa": localStorage.getItem("placa"),
            "serie": numSerie,
            "activo": true
        }

        fetch(GLOBAL_URL + '/vehiculo/insertar', {
            method: 'POST',
            body: JSON.stringify(infoVehiculo),
            headers: {
                'Content-Type': 'application/json'
            },
        })
            .then(response => response.json())
            .then(element => {
                if (element) {

                } else {
                    alert("No se ha podido guardar");
                    return;
                }
            })
            .catch(error => {
                // Handle the error
                console.error(error);
            });


        fetch(GLOBAL_URL + '/vehiculo/buscarVehiculoPorPlaca?placaIngresada=' + localStorage.getItem("placa"))
            .then(response => response.json())
            .then(data => {
                idVehiculo = data.id
            })
            .catch(error => {
                // Handle the error
                console.error(error);
            });
    } else {
        idVehiculo = localStorage.getItem('idVehiculo');
    }

    const infoTarejta = {
        "nombreMetodo": "VISA",
        "nombreTitular": nombreTitular,
        "correo": email,
        "numeroTarjeta": numTarjeta,
        "cvv": cvv,
        "fechaVencimiento": date,
        "activo": true
    }

    fetch(GLOBAL_URL + '/metodoDePago/insertar', {
        method: 'POST',
        body: JSON.stringify(infoTarejta),
        headers: {
            'Content-Type': 'application/json'
        },
    })
        .then(response => response.json())
        .then(element => {
            if (element) {

            } else {
                alert("No se ha podido guardar");
                return;
            }
        })

    const infoPoliza = {
        "fidMoneda": {
            "id": moneda
        },
        "fidMetodo": {
            "id": 1
        },
        "fidVehiculo": {
            "id": idVehiculo
        },
        "fidCliente": {
            "id": idUsuario
        },
        "precioBase": document.querySelector('input[name="select-plan"]:checked').parentElement.querySelector('h1').innerText.slice(2),
        "fechaVigenciaDesde": formattedDate,
        "fechaVigenciaFin": `${parseInt(yyyy)+1}-${mm}-${dd}`,
        "activo": true
    }

    fetch(GLOBAL_URL + '/poliza/insertar', {
        method: 'POST',
        body: JSON.stringify(infoPoliza),
        headers: {
            'Content-Type': 'application/json'
        },
    })
        .then(response => response.json())
        .then(element => {
            if (element) {

            } else {
                alert("No se ha podido guardar");
                return;
            }
        })
    alert("Se ha guardado correctamente");
    localStorage.clear();
}