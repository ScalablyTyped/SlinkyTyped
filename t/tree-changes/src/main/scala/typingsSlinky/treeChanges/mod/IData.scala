package typingsSlinky.treeChanges.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.treeChanges.mod.IPlainObject
  - js.Array[typingsSlinky.treeChanges.mod.IPlainObject]
*/
trait IData extends js.Object

object IData {
  @scala.inline
  implicit def apply(value: js.Array[IPlainObject]): IData = value.asInstanceOf[IData]
  @scala.inline
  implicit def apply(value: IPlainObject): IData = value.asInstanceOf[IData]
}

