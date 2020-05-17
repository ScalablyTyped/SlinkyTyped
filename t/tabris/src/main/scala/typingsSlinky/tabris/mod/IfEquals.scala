package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - B
  - A
*/
trait IfEquals[X, Y, A, B] extends js.Object

object IfEquals {
  @scala.inline
  implicit def apply[X, Y, A, B](value: A | B): IfEquals[X, Y, A, B] = value.asInstanceOf[IfEquals[X, Y, A, B]]
}

