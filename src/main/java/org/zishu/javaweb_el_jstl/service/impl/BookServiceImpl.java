package org.zishu.javaweb_el_jstl.service.impl;

import org.zishu.javaweb_el_jstl.dao.BookDao;
import org.zishu.javaweb_el_jstl.dao.impl.BookDaoImpl;
import org.zishu.javaweb_el_jstl.model.Book;
import org.zishu.javaweb_el_jstl.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDaoImpl bookDao = new BookDaoImpl();
    @Override
    public Book getbooks() {
        return bookDao.getBooks();
    }

}
