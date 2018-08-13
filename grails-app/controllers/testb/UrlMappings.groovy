package testb

class UrlMappings {

    static mappings = {
        "/"(controller: 'index', action: 'index')

//        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
