package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typescript.mod.ExportAssignment
import typingsSlinky.typescript.mod.ExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/export", JSImport.Namespace)
@js.native
object exportMod extends js.Object {
  @js.native
  class ExportConverter () extends ConverterNodeComponent[ExportAssignment]
  
  @js.native
  class ExportDeclarationConverter () extends ConverterNodeComponent[ExportDeclaration]
  
}

