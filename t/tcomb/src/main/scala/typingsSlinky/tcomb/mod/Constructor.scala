package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tcomb.mod.Type[T]
  - js.Function
*/
trait Constructor[T] extends Clause

object Constructor {
  @scala.inline
  implicit def apply[T](value: js.Function): Constructor[T] = value.asInstanceOf[Constructor[T]]
  @scala.inline
  implicit def apply[T](value: Type[T]): Constructor[T] = value.asInstanceOf[Constructor[T]]
}

