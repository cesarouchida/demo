package com.example.data;

import com.example.DemoApplicationTests;
import com.example.controller.Contato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.Assert.*;

@ActiveProfiles("dev")
public class ContatoTest extends DemoApplicationTests{

    private Contato contato;

    @Before
    public void setUp()
    {
        contato = new Contato();
        contato.setId(1);
        contato.setNome("Cesar");
    }

    @Test
    public void lendoContato(){
        assertEquals("Cesar", contato.getNome());
    }
}