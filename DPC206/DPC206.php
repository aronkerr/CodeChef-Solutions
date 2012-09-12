<?php
// Solution to: http://www.codechef.com/problems/DPC206

$testCases = trim(fgets(STDIN));

for($i=0; $i<$testCases; $i++){
	$line = trim(fgets(STDIN));
	$count = 0;
	
	while($line != strrev($line)){
		$line = revAdd($line);
		$count++;
	}	
	
	echo $count." ".$line."\n";
}

function revAdd($n){
	$n = $n + strrev($n);
	return $n;
}
?>
