package typingsSlinky.timm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
*/
trait Key extends js.Object

object Key {
  @scala.inline
  implicit def apply(value: Double): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: String): Key = value.asInstanceOf[Key]
}

