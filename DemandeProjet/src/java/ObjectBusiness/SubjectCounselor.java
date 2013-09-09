package ObjectBusiness;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdo
 */

public class SubjectCounselor {
   private String subjectName; 
   private String description; 
   private String counselorID; 
   private String firstName;
   private String nickName; 
   private String lastName; 
   private String telephone; 
   private String email; 
   private String memberSince; 
   // create setter methods 
   public void setSubjectName(String subject) 
   { this.subjectName = subject; 
   } 
   public void setDescription(String desc) { 
       this.description = desc; 
   } 
   public void setCounselorID(String counsId) { 
       this.counselorID = counsId;  
   } 
   public void setFirstName(String first) { 
       this.firstName = first;  
   }
   public void setNickName(String nick) { 
       this.nickName = nick; 
   }
   public void setLastName(String last) { 
       this.lastName = last; 
   }  
   public void setTelephone(String phone) { 
       this.telephone = phone; 
   }
   public void setEmail(String email) { 
       this.email = email; 
   }
   public void setMemberSince(String mem){ 
       this.memberSince = mem; 
   } 
   // create getter methods 
   public String getSubjectName() {
       return subjectName; 
   }
   public String getDescription()   {  
       return description; 
   } 
public String getCounselorName() 
{ 
    String counselorName = firstName + " "  + nickName + " " + lastName; 
return counselorName; 
}
public String getMemberSinceDate() 
{ 
    return memberSince; 
}

public String getTelephone() 
{  return telephone;
}
public String getEmail() 
{ 
    return email;
} 
    
}
