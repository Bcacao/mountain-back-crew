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
public class MemberModel {


    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberNick;
    private LocalDateTime memberTime;
    private String memberImage;
    private String memberGender;
}
