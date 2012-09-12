<?php
// Solution to: http://www.codechef.com/problems/CMB01

$testCases = trim(fgets(STDIN));

for($i=0; $i<$testCases; $i++){
	$line = explode(" ", trim(fgets(STDIN)));
	
	$x = strrev($line[0]);
	$y = strrev($line[1]);
	
	echo (int)strrev($x+$y)."\n";
}

?>
