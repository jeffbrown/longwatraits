package demo

import grails.compiler.traits.TraitInjector
import grails.gorm.MultiTenant
import groovy.transform.CompileStatic
import org.grails.core.artefact.DomainClassArtefactHandler

@CompileStatic
class MyTraitInjector implements TraitInjector {
    @Override
    Class getTrait() {
        MultiTenant
    }

    @Override
    String[] getArtefactTypes() {
        [DomainClassArtefactHandler.TYPE] as String[]
    }
}