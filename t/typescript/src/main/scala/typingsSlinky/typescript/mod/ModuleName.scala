package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.StringLiteral
*/
trait ModuleName extends js.Object

object ModuleName {
  @scala.inline
  implicit def apply(value: Identifier): ModuleName = value.asInstanceOf[ModuleName]
  @scala.inline
  implicit def apply(value: StringLiteral): ModuleName = value.asInstanceOf[ModuleName]
}

