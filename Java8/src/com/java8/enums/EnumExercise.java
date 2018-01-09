package com.java8.enums;

public class EnumExercise {
	public enum Color {RED,BLACK,BLUE};
	public enum Season {
		WINTER(1),SUMMER(2),BLUE(3);
		private int type;
		Season(int type){
			this.type=type;
		}
		public int getType(){
			return type;
		}
	};
	
	public static void main(String[] args) {
		Color myColor=Color.BLACK;
		if (myColor==Color.BLACK) {
			System.out.println("Your Color is black");
		}
		
		for (Color aColor : Color.values()) {
			System.out.println(aColor);
		}
		
		for (Season season : Season.values()) {
			System.out.printf("%s\t%s\n",season,season.getType());
		}
		
	}
	
}

