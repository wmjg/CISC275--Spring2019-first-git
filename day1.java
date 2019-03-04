import java.util.*;

interface Move{
	public void move();
}//always public, so implementers need to be public

class C implements Move{
	public void move(){
		System.out.println("hey");
}
	public String toString(){ return "im a C";}	
}


class D implements Move{
	public void move(){
		System.out.println("ho");
	}
	public String toString(){return "im a D";}
}

class MyColl extends ArrayList{
	public Iterator iterator(){
		System.out.println("iteration");
		return super.iterator();
	}
}

class day1{
	public static void main(String[] arugala){
		C c = new C();
		Move m = c;// can be either a C or a D
		m.move();
		m = new D();
		m.move();
		Collection<Move> myMoves = new ArrayList<>();///collection. faster via iteraters.
		myMoves.add(m);
		myMoves.add(c);
		System.out.println(myMoves);
		Iterator<Move> IM = myMoves.iterator();
		while(IM.hasNext()){
			System.out.println(IM.next());
		}
		for (Move m1 : myMoves){//for each it actually using iterator too, so MYCOLL can demonstrate if we made the array list into a mycoll
			System.out.println(m1);
		}
	}
}

//somewhere write javac temp.java; java Main // to run it ... 

//now an edit to toy with git

