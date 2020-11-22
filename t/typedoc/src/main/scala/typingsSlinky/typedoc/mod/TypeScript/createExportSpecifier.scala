package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ExportSpecifier
import typingsSlinky.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createExportSpecifier")
@js.native
object createExportSpecifier extends js.Object {
  
  def apply(propertyName: js.UndefOr[scala.Nothing], name: String): ExportSpecifier = js.native
  def apply(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ExportSpecifier = js.native
  /** @deprecated Use `factory.createExportSpecifier` or the factory supplied by your transformation context instead. */
  def apply(propertyName: String, name: String): ExportSpecifier = js.native
  def apply(propertyName: String, name: Identifier): ExportSpecifier = js.native
  def apply(propertyName: Identifier, name: String): ExportSpecifier = js.native
  def apply(propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
}
