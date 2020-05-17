package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.NamespaceExport
  - typingsSlinky.typescript.mod.NamedExports
*/
trait NamedExportBindings extends js.Object

object NamedExportBindings {
  @scala.inline
  implicit def apply(value: NamedExports): NamedExportBindings = value.asInstanceOf[NamedExportBindings]
  @scala.inline
  implicit def apply(value: NamespaceExport): NamedExportBindings = value.asInstanceOf[NamedExportBindings]
}

