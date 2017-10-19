/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mack.lp3.persistence;

import java.util.List;

/**
 *
 * @author Bruno
 */
public interface GenericDAO<E>{
    
    public boolean create(E e);
    
    public List findAll();
    
    public E findById(long id);
    
    public boolean update(E e);
    
    public boolean delete(E e);
}
