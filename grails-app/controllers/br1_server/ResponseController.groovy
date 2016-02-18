package br1_server

class ResponseController {

    def index() { 
	return [response:[name:"Bruno", lastname:["Carloni"]],status:200]
	}
}
