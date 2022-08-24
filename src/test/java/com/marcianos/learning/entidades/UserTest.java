package com.marcianos.learning.entidades;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    private static final String NOME = "algum nome";
    private static final String EMAIL = "algum email";

    @Test
    void requiredConstructorTest() {
        //GIVEN

        //WHEN
        var usuario = new User(NOME, EMAIL);

        //THEN
        assertThat(usuario.getName()).isEqualTo(NOME);
        assertThat(usuario.getEmail()).isEqualTo(EMAIL);
    }

    @Test
    void builderConstructorTest() {
        //GIVEN

        //WHEN
        var usuario = User.builder().name(NOME).email(EMAIL).build();

        //THEN
        assertThat(usuario.getName()).isEqualTo(NOME);
        assertThat(usuario.getEmail()).isEqualTo(EMAIL);
    }

    @Test
    void equalsAndHashcodeContract() {
        EqualsVerifier.simple().forClass(User.class)
                .verify();
    }



}