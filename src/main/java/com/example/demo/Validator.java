package com.example.demo;


public class Validator {
public boolean notNullorempty(String x)
{
return !x.isEmpty();	
}
public boolean veriflong(String ch)
{
return ch.length()>3;

}
public boolean verifmail(String email)
{
return email.contains("@");	
}
public boolean verifBudget(float budget)
{
return budget>100;	
}
}
