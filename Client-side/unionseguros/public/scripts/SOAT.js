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