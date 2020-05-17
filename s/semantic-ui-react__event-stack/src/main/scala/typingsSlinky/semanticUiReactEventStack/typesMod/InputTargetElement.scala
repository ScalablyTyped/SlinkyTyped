package typingsSlinky.semanticUiReactEventStack.typesMod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - java.lang.String
  - typingsSlinky.semanticUiReactEventStack.typesMod.TargetElement
  - typingsSlinky.react.mod.RefObject[typingsSlinky.semanticUiReactEventStack.typesMod.TargetElement]
*/
trait InputTargetElement extends js.Object

object InputTargetElement {
  @scala.inline
  implicit def apply(value: Boolean): InputTargetElement = value.asInstanceOf[InputTargetElement]
  @scala.inline
  implicit def apply(value: ReactRef[TargetElement]): InputTargetElement = value.asInstanceOf[InputTargetElement]
  @scala.inline
  implicit def apply(value: String): InputTargetElement = value.asInstanceOf[InputTargetElement]
  @scala.inline
  implicit def apply(value: TargetElement): InputTargetElement = value.asInstanceOf[InputTargetElement]
}

