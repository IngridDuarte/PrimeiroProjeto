package com.primeiroprojeto.test.Controllers;

import com.primeiroprojeto.test.Controller.InicioController;
import org.junit.Test;
import static org.junit.Assert.*;

public class InicioControllerTest {

    @Test
    public void returns_index() {
        InicioController homeController = new InicioController();

        assertEquals("inicio", homeController.inicio());
    }
}

