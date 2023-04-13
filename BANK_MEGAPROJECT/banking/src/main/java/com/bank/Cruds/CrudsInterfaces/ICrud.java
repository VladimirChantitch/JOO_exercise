package com.bank.Cruds.CrudsInterfaces;

import java.util.List;

public interface ICrud<T> {
    public void insert(T obj);

    public T findById(Integer id);

    public List<T> findAll();

    public void update(T user);

    public void deleteById(Integer id);
}
