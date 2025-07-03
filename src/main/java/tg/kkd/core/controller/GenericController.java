package tg.lt.utilities.interfaces;

import tg.lt.utilities.exceptions.CustomException;

public interface GenericControllerInterface<T, S, ID>{

    public S save(T t) throws CustomException;

    public S update(T t) throws CustomException;

    public S  delete(ID id) throws CustomException;

    public S getById(ID id) throws CustomException;

    public S getAll();


}
