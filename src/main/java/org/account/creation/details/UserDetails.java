package org.account.creation.details;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    String userName;
    String password;
    int pin;

    public boolean fetchUserDetailsByUserName(String user){
        return userName.equals(user);
    }


}
