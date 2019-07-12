class NullLenght{  
  void m() {  
    throw new ArithmeticException("device error");//checked exception  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handeled");}  
  }  
  public static void main(String args[]){  
	  NullLenght obj=new NullLenght();  
   obj.p();  
   System.out.println("normal flow");  
  }  
}  