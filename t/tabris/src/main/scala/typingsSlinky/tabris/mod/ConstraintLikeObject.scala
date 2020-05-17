package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabris.anon.Offset
  - typingsSlinky.tabris.anon.Reference
*/
trait ConstraintLikeObject extends ConstraintValue

object ConstraintLikeObject {
  @scala.inline
  implicit def apply(value: typingsSlinky.tabris.anon.Offset): ConstraintLikeObject = value.asInstanceOf[ConstraintLikeObject]
  @scala.inline
  implicit def apply(value: Reference): ConstraintLikeObject = value.asInstanceOf[ConstraintLikeObject]
}

