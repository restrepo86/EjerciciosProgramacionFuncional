/* Clase Persona y metodo para sumarle un  numero
del prametro a a la edad de la clase persona
*/

case class Persona(nombre: String, edad: Int) {}

implicit def fPersona: Persona => Int = _.edad
def sum(a: Int)(implicit b: Int): Int = a + b

implicit val i: Int = Persona("Persona", 21)
// le suma 2 a la edad en la siguiente funcion
sum(2)

