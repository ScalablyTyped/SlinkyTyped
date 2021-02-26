package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.ExportAssignment
import typingsSlinky.typescript.mod.ExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/export", "ExportConverter")
  @js.native
  class ExportConverter protected () extends ConverterNodeComponent[ExportAssignment] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/nodes/export", "ExportDeclarationConverter")
  @js.native
  class ExportDeclarationConverter protected () extends ConverterNodeComponent[ExportDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
