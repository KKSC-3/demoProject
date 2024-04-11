package study.kksc.domain.board;

import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void posting() {
        
    }

    public void updateInfo() {

    }

    public void delete() {

    }
}
