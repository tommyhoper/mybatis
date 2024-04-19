package b_parameter;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Foo implements Serializable{
		private Integer id;
		private String name;
		private Date birthday;
		private Double money;
}
