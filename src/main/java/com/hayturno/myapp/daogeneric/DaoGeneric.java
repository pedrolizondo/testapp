package com.hayturno.myapp.daogeneric;

import java.util.List;

public interface DaoGeneric<Entity, Key> {

	/* Generic CRUD Methods */

	void create(Entity entity);

	Entity read(Key id);

	void update(Entity entity);

	void delete(Entity entity);

	List<Entity> getAll();

	List<Object[]>getAllObjets(String sql);

	void close();
}