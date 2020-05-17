package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.TypeParameter
  - typingsSlinky.typescript.mod.IndexedAccessType
*/
trait TypeVariable extends BaseType

object TypeVariable {
  @scala.inline
  implicit def apply(value: IndexedAccessType): TypeVariable = value.asInstanceOf[TypeVariable]
  @scala.inline
  implicit def apply(value: TypeParameter): TypeVariable = value.asInstanceOf[TypeVariable]
}

