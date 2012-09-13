<?php
for($i=0;$i<10;$i++){
	echo uMod()."\n";
}

function uMod(){
	$n = array();
	
	for($i=0;$i<10;$i++){
		array_push($n, trim(fgets(STDIN))%42);
	}
	
	return count(array_unique($n));
}
?>