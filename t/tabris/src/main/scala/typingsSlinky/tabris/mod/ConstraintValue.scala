package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabris.mod.Constraint
  - typingsSlinky.tabris.mod.ConstraintArrayValue
  - typingsSlinky.tabris.mod.ConstraintLikeObject
  - typingsSlinky.tabris.mod.Offset
  - typingsSlinky.tabris.mod.PercentValue
  - typingsSlinky.tabris.mod.SiblingReferenceValue
  - typingsSlinky.tabris.tabrisBooleans.`true`
*/
trait ConstraintValue extends js.Object

object ConstraintValue {
  @scala.inline
  def `true`: typingsSlinky.tabris.tabrisBooleans.`true` = true.asInstanceOf[typingsSlinky.tabris.tabrisBooleans.`true`]
  @scala.inline
  implicit def apply(value: Constraint): ConstraintValue = value.asInstanceOf[ConstraintValue]
  @scala.inline
  implicit def apply(value: ConstraintArrayValue): ConstraintValue = value.asInstanceOf[ConstraintValue]
  @scala.inline
  implicit def apply(value: ConstraintLikeObject): ConstraintValue = value.asInstanceOf[ConstraintValue]
  @scala.inline
  implicit def apply(value: Offset): ConstraintValue = value.asInstanceOf[ConstraintValue]
  @scala.inline
  implicit def apply(value: PercentValue): ConstraintValue = value.asInstanceOf[ConstraintValue]
  @scala.inline
  implicit def apply(value: SiblingReferenceValue): ConstraintValue = value.asInstanceOf[ConstraintValue]
}

