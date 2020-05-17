package typingsSlinky.urijs.uritemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.urijs.uritemplateMod.URITemplateLiteral
  - typingsSlinky.urijs.uritemplateMod.URITemplateExpression
*/
trait URITemplatePart extends js.Object

object URITemplatePart {
  @scala.inline
  implicit def apply(value: URITemplateExpression): URITemplatePart = value.asInstanceOf[URITemplatePart]
  @scala.inline
  implicit def apply(value: URITemplateLiteral): URITemplatePart = value.asInstanceOf[URITemplatePart]
}

