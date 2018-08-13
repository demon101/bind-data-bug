package testb

import grails.beans.util.LazyBeanMap
import grails.databinding.SimpleMapDataBindingSource

class BootStrap {

    def init = { servletContext ->
        def a = new Address(name: '111').save(failOnError:true)

        new SomeCompany(address:a, name:'Some name').save(failOnError:true)
    }
    def destroy = {
    }
}
