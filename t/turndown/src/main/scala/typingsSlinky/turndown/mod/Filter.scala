package typingsSlinky.turndown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.turndown.mod.TagName
  - js.Array[typingsSlinky.turndown.mod.TagName]
  - typingsSlinky.turndown.mod.FilterFunction
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  implicit def apply(value: js.Array[TagName]): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: FilterFunction): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: TagName): Filter = value.asInstanceOf[Filter]
}

