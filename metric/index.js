/*
1 meter = 3.281 feet; 0.3048
1 liter = 0.264 gallon; 3.7854
1 kilogram = 2.204 pound; 0.4536
*/

let numInput = document.getElementById("number-input")
const convertBtn = document.getElementById("convert-btn")
const meterFt = document.getElementById("meter-feet")
const ftMeter = document.getElementById("feet-meter")
const litGallon = document.getElementById("liter-gallon")
const galLit = document.getElementById("gallon-liter")
const kiPound = document.getElementById("kilo-pound")
const poKilo = document.getElementById("pound-kilo")

convertBtn.addEventListener("click", function(){
    metFt()
    litGal()
    kiloPound()
})

function metFt(){
    const meterToFeet = numInput.value * 3.281
    meterFt.textContent = `${numInput.value} meters = ${meterToFeet.toFixed(3)} feet |`
    const feetToMet = 0.3048 * numInput.value
    ftMeter.textContent = `${numInput.value} feet = ${feetToMet.toFixed(3)} meters`
}

function litGal(){
    const litterToGallon = numInput.value * 0.264
    litGallon.textContent = `${numInput.value} liters = ${litterToGallon.toFixed(3)} gallons |`
    const gallonToLiter = 3.7854 * numInput.value
    galLit.textContent = `${numInput.value} gallons = ${gallonToLiter.toFixed(3)} liters`
}

function kiloPound(){
    const kiloToPound = numInput.value * 2.204
    kiPound.textContent = `${numInput.value} kilos = ${kiloToPound.toFixed(3)} pounds |`
    const poundToKilo = 0.4536 * numInput.value
    poKilo.textContent = `${numInput.value} pounds = ${poundToKilo.toFixed(3)} kilos`
}