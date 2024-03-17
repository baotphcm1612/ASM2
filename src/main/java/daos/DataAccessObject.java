package daos;

import java.util.List;

public interface DataAccessObject<T> {
    public int insert(T variable);
    public int update(T variable);
    public int delete(T variable);

    public T getByID(T variable);
    public List<T> getAll();
}