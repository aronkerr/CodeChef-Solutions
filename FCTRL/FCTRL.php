<?php
// Solution to: http://www.codechef.com/problems/FCTRL

$length = fgets(STDIN);

for($i=0; $i < $length; $i++){
	$line = fgets(STDIN);	
	echo Factorial($line)."\n";
}

function Factorial($line){
	$output = 0;
	$divisor = 5;
	
	while($divisor <= $line){
		$n = $line-($line%$divisor);
		$output += $n/$divisor;
		$divisor = $divisor*5;
	}
	return $output;
}
?>