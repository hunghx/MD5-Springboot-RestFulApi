package ra.academy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(length = 4)
    private  String studentId;
    @Column(length = 100)
    private String studentName;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private Date birthDay;
    private Boolean gender;
    @Column( columnDefinition = "text")
    private String address;

    @Column(length = 45)
    private String phoneNumber;
}
