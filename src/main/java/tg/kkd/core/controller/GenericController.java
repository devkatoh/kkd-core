package tg.kkd.core.controller;


import tg.kkd.core.exception.CustomException;

public interface GenericController<T, S, ID>{

    public S save(T t) throws CustomException;

    public S update(T t) throws CustomException;

    public S  delete(ID id) throws CustomException;

    public S getById(ID id) throws CustomException;

    public S getAll();


}
