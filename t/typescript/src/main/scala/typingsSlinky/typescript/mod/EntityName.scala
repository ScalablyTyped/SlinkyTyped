package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.QualifiedName
*/
trait EntityName
  extends EntityNameOrEntityNameExpression
     with ModuleReference

object EntityName {
  @scala.inline
  implicit def apply(value: Identifier): EntityName = value.asInstanceOf[EntityName]
  @scala.inline
  implicit def apply(value: QualifiedName): EntityName = value.asInstanceOf[EntityName]
}

