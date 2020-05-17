package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.Type
  - typingsSlinky.typescript.mod.IncompleteType
*/
trait FlowType extends js.Object

object FlowType {
  @scala.inline
  implicit def apply(value: IncompleteType): FlowType = value.asInstanceOf[FlowType]
  @scala.inline
  implicit def apply(value: Type): FlowType = value.asInstanceOf[FlowType]
}

