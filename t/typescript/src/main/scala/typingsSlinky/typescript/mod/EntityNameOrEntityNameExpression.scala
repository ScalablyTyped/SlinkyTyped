package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.EntityName
  - typingsSlinky.typescript.mod.EntityNameExpression
*/
trait EntityNameOrEntityNameExpression extends js.Object

object EntityNameOrEntityNameExpression {
  @scala.inline
  implicit def apply(value: EntityName): EntityNameOrEntityNameExpression = value.asInstanceOf[EntityNameOrEntityNameExpression]
  @scala.inline
  implicit def apply(value: EntityNameExpression): EntityNameOrEntityNameExpression = value.asInstanceOf[EntityNameOrEntityNameExpression]
}

