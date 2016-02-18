package br1_server

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/response"(controller:"response", parseRequest:true){
		action = [GET:"index", POST:"postRefund", PUT:"notSupported", DELETE: "notSupported", OPTIONS:"notSupported"]
		contrains {
		}	
	}

	"/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
