package apifestivos.apifestivos.entidades.DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class FestivoDto {
    private String festivo;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fecha;
}
