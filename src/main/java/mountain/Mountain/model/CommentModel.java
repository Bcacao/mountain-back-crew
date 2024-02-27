package mountain.Mountain.model;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentModel {

    private int commentNo;
    private int boardNo;
    private String memberId;
    private String commentContent;
    private LocalDateTime commentTime;
}
