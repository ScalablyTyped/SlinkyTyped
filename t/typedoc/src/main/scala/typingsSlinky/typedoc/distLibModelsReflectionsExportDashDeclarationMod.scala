package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typingsSlinky.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typingsSlinky.typescript.typescriptMod.ExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/export-declaration", JSImport.Namespace)
@js.native
object distLibModelsReflectionsExportDashDeclarationMod extends js.Object {
  @js.native
  class ExportDeclarationReflection protected () extends DeclarationReflection {
    def this(node: ExportDeclaration, parent: Reflection) = this()
    var exportDeclaration: ExportDeclaration = js.native
  }
  
}

