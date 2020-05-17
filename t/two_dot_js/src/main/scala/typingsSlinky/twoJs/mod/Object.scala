package typingsSlinky.twoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twoJs.mod.Path
  - typingsSlinky.twoJs.mod.Group
  - typingsSlinky.twoJs.mod.Text
*/
trait Object extends js.Object

object Object {
  @scala.inline
  implicit def apply(value: Group): Object = value.asInstanceOf[Object]
  @scala.inline
  implicit def apply(value: Path): Object = value.asInstanceOf[Object]
  @scala.inline
  implicit def apply(value: Text): Object = value.asInstanceOf[Object]
}

