package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Diarys {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id_diary;
    private LocalTime start_time;
    private LocalTime ending_time;
    @ManyToOne
    private Dentists dentists;
}
