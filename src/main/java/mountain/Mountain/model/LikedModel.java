package mountain.Mountain.model;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LikedModel {

    private int likedNo;
    private String MemberId;
    private int boardNo;
}
