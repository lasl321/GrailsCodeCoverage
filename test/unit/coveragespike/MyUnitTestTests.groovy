package coveragespike

import grails.test.mixin.*
import grails.test.mixin.support.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class MyUnitTestTests {
    MyDomainClass myDomainClass

    void setUp() {
        // Setup logic here
    }

    void tearDown() {
        // Tear down logic here
    }

    void testIntVersion() {
        myDomainClass = new MyDomainClass()
        myDomainClass.doModuloInt(2)
    }

    void testDefVersion() {
        myDomainClass = new MyDomainClass()
        myDomainClass.doModuloDef(2)
    }
}
