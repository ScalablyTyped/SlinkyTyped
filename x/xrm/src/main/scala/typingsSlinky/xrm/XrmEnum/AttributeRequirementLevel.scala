package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmStrings.none
import typingsSlinky.xrm.xrmStrings.recommended
import typingsSlinky.xrm.xrmStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait AttributeRequirementLevel extends StObject
object AttributeRequirementLevel {
  
  @scala.inline
  def None: none = "none".asInstanceOf[none]
  
  @scala.inline
  def Recommended: recommended = "recommended".asInstanceOf[recommended]
  
  @scala.inline
  def Required: required = "required".asInstanceOf[required]
}
