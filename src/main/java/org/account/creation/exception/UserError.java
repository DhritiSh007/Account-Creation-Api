package org.account.creation.exception;

public class UserError extends RuntimeException {

 public UserError(String errorCode,String errorDescription){
     super(errorDescription);
  }
}
