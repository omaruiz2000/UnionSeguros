//const GLOBAL_URL = 'https://apimocha.com/unionseguros';
const GLOBAL_URL = 'http://localhost:8080/api/v1';   


var planes;
window.onload = function () {
    fetch(GLOBAL_URL + '/planSOAT/ListarTodos')
        .then(response => response.json())
        .then(data => {
            
            
            planes = data;
            crearLaTabla(data);
        })
        .catch(error => {
            // Handle the error
            console.error(error);
        });

        document.querySelector('#txt-buscar').addEventListener('input', function () {
            clearTimeout(searchTimer);
            searchTimer = setTimeout(function () {
                const query = document.querySelector('#txt-buscar').value.toLowerCase();
                searchResult.innerHTML = '';
                var planesSotada=[];
                planes.forEach(option => {
                    if (
                        option.id.toString().toLowerCase().includes(query) ||
                        option.cobertura.toString().toLowerCase().includes(query) ||
                        option.precio.toString().toLowerCase().includes(query) ||
                        option.nombrePlan.toString().toLowerCase().includes(query) 
                    ) {
                        planesSotada.push(option);
                    }
                });
                crearLaTabla(planesSotada)
            }, 500);
        });
        
        document.querySelector('#btn-nuevo').addEventListener('click', function () {
            localStorage.clear();
            window.location.href = '/admin/detallePlanSOAT';
        });
        

        document.querySelector('#sort').addEventListener('change', function () {
            if (this.value == 'id') {
                planes.sort(function (a, b) {
                    if (a.id > b.id) {
                        return 1;
                    }
                    if (a.id < b.id) {
                        return -1;
                    }
                    return 0;
                });
            }else if (this.value == 'nombre') {
                planes.sort(function (a, b) {
                    if (a.nombrePlan > b.nombrePlan) {
                        return 1;
                    }
                    if (a.nombrePlan < b.nombrePlan) {
                        return -1;
                    }
                    return 0;
                });
            }else if (this.value == 'precio') {
                planes.sort(function (a, b) {
                    if (a.precio > b.precio) {
                        return 1;
                    }
                    if (a.precio < b.precio) {
                        return -1;
                    }
                    return 0;
                });
            }else if (this.value == 'cobertura') {
                planes.sort(function (a, b) {
                    if (a.cobertura > b.cobertura) {
                        return 1;
                    }
                    if (a.cobertura < b.cobertura) {
                        return -1;
                    }
                    return 0;
                });
            }else if (this.value == 'activo') {
                planes.sort(function (a, b) {
                    if (a.activo > b.activo) {
                        return 1;
                    }
                    if (a.activo < b.activo) {
                        return -1;
                    }
                    return 0;
                });
            } else if (this.value == 'idDesc') {
                planes.sort(function (a, b) {
                    if (a.id < b.id) {
                        return 1;
                    }
                    if (a.id > b.id) {
                        return -1;
                    }
                    return 0;
                });
            }else if (this.value == 'nombreDesc') {
                planes.sort(function (a, b) {
                    if (a.nombrePlan < b.nombrePlan) {
                        return 1;
                    }
                    if (a.nombrePlan > b.nombrePlan) {
                        return -1;
                    }
                    return 0;
                });
            }else if (this.value == 'precioDesc') {
                planes.sort(function (a, b) {
                    if (a.precio < b.precio) {
                        return 1;
                    }
                    if (a.precio > b.precio) {
                        return -1;
                    }
                    return 0;
                });
            }else if (this.value == 'coberturaDesc') {
                planes.sort(function (a, b) {
                    if (a.cobertura < b.cobertura) {
                        return 1;
                    }
                    if (a.cobertura > b.cobertura) {
                        return -1;
                    }
                    return 0;
                });
            }else if (this.value == 'activoDesc') {
                planes.sort(function (a, b) {
                    if (a.activo < b.activo) {
                        return 1;
                    }
                    if (a.activo > b.activo) {
                        return -1;
                    }
                    return 0;
                });
            }

            crearLaTabla(planes);
        });

}


function crearLaTabla(data){
    const table = document.querySelector('#table-body');
    table.innerHTML = '';
    data.forEach(plan => {
        const tableRow = document.createElement('tr');
        tableRow.classList.add('table-row');

        const ID = document.createElement('td');
        ID.classList.add('td-id');
        ID.innerText = plan.id;
        tableRow.appendChild(ID);

        const nombrePlan = document.createElement('td');
        nombrePlan.classList.add('td-nombre');
        nombrePlan.innerText = plan.nombrePlan;
        tableRow.appendChild(nombrePlan);

        const precio = document.createElement('td');
        precio.classList.add('td-precio');
        precio.innerText = plan.precio;
        tableRow.appendChild(precio);

        const cobertura = document.createElement('td');
        cobertura.classList.add('td-cobertura');
        cobertura.innerText = plan.cobertura;
        tableRow.appendChild(cobertura);

        const activo = document.createElement('td');
        activo.classList.add('td-activo');
        activo.innerText = plan.activo;
        tableRow.appendChild(activo);

        //add edit button
        const button = document.createElement('td');
        const editButton = document.createElement('button');
        editButton.classList.add('btn-edit');
        editButton.innerText = 'Editar';
        editButton.addEventListener('click', () => {
        });
        button.appendChild(editButton);
        tableRow.appendChild(button);

        table.appendChild(tableRow);
    });
    const btnEdits = document.querySelectorAll('.btn-edit');
    btnEdits.forEach(btn => {
        btn.addEventListener('click', function () {
        const plan = {
            "id": document.querySelector('.btn-edit').parentElement.parentElement.querySelector('.td-id').innerText,
            "nombrePlan": document.querySelector('.btn-edit').parentElement.parentElement.querySelector('.td-nombre').innerText,
            "precio": document.querySelector('.btn-edit').parentElement.parentElement.querySelector('.td-precio').innerText,
            "cobertura": document.querySelector('.btn-edit').parentElement.parentElement.querySelector('.td-cobertura').innerText,
            "activo": document.querySelector('.btn-edit').parentElement.parentElement.querySelector('.td-activo').innerText
        }
        localStorage.setItem('plan-id', plan.id);
        localStorage.setItem('plan-nombre', plan.nombrePlan);
        localStorage.setItem('plan-precio', plan.precio);
        localStorage.setItem('plan-cobertura', plan.cobertura);
        localStorage.setItem('plan-activo', plan.activo);

        window.location.href = '/admin/detallePlanSOAT';
    });
});
}