1.��������
2.����		
		CREATE table user
		(id int PRIMARY key auto_increment,
			name varchar(20),
			birthday date,
			money double)
3.����ģ��
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