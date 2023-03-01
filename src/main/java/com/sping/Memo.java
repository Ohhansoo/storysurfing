package com.sping;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="tbl_memo")
@Entity
public class Memo {
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(length = 200,nullable = false)
    private String memoText;
}
