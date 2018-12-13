public class Ejecutor 
{
	public static void main(String[] args)
	{
		Estudiante e1= new Estudiante();
		e1.mostrarInfo();
		Estudiante e2 = new Estudiante();
		e2.mostrarInfo();
		//accediendo a la variable b static de la clase creada
		e1.b++; //incrementa en 1
		//accediendo directamente desde la clase, sin instanciar un objeto
		Estudiante.b++; //incrementa en 1
		//como se puede ver la variable b static es compartida por todas las
		//instancias de la clase
		e2.mostrarInfo();
	}
}