const menuVentas = [
  {
    name: 'Ventas',
    link: '/admin/ventas'
  },
  {
    name: 'Reporte de Ventas',
    link: '/admin/reporte-ventas'
  }
];
const menuClientes = [];
const menuSeguros = [
  {
    name: 'SOAT',
    link: '/admin/planSOAT'
  },
  {
    name: 'Seguro Vehicular',
    link: '/admin/reporte-ventas'
  }
];
const menuUsuarios = [];
const menuVehiculos = [];


const allOptions = menuVentas.concat(menuClientes, menuSeguros, menuUsuarios, menuVehiculos);

const triggers = document.getElementsByClassName('hover-trigger');
const content = document.getElementsByClassName('hover-content');
const menuList = document.querySelector('#menu-option-list');
const searchResult = document.querySelector('#search-result');


const listContainer = document.querySelector('#list-container');
const seachContainer = document.querySelector('#search-container');
const userContainer = document.querySelector('#user-container');


for (const trigger of triggers) {
  trigger.addEventListener('mouseover', () => {
    content[0].style.display = 'block';
    listContainer.style.display = 'block';
    seachContainer.style.display = 'none';
    userContainer.style.display = 'none';
  });
}

const bVentas = document.getElementById('b-ventas');
const bClientes = document.getElementById('b-clientes');
const bSeguros = document.getElementById('b-seguros');
const bUsuario = document.getElementById('b-usuarios');
const bVehiculos = document.getElementById('b-vehiculos');


bVentas.addEventListener('mouseover', () => {
  menuList.innerHTML = '';
  menuVentas.forEach(function(item) {
    const li = document.createElement("a");
    li.href = item.link;
    li.textContent = item.name;
    menuList.appendChild(li);
  });
});

bClientes.addEventListener('mouseover', () => {
  menuList.innerHTML = '';
  menuClientes.forEach(function(item) {
    const li = document.createElement("a");
    li.href = item.link;
    li.textContent = item.name;
    menuList.appendChild(li);
  });
});

bSeguros.addEventListener('mouseover', () => {
  menuList.innerHTML = '';
  menuSeguros.forEach(function(item) {
    const li = document.createElement("a");
    li.href = item.link;
    li.textContent = item.name;
    menuList.appendChild(li);
  });
});

bUsuario.addEventListener('mouseover', () => {
  menuList.innerHTML = '';
  menuUsuarios.forEach(function(item) {
    const li = document.createElement("a");
    li.href = item.link;
    li.textContent = item.name;
    menuList.appendChild(li);
  });
});

bVehiculos.addEventListener('mouseover', () => {
  menuList.innerHTML = '';
  menuVehiculos.forEach(function(item) {
    const li = document.createElement("a");
    li.href = item.link;
    li.textContent = item.name;
    menuList.appendChild(li);
  });
});



content[0].addEventListener('mouseover', () => {
  content[0].style.display = 'block';
});

content[0].addEventListener('mouseout', () => {
  content[0].style.display = 'none';
});

const navbarContent = document.querySelector('.navbar-content');
const hoverContentContainer = document.querySelector('.hover-content-container');

hoverContentContainer.style.width = navbarContent.offsetWidth + 'px';

const searchButton = document.querySelector("#search-button");
const searchBox = document.querySelector(".search-box");

searchButton.addEventListener("click", function() {
  menuList.innerHTML = "";
  content[0].style.display = 'block';
  listContainer.style.display = 'none';
  seachContainer.style.display = 'block';
  userContainer.style.display = 'none';
  searchBox.focus();
});

let searchTimer;

searchBox.addEventListener('input', function() {
  clearTimeout(searchTimer);
  searchTimer = setTimeout(function() {
    // Get search query
    const query = searchBox.value.toLowerCase();
    searchResult.innerHTML = '';
    // Loop through data object to find matching results
    let counter = 0; // Counter for limiting results to 5
    allOptions.forEach(option => {
      if (option.name.toLowerCase().includes(query)) {
        if (counter < 5) { // Limit search results to 5
          // Create a new list item for each matching result
          const listItem = document.createElement("a");
          listItem.href = option.link;
          listItem.textContent = option.name;
          searchResult.appendChild(listItem);
          counter++; // Increment counter
        } else {
          return; // Break out of loop if counter reaches 5
        }
      }
    });
  }, 500); // Set the delay time in milliseconds
});


const userButton = document.querySelector("#user-button");
userButton.addEventListener("click", function() {
  menuList.innerHTML = "";
  content[0].style.display = 'block';
  listContainer.style.display = 'none';
  seachContainer.style.display = 'none';
  userContainer.style.display = 'block';
});