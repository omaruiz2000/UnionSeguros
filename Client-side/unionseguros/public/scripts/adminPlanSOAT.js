const GLOBAL_URL = 'https://apimocha.com/unionseguros';

window.onload = function () {
    fetch(GLOBAL_URL + '/api/soat/planes')
    .then(response => response.json())
    .then(data => {
        const table = document.querySelector('#table-body');
        table.innerHTML = '';
        data.forEach(plan => {
            const tableRow = document.createElement('tr');
            tableRow.classList.add('table-row');

            const ID = document.createElement('td');
            ID.innerText = plan.ID;
            tableRow.appendChild(ID);

            const nombrePlan = document.createElement('td');
            nombrePlan.innerText = plan.nombrePlan;
            tableRow.appendChild(nombrePlan);

            const precio = document.createElement('td');
            precio.innerText = plan.precio;
            tableRow.appendChild(precio);

            const cobertura = document.createElement('td');
            cobertura.innerText = plan.cobertura;
            tableRow.appendChild(cobertura);

            const activo = document.createElement('td');
            activo.innerText = plan.activo;
            tableRow.appendChild(activo);

            //add edit button
            const editButton = document.createElement('button');
            editButton.classList.add('btn-edit');
            editButton.innerText = 'Editar';
            editButton.addEventListener('click', () => {
            });
            tableRow.appendChild(editButton);
            
            table.appendChild(tableRow);
        });
    })
    .catch(error => {
        // Handle the error
        console.error(error);
    });

}