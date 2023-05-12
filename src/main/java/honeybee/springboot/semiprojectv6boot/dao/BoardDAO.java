package honeybee.springboot.semiprojectv6boot.dao;


import honeybee.project.semiprojectv5.model.Board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {
    List<Board> selectBoard(int stbno);
    List<Board> selectBoard(Map<String,Object> params);
    int countBoard();
    int countBoard(Map<String,Object> params);
    int insertBoard(Board b);
    Board selectOneBoard(String bno);
}
