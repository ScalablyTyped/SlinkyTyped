package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.ElementaryTypeName
  - typingsSlinky.solidityParserAntlr.mod.UserDefinedTypeName
  - typingsSlinky.solidityParserAntlr.mod.Mapping
  - typingsSlinky.solidityParserAntlr.mod.ArrayTypeName
  - typingsSlinky.solidityParserAntlr.mod.FunctionTypeName
*/
trait TypeName extends ASTNode

object TypeName {
  @scala.inline
  implicit def apply(value: ArrayTypeName): TypeName = value.asInstanceOf[TypeName]
  @scala.inline
  implicit def apply(value: ElementaryTypeName): TypeName = value.asInstanceOf[TypeName]
  @scala.inline
  implicit def apply(value: FunctionTypeName): TypeName = value.asInstanceOf[TypeName]
  @scala.inline
  implicit def apply(value: Mapping): TypeName = value.asInstanceOf[TypeName]
  @scala.inline
  implicit def apply(value: UserDefinedTypeName): TypeName = value.asInstanceOf[TypeName]
}

