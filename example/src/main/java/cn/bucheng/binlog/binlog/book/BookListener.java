package cn.bucheng.binlog.binlog.book;


import cn.bucheng.mysql.listener.IListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author buchengyin
 * @create 2019/7/27 11:20
 * @describe
 */
@Component
@Slf4j
public class BookListener implements IListener<BookDO> {
    @Override
    public Class getClassType() {
        return BookDO.class;
    }

    @Override
    public void saveEvent(BookDO data) {
        log.info("save book event,data:{} " , data);
    }

    @Override
    public void updateEvent(BookDO data) {
        log.info("update book event, data:{}" ,data);
    }

    @Override
    public void deleteEvent(Serializable id) {
        log.info("delete book event id:{}" ,id);
    }
}
