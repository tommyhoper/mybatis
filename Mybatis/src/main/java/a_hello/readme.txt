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
4.	�������
    xml����
    1.   s.delete("d_dao.UserMapper.delete",1); �����е�d_daoλ��
    2.   usermapper.xml    namespace="d_dao.UserMapper"  λ��
    3.    usermapper.xml    parameterType="User" ����λ��
     4.  maybatis-config.xml  <typeAliases>
		                     <package name="d_dao"/>
	                          </typeAliases>   
	  5. maybatis-config.xml
	   <mappers>
		<!-- ע�⣬����·����ʹ�õ���"/"����Ŀ¼��������"."  -->
		<mapper resource="d_dao/UserMapper.xml"/>
	   </mappers>                          