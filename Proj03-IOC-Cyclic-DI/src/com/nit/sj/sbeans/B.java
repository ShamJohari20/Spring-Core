package com.nit.sj.sbeans;

public class B {
	
	// Has A Property
		private A a;

		public void setA(A a) {
			this.a = a;
		}

		public B() {
			System.out.println("B.B()");
		}
		
		@Override
		public String toString() {
			return "from B";
		}
		
		
	}