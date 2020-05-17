package typingsSlinky.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.terser.mod.ASTSymbolFunarg
  - typingsSlinky.terser.mod.ASTDefaultAssign
  - typingsSlinky.terser.mod.ASTDestructuring
  - typingsSlinky.terser.mod.ASTExpansion
*/
trait ArgType extends js.Object

object ArgType {
  @scala.inline
  implicit def apply(value: ASTDefaultAssign): ArgType = value.asInstanceOf[ArgType]
  @scala.inline
  implicit def apply(value: ASTDestructuring): ArgType = value.asInstanceOf[ArgType]
  @scala.inline
  implicit def apply(value: ASTExpansion): ArgType = value.asInstanceOf[ArgType]
  @scala.inline
  implicit def apply(value: ASTSymbolFunarg): ArgType = value.asInstanceOf[ArgType]
}

