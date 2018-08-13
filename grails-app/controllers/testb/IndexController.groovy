package testb

import grails.beans.util.LazyBeanMap
import grails.beans.util.LazyMetaPropertyMap
import grails.databinding.SimpleMapDataBindingSource

class IndexController {

    def index() {
        def cc = SomeCompany.get(1L)
        def command = new CompanyEditCommand()
        bindData(command, cc)

        def lazyBeanMap = new LazyBeanMap(cc)
        println "LazyBeanMap keys: "+lazyBeanMap.keySet() // no address key
        def src = new SimpleMapDataBindingSource(lazyBeanMap)

        println "SimpleMapDataBindingSource.map keys: " + src.map.keySet()
        println "properties keys : "+ cc.properties.keySet()
        def lazyMetaPropertyMap = new LazyMetaPropertyMap(cc)
        println "LazyMetaPropertyMap keys : "+ lazyMetaPropertyMap.keySet()
        println "Started"

        render command.toString()
    }
}
