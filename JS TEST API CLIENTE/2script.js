// Prendo possesso degli elementi html
let goBackBtn = document.querySelector("#goBackBtn");
let spettacoloSelect = document.querySelector("#spettacoloSelect");
let demo = document.querySelector("#demo");

//recupero tutti gli spettacoli
fetch("http://localhost:8080/spettacoli/tutti")
  .then((response) => response.json())
  .then((data) => {
    console.log(data);

    //creo un option per ogni element e la inserisco in spettacoloSelect
    data.forEach((element) => {
      let optionEl = document.createElement("option");
      let optionTxt = `Titolo: ${element.titolo}, Codice: ${element.cod_spettacolo}, ${element.teatro.nome}`;
      optionEl.append(optionTxt);
      spettacoloSelect.append(optionEl);

      //aggiungo Listener a ogni option
      spettacoloSelect.addEventListener("change", () => {
        console.log("bau");
        demo.innerHTML = `Ottima scelta! <br> Hai selezionato "${optionTxt}". <br>
        You will be redirected to the next page in 5 seconds...`;
        setTimeout(function () {
          window.location.href = "3teatro.html";
        }, 5000);
        return;
      });
    });
  })
  .catch((error) => {
    // Handle any errors
    console.error("Error:", error);
  });

goBackBtn.addEventListener("click", () => {
  window.location.href = "index.html";
});
