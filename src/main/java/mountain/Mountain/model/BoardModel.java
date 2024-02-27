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
public class BoardModel {

    private int boardNo;
    private String boardContent;
    private LocalDateTime boardTime;
    private String memberId;
    private int imageNo;


}
