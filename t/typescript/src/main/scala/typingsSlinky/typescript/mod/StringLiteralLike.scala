package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.StringLiteral
  - typingsSlinky.typescript.mod.NoSubstitutionTemplateLiteral
*/
trait StringLiteralLike extends DeclarationName

object StringLiteralLike {
  @scala.inline
  implicit def apply(value: NoSubstitutionTemplateLiteral): StringLiteralLike = value.asInstanceOf[StringLiteralLike]
  @scala.inline
  implicit def apply(value: StringLiteral): StringLiteralLike = value.asInstanceOf[StringLiteralLike]
}

