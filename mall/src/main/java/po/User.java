package po;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    @NotBlank
    private String userName;

    @Column(name = "pass_word")
    @NotBlank
    private String password;

    @Column(name = "real_name")
    @NotBlank
    private String realName;

    @Column(name = "phone")
    private int phone;

    @OneToMany(mappedBy = "user")
    private List<Order> orderList;
}
