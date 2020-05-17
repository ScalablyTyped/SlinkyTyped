package typingsSlinky.superagent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.superagent.mod.MultipartValueSingle
  - js.Array[typingsSlinky.superagent.mod.MultipartValueSingle]
*/
trait MultipartValue extends js.Object

object MultipartValue {
  @scala.inline
  implicit def apply(value: js.Array[MultipartValueSingle]): MultipartValue = value.asInstanceOf[MultipartValue]
  @scala.inline
  implicit def apply(value: MultipartValueSingle): MultipartValue = value.asInstanceOf[MultipartValue]
}

