package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.NoSubstitutionTemplateLiteral
  - typingsSlinky.typescript.mod.TemplateHead
  - typingsSlinky.typescript.mod.TemplateMiddle
  - typingsSlinky.typescript.mod.TemplateTail
*/
trait TemplateLiteralToken extends js.Object

object TemplateLiteralToken {
  @scala.inline
  implicit def apply(value: NoSubstitutionTemplateLiteral): TemplateLiteralToken = value.asInstanceOf[TemplateLiteralToken]
  @scala.inline
  implicit def apply(value: TemplateHead): TemplateLiteralToken = value.asInstanceOf[TemplateLiteralToken]
  @scala.inline
  implicit def apply(value: TemplateMiddle): TemplateLiteralToken = value.asInstanceOf[TemplateLiteralToken]
  @scala.inline
  implicit def apply(value: TemplateTail): TemplateLiteralToken = value.asInstanceOf[TemplateLiteralToken]
}

