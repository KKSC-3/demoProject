package study.kksc.domain.board;

import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void posting() {
        
    }

    @Transactional
    public void update(Long id) {
        Optional<Board> byId = boardRepository.findById(id);
        Board board = byId.get();
        // update 로직 삽입 예정 , 요청 파라미터에 requestDto 삽입 예정 
    }

    @Transactional
    public void delete(Long id){
        boardRepository.deleteById(id);
    }
}
