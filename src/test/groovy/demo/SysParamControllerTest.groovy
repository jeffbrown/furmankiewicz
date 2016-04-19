package demo

import grails.test.mixin.TestFor
import org.junit.Test

import static org.junit.Assert.assertEquals

@TestFor(SysParamController)
class SysParamControllerSpec {

    @Test
    public void testNoParams() {
        controller.list()
        assert "Invalid request" == controller.response.contentAsString
    }

    @Test
    public void testNoParams2() {
        controller.list()
        assert "Invalid request" == response.contentAsString
    }

    @Test
    public void testNoParams3() {
        controller.list()
        assert "Invalid request" == response.text
    }

    @Test
    public void testNoParams4() {
        controller.list()
        assertEquals "Invalid request", controller.response.contentAsString
    }


    @Test
    public void testNoParams5() {
        controller.list()
        assertEquals  "Invalid request", response.contentAsString
    }

    @Test
    public void testNoParams6() {
        controller.list()
        assertEquals  "Invalid request", response.text
    }
}
