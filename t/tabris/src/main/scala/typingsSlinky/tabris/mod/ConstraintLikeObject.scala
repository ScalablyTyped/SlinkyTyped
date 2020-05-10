package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabris.AnonOffset
  - typingsSlinky.tabris.AnonReference
*/
trait ConstraintLikeObject extends _ConstraintValue

object ConstraintLikeObject {
  @scala.inline
  def AnonOffset(reference: SiblingReferenceValue | PercentValue): ConstraintLikeObject = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintLikeObject]
  }
  @scala.inline
  def AnonReference(offset: Offset): ConstraintLikeObject = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintLikeObject]
  }
}

