import org.junit.jupiter.api.Test;
import org.zishu.javaweb_el_jstl.dao.impl.BookDaoImpl;
import org.zishu.javaweb_el_jstl.model.Book;

/**
 * 对BookDao其中的方法进行测试
 * 《单元测试》
 */
public class BookDaoTest {

    @Test
    public void t1(){//测试get方法
        BookDaoImpl bookDao = new BookDaoImpl();
        Book book = bookDao.getBooks();
        System.out.println(book);
    }

    @Test
    public void t2(){//待定

    }
}
