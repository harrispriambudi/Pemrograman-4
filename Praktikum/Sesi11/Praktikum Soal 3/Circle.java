// pada class ini diimplementasikan method yang dideklarasikan pda class graphicobject
public class Circle extends GraphicObject{
	void resize(){
		System.out.println("Circle Resize");
	}
	
	void drawShape(){
		System.out.println("Circle Shape");
	}
	
	void posisition(){
		System.out.println(this.x + this.y);
	}
}
