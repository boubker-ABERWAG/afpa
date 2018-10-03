var nombre1 = parseInt(prompt("Nombre 1 "));
var op = prompt("Opération");
var nombre2 = parseInt(prompt("Nombre 2 "));

if(op == "+"){
    document.write("<p>" + (nombre1+nombre2) +"</p>")
}else if(op == "-"){
    document.write("<p>" + (nombre1-nombre2) +"</p>")
} else if(op == "*"){
    document.write("<p>" + (nombre1*nombre2) +"</p>")
}else if(op == "/"){
    document.write("<p>" + (nombre1/nombre2) +"</p>")
}
document.write("<h1>bonjour</h1>");
document.write("<table></table>");


