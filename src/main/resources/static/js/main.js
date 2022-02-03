const janela=document.querySelector('.janela');
const editar=document.querySelector('.a-edit');
const add=document.querySelector('.bt-adicionar');
const divAdicionar=document.querySelector('.container-adicionar');
divAdicionar.style.display='none';
editar.addEventListener('click', (evento)=>{
    evento.preventDefault();
    console.log(editar);
    console.log('teste');
    janela.style.display='block';

});
document.addEventListener('click', (evento)=>{
    if(evento.target.classList.contains('fechar') || evento.target.classList.contains('bt-enviar')){
        janela.style.display='none';
    }
    console.log(evento.target);
});
add.addEventListener('click', function(evento){
    divAdicionar.style.display==='none'?divAdicionar.style.display='block':divAdicionar.style.display='none';
})
