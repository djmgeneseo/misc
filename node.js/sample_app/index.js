/*	1. Import the Express module
	2. Initialize the Express object
	3. Add a handler for GET /notes, which responds to the request with a JSON object with sample notes
	4. Tell Express to listen for HTTP requests on port 3000
*/

var express = require('express')

var app = express()

app.get('/notes', function(req, res) {
	res.json({notes: "This is your notebook. Edit this to start saving your notes!"})
});

app.listen(3000);

// type node index.js into command line
// type http://localhost:3000/notes into URL

/*
https://docs.microsoft.com/en-us/azure/app-service-mobile/app-service-mobile-node-backend-how-to-use-server-sdk
	var express = require('express'),
     azureMobileApps = require('azure-mobile-apps');

 	var app = express(),
     mobile = azureMobileApps();

 	// Define a TodoItem table
 	mobile.tables.add('TodoItem');

 	// Add the mobile API so it is accessible as a Web API
 	app.use(mobile);

 	// Start listening on HTTP
 	app.listen(process.env.PORT || 3000);
*/