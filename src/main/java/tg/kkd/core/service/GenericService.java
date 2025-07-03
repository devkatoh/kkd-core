package tg.lt.utilities.interfaces;

import tg.lt.entities.users.Supervisor;
import tg.lt.utilities.exceptions.CustomException;

import java.util.List;

public interface GenericInterface <T, ID>{

    public T save(T t) throws CustomException;

    public T update(T t) throws CustomException;

    public void  delete(ID id) throws CustomException;

    public T getById(ID id);

    public List<T> getAll();

}
