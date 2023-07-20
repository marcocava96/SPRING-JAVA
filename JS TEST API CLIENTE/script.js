// Prendo possesso degli elementi html
let demo = document.querySelector("#demo");
let btnClick = document.querySelector("#btnClick");
let codCliente = document.querySelector("#cod_cliente");

//eventListener per tasto btnClick
btnClick.addEventListener("click", verificaCodiceCliente);

//funzione per tasto btnClick
function verificaCodiceCliente() {
  //recupero tutti i clienti
  fetch("http://localhost:8080/clienti/tutti")
    .then((response) => response.json())
    .then((data) => {
      console.log(data);

      //itero array clienti e cerco un match del codice inserito
      for (let i = 0; i < data.length; i++) {
        //se trovo un match mi sposto su pagina Spettacoli
        if (codCliente.value == data[i].cod_cliente) {
          console.log("utente trovato");
          demo.innerHTML = `Codice cliente "${data[i].cod_cliente}" trovato!
          <br>
          You will be redirected to the next page in 5 seconds...`;
          setTimeout(function () {
            window.location.href = "2spettacolo.html";
          }, 5000);
          return;
        } else {
          console.log("utente NON trovato");
          demo.innerHTML = "Codice cliente NON trovato!";
        }
      }
    })
    .catch((error) => {
      // Handle any errors
      console.error("Error:", error);
    });
}
