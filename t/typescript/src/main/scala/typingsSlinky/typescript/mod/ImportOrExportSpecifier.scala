package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ImportSpecifier
  - typingsSlinky.typescript.mod.ExportSpecifier
*/
trait ImportOrExportSpecifier extends TypeOnlyCompatibleAliasDeclaration

object ImportOrExportSpecifier {
  @scala.inline
  implicit def apply(value: ExportSpecifier): ImportOrExportSpecifier = value.asInstanceOf[ImportOrExportSpecifier]
  @scala.inline
  implicit def apply(value: ImportSpecifier): ImportOrExportSpecifier = value.asInstanceOf[ImportOrExportSpecifier]
}

