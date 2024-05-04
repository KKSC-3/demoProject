package study.kksc.global.utils;

import java.time.*;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;

@Getter
@MappedSuperclass
public abstract class BaseTimeEntity {

    @Column(name = "create_date")
    private LocalDateTime createDate;   // 생성일시

    @Column(name = "update_date")
    private LocalDateTime updateDate;  // 최종 수정일시

    @PrePersist
    public void prePersist() {
        this.createDate = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updateDate = LocalDateTime.now();
    }

}