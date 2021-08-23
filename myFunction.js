function calcAvg( num1, num2 ) {
 
var average = ( num1 + num2 ) / 2;
return average;  
 
}
 
// here is the findMax() function.
// it finds and returns the maximum of 2 numbers
function findMax( num1, num2 ) {
 
if( num1 > num2 ) {
 
return num1;
}
else {
 
return num2;
} 
}


function changePic( filename, idname ) {
	var imgsrc = "http://newton.ncc.edu/gansonj/ite154/img/" + filename + ".jpg";
	document.getElementById(idname).src = imgsrc;
}


function getValidScore( scorenum ) {
	
	var tempscore = parseInt( prompt( "Enter " + scorenum ) );
	while( tempscore < 0 || tempscore > 300 || isNaN( tempscore ) == true ) {
		
		tempscore = parseInt( prompt( "Invalid score. Enter again") );
	}
	
	return tempscore;
}