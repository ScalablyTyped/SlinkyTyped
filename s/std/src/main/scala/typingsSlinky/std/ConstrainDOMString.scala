package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.std.ConstrainDOMStringParameters
*/
trait ConstrainDOMString extends js.Object

object ConstrainDOMString {
  @scala.inline
  implicit def apply(value: js.Array[java.lang.String]): ConstrainDOMString = value.asInstanceOf[ConstrainDOMString]
  @scala.inline
  implicit def apply(value: ConstrainDOMStringParameters): ConstrainDOMString = value.asInstanceOf[ConstrainDOMString]
  @scala.inline
  implicit def apply(value: java.lang.String): ConstrainDOMString = value.asInstanceOf[ConstrainDOMString]
}

