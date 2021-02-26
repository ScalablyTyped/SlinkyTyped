package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode
import typingsSlinky.typescript.mod.Block
import typingsSlinky.typescript.mod.ModuleBlock
import typingsSlinky.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/block", "BlockConverter")
  @js.native
  class BlockConverter protected () extends ConverterNodeComponent[SourceFile | Block | ModuleBlock] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def convert(context: Context, node: Block): Reflection = js.native
    def convert(context: Context, node: ModuleBlock): Reflection = js.native
    def convert(context: Context, node: SourceFile): Reflection = js.native
    
    var convertSourceFile: js.Any = js.native
    
    var convertStatements: js.Any = js.native
    
    var mode: SourceFileMode = js.native
  }
}
