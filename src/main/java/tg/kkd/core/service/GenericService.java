package tg.kkd.core.service;

import tg.kkd.core.exception.CustomException;

import java.util.List;

public interface GenericService<T, ID>{

    public T save(T t) throws CustomException;

    public T update(T t) throws CustomException;

    public void  delete(ID id) throws CustomException;

    public T getById(ID id);

    public List<T> getAll();

}
