abstract class GraphicObject{
	int x,y;
	void moveTo(int newValueX, int newValueY){
		x = newValueX;
		y = newValueY;
	}
	abstract void drawShape(); // pendeklarasian method-method yang tidak diimplementasikan pada class ini.
	abstract void resize();
}
