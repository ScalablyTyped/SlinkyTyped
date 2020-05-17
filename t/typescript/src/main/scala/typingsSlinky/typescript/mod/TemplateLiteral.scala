package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.TemplateExpression
  - typingsSlinky.typescript.mod.NoSubstitutionTemplateLiteral
*/
trait TemplateLiteral extends js.Object

object TemplateLiteral {
  @scala.inline
  implicit def apply(value: NoSubstitutionTemplateLiteral): TemplateLiteral = value.asInstanceOf[TemplateLiteral]
  @scala.inline
  implicit def apply(value: TemplateExpression): TemplateLiteral = value.asInstanceOf[TemplateLiteral]
}

