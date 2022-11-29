import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "seg_user")
@Data
@NoArgsConstructor
public class SegUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codeUser;
	
	@Column(name = "username", length = 32, nullable = false)
	private String username;

	@Column(name = "name", length = 128, nullable = false)
	private String name;

	@Column(name = "email", length = 128, nullable = false)
	private String email;

	@Column(name = "status", length = 3, nullable = false)
	private String status;

	@Column(name = "creation_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	public SegUser(Integer codeUser){
		this.codeUser = codeUser;
	}

}
