package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmStrings.none
import typingsSlinky.xrm.xrmStrings.recommended
import typingsSlinky.xrm.xrmStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
  * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
  * @see {@link Xrm.Attributes.RequirementLevel}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.none
  - typingsSlinky.xrm.xrmStrings.recommended
  - typingsSlinky.xrm.xrmStrings.required
*/
trait AttributeRequirementLevel extends js.Object

object AttributeRequirementLevel {
  @scala.inline
  def None: none = this.cast("none")
  @scala.inline
  def Recommended: recommended = this.cast("recommended")
  @scala.inline
  def Required: required = this.cast("required")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

