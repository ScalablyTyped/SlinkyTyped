package typingsSlinky.timm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[js.Any]
  - js.Object
*/
trait ArrayOrObject extends js.Object

object ArrayOrObject {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): ArrayOrObject = value.asInstanceOf[ArrayOrObject]
  @scala.inline
  implicit def apply(value: js.Object): ArrayOrObject = value.asInstanceOf[ArrayOrObject]
}

