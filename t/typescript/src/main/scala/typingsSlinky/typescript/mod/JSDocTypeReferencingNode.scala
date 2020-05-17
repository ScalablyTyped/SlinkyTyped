package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.JSDocVariadicType
  - typingsSlinky.typescript.mod.JSDocOptionalType
  - typingsSlinky.typescript.mod.JSDocNullableType
  - typingsSlinky.typescript.mod.JSDocNonNullableType
*/
trait JSDocTypeReferencingNode extends js.Object

object JSDocTypeReferencingNode {
  @scala.inline
  implicit def apply(value: JSDocNonNullableType): JSDocTypeReferencingNode = value.asInstanceOf[JSDocTypeReferencingNode]
  @scala.inline
  implicit def apply(value: JSDocNullableType): JSDocTypeReferencingNode = value.asInstanceOf[JSDocTypeReferencingNode]
  @scala.inline
  implicit def apply(value: JSDocOptionalType): JSDocTypeReferencingNode = value.asInstanceOf[JSDocTypeReferencingNode]
  @scala.inline
  implicit def apply(value: JSDocVariadicType): JSDocTypeReferencingNode = value.asInstanceOf[JSDocTypeReferencingNode]
}

