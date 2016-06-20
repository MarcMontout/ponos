

function qcm(num,sol)
{
	var f=document.forms[num];
	var choix=0;
	choix=f.elements.length-4;
	var bin=new Array();
	for(var i=0;i<choix;i++){
		if (f.elements[i].checked){
			bin[i]=1;
		}
		else {
			bin[i]=0;}
		}

var binaire="";
binaire=bin.join("");

var erreurs=0;
for(var k=0;k<choix;k++){
	if(sol.charAt(k)!=bin[k]){ 
		erreurs++;
	}
}

if(erreurs==0){
	f.t.value="Tout est bon";
}
else{
	f.t.value=" Tu as "+erreurs+" faute(s)";
}
}

function solution(num,sol)
{
	var fo=document.forms[num];
	var choix=0;
	choix=fo.elements.length-4;
	for (var j=0;j<choix;j++){
		if (sol.charAt(j)=="1"){
			fo.elements[j].checked=true;
		}
	else{
		fo.elements[j].checked=false;
		} 
	}
}