package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientBuilderTest {

    private ClientBuilder clientBuilder1;

    private ClientBuilder clientBuilder2;

    @Before
    public void setUp() {
        clientBuilder1 = new ClientBuilder().comIdentificacao("Maria", "Teste da",
                        "Silva", "987.654.321-00", "01/10/2003", 'F')
                .comContatos("maria_teste@mail.com", "Av Boa vista", "(81) 9.1111-1111");
        clientBuilder2 = new ClientBuilder();
    }

    @Test
    public void testGetEndereco() {
        Assert.assertEquals("Av Boa vista", clientBuilder1.getEndereco());
        Assert.assertNull(clientBuilder2.getEndereco());
    }

    @Test
    public void testSetEndereco() {
        Assert.assertEquals("Av Boa vista", clientBuilder1.getEndereco());
        Assert.assertNull(clientBuilder2.getEndereco());
        clientBuilder1.setEndereco("Rua teste vila");
        clientBuilder2.setEndereco("Avenida dos testes");
        Assert.assertEquals("Rua teste vila", clientBuilder1.getEndereco());
        Assert.assertEquals("Avenida dos testes", clientBuilder2.getEndereco());
    }


    @Test
    public void testSetTelefoneInvalidInput() {
        Assert.assertEquals("(81) 9.1111-1111", clientBuilder1.getTelefone());
        clientBuilder1.setTelefone("0000");
        Assert.assertEquals("(81) 9.1111-1111", clientBuilder1.getTelefone());
        clientBuilder2.setTelefone("0000");
        Assert.assertNull(clientBuilder2.getTelefone());
    }

    @Test
    public void testTelefoneRegex() {
        String regex = "(\\([0-9]{2}\\)\\s?[0-9].{4,5}-?[0-9]{3,4})|([0-9]{10,11})|([0-9]{2}\\s?[0-9]{8,9})";
        Assert.assertTrue(clientBuilder1.getTelefone().matches(regex));
    }

    @Test
    public void testGetTelefone() {
        Assert.assertEquals("(81) 9.1111-1111", clientBuilder1.getTelefone());
        Assert.assertNull(clientBuilder2.getTelefone());
    }

    @Test
    public void testGetCpf() {
        Assert.assertEquals("987.654.321-00", clientBuilder1.getCpf());
        Assert.assertNull(clientBuilder2.getCpf());
    }

    @Test
    public void testSetCpf() {
        Assert.assertEquals("987.654.321-00", clientBuilder1.getCpf());
        clientBuilder1.setCpf("999.999.999-00");
        Assert.assertEquals("999.999.999-00", clientBuilder1.getCpf());
    }

    @Test
    public void testGetNomeCompleto() {
        Assert.assertEquals("Maria Teste da Silva", clientBuilder1.getNomeCompleto());
    }

    @Test
    public void testSetNomeCompleto() {
        Assert.assertEquals("Maria Teste da Silva", clientBuilder1.getNomeCompleto());
        clientBuilder1.setNomeCompleto("Maria fernanda");
        Assert.assertEquals("Maria fernanda", clientBuilder1.getNomeCompleto());
    }

    @Test
    public void testGetPrimeiroNome() {
        Assert.assertEquals("Maria", clientBuilder1.getPrimeiroNome());
    }

    @Test
    public void testSetPrimeiroNome() {
        Assert.assertEquals("Maria", clientBuilder1.getPrimeiroNome());
        clientBuilder1.setPrimeiroNome("Fernanda");
        Assert.assertEquals("Fernanda", clientBuilder1.getPrimeiroNome());
    }

    @Test
    public void testGetNomesDoMeio() {
        Assert.assertEquals("Teste da", clientBuilder1.getNomesDoMeio());
    }

    @Test
    public void testSetNomesDoMeio() {
        Assert.assertEquals("Teste da", clientBuilder1.getNomesDoMeio());
        clientBuilder1.setNomesDoMeio("Otavio");
        Assert.assertEquals("Otavio", clientBuilder1.getNomesDoMeio());
    }

    @Test
    public void testGetSobrenome() {
        Assert.assertEquals("Silva", clientBuilder1.getSobrenome());
    }

    @Test
    public void testSetSobrenome() {
        Assert.assertEquals("Silva", clientBuilder1.getSobrenome());
        clientBuilder1.setSobrenome("Marques");
        Assert.assertEquals("Marques", clientBuilder1.getSobrenome());
    }

    @Test
    public void testGetDataDeNascimento() {
        Assert.assertEquals("01/10/2003", clientBuilder1.getDataDeNascimento());
    }

    @Test
    public void testSetDataDeNascimento() {
        Assert.assertEquals("01/10/2003", clientBuilder1.getDataDeNascimento());
        clientBuilder1.setDataDeNascimento("05/10/2001");
        Assert.assertEquals("05/10/2001", clientBuilder1.getDataDeNascimento());
    }

    @Test
    public void testGetIdadeAtual() {
        Assert.assertEquals(21, clientBuilder1.getIdadeAtual());
    }

    @Test
    public void testSetIdadeAtual() {
        Assert.assertEquals(21, clientBuilder1.getIdadeAtual());
        clientBuilder1.setIdadeAtual(18);
        Assert.assertEquals(18, clientBuilder1.getIdadeAtual());
    }

    @Test
    public void testGetGenero() {
        Assert.assertEquals('F', clientBuilder1.getGenero());
    }

    @Test
    public void testSetGenero() {
        Assert.assertEquals('F', clientBuilder1.getGenero());
        clientBuilder1.setGenero('M');
        Assert.assertEquals('M', clientBuilder1.getGenero());
    }

    @Test
    public void testGetEmail() {
        Assert.assertEquals("maria_teste@mail.com", clientBuilder1.getEmail());
    }

    @Test
    public void testSetEmail() {
        Assert.assertEquals("maria_teste@mail.com", clientBuilder1.getEmail());
        clientBuilder1.setEmail("maria@mail.com");
        Assert.assertEquals("maria@mail.com", clientBuilder1.getEmail());
    }

    @Test
    public void testSetEmailFailure() {
        Assert.assertThrows(RuntimeException.class, () -> clientBuilder2.setEmail("testegmail.com"));
    }

    @Test
    public void testEmailRegex() {
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Assert.assertTrue(clientBuilder1.getEmail().matches(regex));
    }

}