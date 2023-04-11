package com.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dto {

//
//    private Integer id;
//    @Email
//    private String email;
//    private String phoneNumber;

    private Integer id;
//  abc12._-@123@gmail|yahoo.com|in


    @Pattern(regexp = "[A-Za-z0-9\\.\\_\\-@]+[@](?:gmail|yahoo)\\.(com|in)")
//    @Pattern(regexp = "^([\\w\\._-]+)@(gmail|yahoo)\\.(com|in)$")

//  @Pattern(regexp= "[A-Za-z\\d@$!%*?&]+$", message = "invalid email please put valid mail")
//  @Pattern(regexp= "^([\\w\\.]+)@(gmail|yahoo)\\.(com|org|net)$", message = "invalid email please put valid mail")

    //  @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "Invalid email format")
//    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$", message = "Password should contain at least one uppercase letter, one lowercase letter, one digit, and one special character")

    private String email;
    //+91-9564043499
//    @Pattern(regexp = "([+91])[9 8][0-9]{11}")
/*   (?: ... ) is a non-capturing group, which means that it groups together the two options inside the parentheses without capturing them as a separate match. This is useful in this case because we want to group together the +91 and 0 options without capturing them, since we only care about the digits that come after them.
\+91 matches the literal characters +91. This is the country code for India.
| is the alternation operator, which means "or". It allows us to specify two different options for the non-capturing group: either match +91 or 0.
0 matches the literal digit 0. This is the alternative to the +91 country code, for phone numbers within India.
? is a quantifier that makes the entire non-capturing group optional. This means that the phone number may or may not have a country code prefix. The ? quantifier applies to the entire non-capturing group, not just to the 0 option.
So the (?:\+91|0)? part of the regular expression matches an optional country code prefix of either +91 or 0, followed by the 10-digit phone number */
//    @Pattern(regexp = "^(?:\\+91|0)?\\-[8-9]\\d{9}$")
//   @Pattern(regexp = "^()")
    private String phoneNumber;
    // Sud@123#




}
