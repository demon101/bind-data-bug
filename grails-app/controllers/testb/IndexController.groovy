package testb

import grails.beans.util.LazyBeanMap
import grails.databinding.SimpleMapDataBindingSource

class IndexController {

    def index() {
        def cc = SomeCompany.get(1L)
        def command = new CompanyEditCommand()
        bindData(command, cc)

        def lazyBeanMap = new LazyBeanMap(cc)
        println lazyBeanMap.keySet() // no address key
        def src = new SimpleMapDataBindingSource(lazyBeanMap)

        println src.map.keySet()
        println "Started"

        render command.toString()
    }
}
