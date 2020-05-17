package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.transformMod.FieldParam
  - typingsSlinky.vegaTypings.exprMod.ExprRef
*/
trait TransformField extends FieldRef

object TransformField {
  @scala.inline
  implicit def apply(value: ExprRef): TransformField = value.asInstanceOf[TransformField]
  @scala.inline
  implicit def apply(value: FieldParam): TransformField = value.asInstanceOf[TransformField]
  @scala.inline
  implicit def apply(value: SignalRef): TransformField = value.asInstanceOf[TransformField]
}

