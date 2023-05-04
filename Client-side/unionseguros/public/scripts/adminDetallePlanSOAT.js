//const GLOBAL_URL = 'https://apimocha.com/unionseguros';
const GLOBAL_URL = 'http://localhost:8080/api/v1';

window.onload = function () {
    if (localStorage.getItem('plan-id') == null) {
        document.querySelector('#titulo').innerHTML = 'Nuevo Plan SOAT';
    }
    document.querySelector('#id').innerHTML = localStorage.getItem('plan-id');
    document.querySelector('#txt-nombre').value = localStorage.getItem('plan-nombre');
    document.querySelector('#txt-cobertura').value = localStorage.getItem('plan-cobertura');
    document.querySelector('#txt-precio').value = localStorage.getItem('plan-precio');
    document.querySelector('#select-estado').value = localStorage.getItem('plan-activo');;

    document.querySelector('#regresar').addEventListener('click', function () {
        localStorage.clear();
        window.location.href = '/admin/PlanSOAT';
    });


    document.querySelector('#btn-guardar').addEventListener('click', function () {
        if (document.querySelector('#id').innerHTML == "") {
            const plan = {
                "cobertura": document.querySelector('#txt-cobertura').value,
                "precio": document.querySelector('#txt-precio').value,
                "nombrePlan": document.querySelector('#txt-nombre').value,
                "activo": document.querySelector('#select-estado').value
            }
            fetch(GLOBAL_URL + '/planSOAT/insertar', {
                method: 'POST',
                body: JSON.stringify(plan),
                headers: {
                    'Content-Type': 'application/json'
                },
            })
                .then(response => response.json())
                .then(element => {
                    if (element) {
                        alert("Se ha guardado correctamente");
                        window.location.href = '/admin/PlanSOAT';
                    } else {
                        alert("No se ha podido guardar");
                        return;
                    }
                })
                .catch(error => {
                    // Handle the error
                    console.error(error);
                });
        } else {
            const plan = {
                "id": document.querySelector('#id').innerHTML,
                "cobertura": document.querySelector('#txt-cobertura').value,
                "precio": document.querySelector('#txt-precio').value,
                "nombrePlan": document.querySelector('#txt-nombre').value,
                "activo": document.querySelector('#select-estado').value
            }

            fetch(GLOBAL_URL + '/planSOAT/modificar', {
                method: 'PUT',
                body: JSON.stringify(plan),
                headers: {
                    'Content-Type': 'application/json'
                },
            })
                .then(response => response.json())
                .then(element => {
                    if (element) {
                        alert("Se ha guardado correctamente");
                        window.location.href = '/admin/PlanSOAT';
                    } else {
                        alert("No se ha podido guardar");
                        return;
                    }
                })
                .catch(error => {
                    // Handle the error
                    console.error(error);
                });
        }

    });
};


