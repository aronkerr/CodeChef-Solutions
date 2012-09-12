<?php
// Solution to: http://www.codechef.com/problems/HS08TEST

while(true == ($i = fgets(STDIN))){	
	list($x, $y) = split(" ", $i, 2);	
	if($x%5==0 && $x+.5 <= $y){
		$y -= $x+.5;
	}
	printf("%01.2f", $y);
}
?>
