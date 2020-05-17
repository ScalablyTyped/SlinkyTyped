package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.PropertyAccessEntityNameExpression
*/
trait EntityNameExpression
  extends DeclarationName
     with EntityNameOrEntityNameExpression

object EntityNameExpression {
  @scala.inline
  implicit def apply(value: Identifier): EntityNameExpression = value.asInstanceOf[EntityNameExpression]
  @scala.inline
  implicit def apply(value: PropertyAccessEntityNameExpression): EntityNameExpression = value.asInstanceOf[EntityNameExpression]
}

