1.导入依赖
2.建表		
		CREATE table user
		(id int PRIMARY key auto_increment,
			name varchar(20),
			birthday date,
			money double)
3.创建模型
    @AllArgsConstructor
	@NoArgsConstructor
	@Data
	public class User implements Serializable{
			private Integer id;
			private String name;
			private Date birthday;
			private Double money;
	}
4.	