/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mack.lp3.model;

/**
 *
 * @author Bruno
 */
public class User {

    private long idUsuario;
    private String nome;
    private String sobrenome;
    private char sexo;

    public User() {
    }

    public User(String nome, String sobrenome, char sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "User{" + "idUsuario=" + idUsuario + ", nome=" + nome + ", sobrenome=" + sobrenome + ", sexo=" + sexo + '}';
    }

}
