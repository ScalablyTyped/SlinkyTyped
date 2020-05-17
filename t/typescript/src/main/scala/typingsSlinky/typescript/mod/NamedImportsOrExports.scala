package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.NamedImports
  - typingsSlinky.typescript.mod.NamedExports
*/
trait NamedImportsOrExports extends js.Object

object NamedImportsOrExports {
  @scala.inline
  implicit def apply(value: NamedExports): NamedImportsOrExports = value.asInstanceOf[NamedImportsOrExports]
  @scala.inline
  implicit def apply(value: NamedImports): NamedImportsOrExports = value.asInstanceOf[NamedImportsOrExports]
}

