const add=document.querySelector('.bt-adicionar');
const divAdicionar=document.querySelector('.container-adicionar');
divAdicionar.style.display='none';
add.addEventListener('click', function(evento){
	
    divAdicionar.style.display==='none'?divAdicionar.style.display='block':divAdicionar.style.display='none';
});

const inputFocus=document.querySelector('.buscar input');
const spanInput=document.querySelector('.buscar span');
	inputFocus.addEventListener('focus', function(evento){
	spanInput.classList.add('buscarFocus');
	
});

document.addEventListener('click', function(evento){	
	if(!(evento.target.tagName==='INPUT') && inputFocus.value===''){
		spanInput.classList.remove('buscarFocus');
	}
	
})
