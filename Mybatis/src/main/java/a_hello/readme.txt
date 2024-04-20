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
4.	检查代码段
    xml错误
    1.   s.delete("d_dao.UserMapper.delete",1); 代码中的d_dao位置
    2.   usermapper.xml    namespace="d_dao.UserMapper"  位置
    3.    usermapper.xml    parameterType="User" 参数位置
     4.  maybatis-config.xml  <typeAliases>
		                     <package name="d_dao"/>
	                          </typeAliases>   
	  5. maybatis-config.xml
	   <mappers>
		<!-- 注意，以下路径中使用的是"/"隔开目录，而不是"."  -->
		<mapper resource="d_dao/UserMapper.xml"/>
	   </mappers>                          