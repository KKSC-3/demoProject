package study.kksc.domain.board;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private String title;
    private String content;

    @Enumerated(EnumType.STRING)
    private BoardType type;

    private boolean answerYn;

    private LocalDateTime createAt;
    private LocalDateTime lastModifiedAt;
    private String createdBy;

}
