package tr.com.teb.employee_app.modal.service;

import java.util.List;

public interface EntityService<T, ID> {
    T findByID(ID id);

    T update(T object);

    boolean deleteByID(ID id);

    List<T> getAll();

    boolean insert(T object);
}
