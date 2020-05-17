package typingsSlinky.treeify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.treeify.mod.TreeObject
*/
trait TreeValue extends js.Object

object TreeValue {
  @scala.inline
  implicit def apply(value: String): TreeValue = value.asInstanceOf[TreeValue]
  @scala.inline
  implicit def apply(value: TreeObject): TreeValue = value.asInstanceOf[TreeValue]
}

