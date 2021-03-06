package com.fly.heart.service;

import com.fly.heart.bean.Board;
import com.fly.heart.bean.Topic;
import com.fly.heart.utils.Message;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * created by tanghuosong 2017/5/28
 * description:
 **/
@Service
public interface BoardService {

    List<Board> getAllBoard();

    Board getBoardById(Long id);

    List<Map<String,Object>> getBoardWithTopics();

    Message saveBoard(Board board);

    Message deleteBoardById(Long id);

    Message updateBoard(Board board);
}
