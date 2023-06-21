package tr.com.example.employee_app.modal.service;

import java.util.List;

public interface EntityService<T, I> {
    T findByID(I id);

    T update(T object);

    void deleteByID(I id);

    List<T> getAll();

    T insert(T object);
}
