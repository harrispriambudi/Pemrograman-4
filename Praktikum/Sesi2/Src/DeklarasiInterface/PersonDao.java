public interface PersonDao
	{
	void save(Person p);
	void delete(Person p);
	Person getById(Long id);
	}