// Import Rhino library
importPackage(java.io);
importPackage(java.lang);
var stdin = new BufferedReader( new InputStreamReader(System['in']) );

var s =  true;

while(s){
	// Read line into variable
	s = stdin.readLine();
	
	if(s == 42)break;
	
	// Output
	print(s);
}