package typingsSlinky.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.SingleTypeDescription
  - typingsSlinky.webidl2.mod.UnionTypeDescription
*/
trait IDLTypeDescription extends js.Object

object IDLTypeDescription {
  @scala.inline
  implicit def apply(value: SingleTypeDescription): IDLTypeDescription = value.asInstanceOf[IDLTypeDescription]
  @scala.inline
  implicit def apply(value: UnionTypeDescription): IDLTypeDescription = value.asInstanceOf[IDLTypeDescription]
}

