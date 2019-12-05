package typingsSlinky.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
  * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
  * @see {@link XrmEnum.AttributeRequirementLevel}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.none
  - typings.xrm.xrmStrings.recommended
  - typings.xrm.xrmStrings.required
*/
trait RequirementLevel extends js.Object

object RequirementLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.xrm.xrmStrings.none = this.cast("none")
  @scala.inline
  def recommended: typingsSlinky.xrm.xrmStrings.recommended = this.cast("recommended")
  @scala.inline
  def required: typingsSlinky.xrm.xrmStrings.required = this.cast("required")
}

