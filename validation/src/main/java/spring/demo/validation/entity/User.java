package spring.demo.validation.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import spring.demo.validation.valid.ValidUserIdInDB;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Table("TB_USER")
@ValidUserIdInDB()
public class User {

    @Id
    @NotNull(groups = {UserEdit.class})
    Long id;

    @Size(min = 1,max = 10,message = "name should not less than one")
    String name;
}
