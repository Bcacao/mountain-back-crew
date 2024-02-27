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
public class CrewboardModel {

    private int crewboardNo;
    private String memberId;
    private String crewboardMountain;
    private String crewboardContent;
    private LocalDateTime crewboardTime;
}
